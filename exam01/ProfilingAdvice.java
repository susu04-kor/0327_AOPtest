package com.bit.exam01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class ProfilingAdvice {
	
	public void afterThrowing(JoinPoint joinPoint) {	//오류를 일부러 내보는 메소드
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "가 비정상적으로 종료 하였습니다.");
	}
	
	public void afterReturning(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "가 정상 완료 하였습니다.");
	}
	
	
	public void after(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "가 완료 후 입니다.");
	}
	
	
	/*
	public void before() {
		System.out.println("타깃이 되는 메소드 실행하기 전입니다.");
	}
	*/
	
	public void before(JoinPoint joinPoint) {	
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println("타깃이 되는 메소드 실행하기 전입니다.");
	}
	
	public Object pro(ProceedingJoinPoint joinPoint) {
		Object re = null;
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName+" 시작");
		long start = System.currentTimeMillis();	//동작하기 전에 시간을 알아놓으려고! System.currentTimeMillis();현재 시간을 밀리세컨으로 반환함
		
		try {
			
			re = joinPoint.proceed();		//타깃메소드를 알려주는 메소드 
			
		}catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(methodName +" 종료");
		
		long finish = System.currentTimeMillis();
		System.out.println("걸린시간: " +(finish-start));
		
		return re;
	}
}

package com.bit.dao;

import java.util.ArrayList;

import com.bit.exam01.ProfilingAdvice;

public class MemberDao {
	
	//private ProfilingAdvice advice = new ProfilingAdvice();
	
	public int insertMember(String name, int age) {
//		advice.pro();
		System.out.println("회원을 등록하였습니다.");
//		advice.pro();
		return 1;
	}
	
	public void updateMember() {
		System.out.println("회원을 수정하였습니다.");
	}
	
	public ArrayList<String> listMember(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("이순신");
		list.add("유관순");
		list.add("김유신");
		return list;
	}
	
}

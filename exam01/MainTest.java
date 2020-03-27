package com.bit.exam01;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.dao.GoodsDao;
import com.bit.dao.MemberDao;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context
			= new ClassPathXmlApplicationContext("com/bit/exam01/beans.xml");
		
		MemberDao mDao = (MemberDao)context.getBean("mDao");
		GoodsDao gDao = (GoodsDao)context.getBean("gDao");
		
		mDao.insertMember("유관순", 20);
		mDao.updateMember();
		ArrayList<String> memberList = mDao.listMember();
		for(String member: memberList) {
			System.out.println(member);
		}

		gDao.insertGoods("옥수수", 3000);
		ArrayList<String> goodsList = gDao.list();
		for(String item : goodsList) {
			System.out.println(item);
		}
		
	}

}

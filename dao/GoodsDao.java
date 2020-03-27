package com.bit.dao;

import java.util.ArrayList;

public class GoodsDao {
	public int insertGoods(String item, int price) {
		System.out.println("상품을 등록하였습니다.");
		return 1;
	}
	
	public ArrayList<String> list(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("포도");
		list.add("오렌지");
		System.out.println(list.get(100));	//list.get(100) - 의도적으로 예외 발생 코드를 작성해봄
		return list;
	}
	
	//com.bit.dao에 있는 어떤 클래스에 어떤 메소드라도 타깃으로 잡으려는 것 (물론, 세부적으로 제한할 수 있다)
}

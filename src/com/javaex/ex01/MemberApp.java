package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member memberjws = new Member ();
		
		memberjws.setName("정우성");
		memberjws.setId("jws");
		memberjws.setPoint(50000);
		
		
		Member memberyjs = new Member();
		
		memberyjs.setName("유재석");
		memberyjs.setId("yjs");
		memberyjs.setPoint(30000);
		
		
		Member memberlhr = new Member();
		
		memberlhr.setName("이효리");
		memberlhr.setId("lhr");
		memberlhr.setPoint(40000);
		
		
		memberjws.showInfo();
		memberyjs.showInfo();
		memberlhr.showInfo();
		
		
	}

}

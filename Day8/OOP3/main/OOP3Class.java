package main;

import dto.MemberDto;

public class OOP3Class {

	public static void main(String[] args) {
		/*
		    Object Oriented Programming
		    
		    1. 은닉성(캡슐화) - 변수를 외부에 노출하는 규칙
		    2. 상속성       - 상위(super) 클래스에서 좋은 기능(메소드)등을 상속받는것을 의미
		    3. 다형성       - 상속을 받은 후에 다양한 처리
		    
		    Encapsulation == 은닉성, 캡슐화
		    
		    접근지정자
		    private : 개인적인
		    public : 대중적인
		    protected : 상속에 관련한 처리
		   
		*/
		
		MemberDto mem = new MemberDto();
		
		// mem.number = 1;
		mem.name = "홍길동";
		// mem.height = 180.1;
		
		mem.setNumber(124);
		
		int n = mem.getNumber();
		
		System.out.println(mem);
		
		System.out.println(mem.getThis());

	}

}

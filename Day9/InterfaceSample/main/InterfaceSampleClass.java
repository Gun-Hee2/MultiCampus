package main;

public class InterfaceSampleClass {

	public static void main(String[] args) {
		/*
		   abstract class : 일반 멤버 변수 + 일반 멤버 메소드 + 추상 메소드
		   
		   interface : 추상 메소드 -> 선언만 되어 비어 있는 클래스
		               메소드의 타입만이 설정되어 있다.
		               다중 상속이 가능하다.
		               빠르게 클래스의 사양을 파악할 수 있다.
		  
		  
		*/
		
		MyClass mycls = new MyClass();
		mycls.method();
		mycls.func();
		
		MyInterface myint = new MyClass();
		myint.method();
		myint.func();

	}

}

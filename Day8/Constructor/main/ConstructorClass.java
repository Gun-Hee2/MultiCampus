package main;

import cls.MyClass;

public class ConstructorClass {

	public static void main(String[] args) {
		/*
		   Constructor : 생성자
		                 초기화 함수(메소드)
		                 클래스명과 같다
		                 return값이 없다
		                 over load가 가능하다
		                 class 생성시에 자동 호출된다
		                 따로 호출이 불가능하다
		                 생략이 가능하다
		 
		*/
		
		int array[] = { 1, 2, 3, 4 }; //같은 자료형의 묶음(배열)
		
		/*
		   structure == 구조체 -> C언어
		   
		   Struct MYSTRUCT{
		       int number;
		       String name;
		       double height;
		   };    
		   
		   MYSTRUCT st = { 1, "문자열", 123,46 };
		*/
		
		//Myclass cls = new Myclass();
		
		/*
		MyClass cls = new MyClass();
		MyClass cls1 = new MyClass('A');
		MyClass cls2 = new MyClass(2, "문자들", 123.45);
		*/
		
		MyClass cls3 = new MyClass(1);
		
	//	cls.init(2, "문자들", 123.45);
		
		

	}

}
/*
class Myclass{
	int number;
    String name;
    double height;
    
}
*/

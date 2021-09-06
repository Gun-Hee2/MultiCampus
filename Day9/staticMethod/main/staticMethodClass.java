package main;

public class staticMethodClass {

	public static void main(String[] args) {
		/*
		   멤버 메소드 : class에 소속되어 있는 함수.
		              instance 메소드
		              
		   정적 메소드 : class에 소속되어 있는 함수.
		              class 메소드           
		              
		   
	    */
		
		Myclass.staticMethod();
		
		Myclass cls = new Myclass();
		cls.memberMethod();
		 
		Myclass mycls = Myclass.getInstatnce();

	}
	
	static void method() {
		System.out.println("method()");
	}

}

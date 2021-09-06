package main;

public class FinalSampleClass {

	public static void main(String[] args) {
		/*
		   final
		   변수, 메소드, 클래스
		   
		    
		*/
		
		final int NUMBER = 10;   // final -> number를 상수로 만듬. 보통 소문자대신 대문자로 표현을 한다.
		
		int num = NUMBER;
		
		ChildClass cc = new ChildClass();
		cc.method();

	}

}

/*final*/ class SuperClass{  // 여기서의 final은 상속을 금지 시킴.
	public /*final*/ void method() { // 여기서의 final은 오버라이드 금지를 뜻함.
		System.out.println("SuperClass method()");
	}
}

class ChildClass extends SuperClass{
	public void method() {  // Over Ride
		System.out.println("ChildClass method()");
	}
}

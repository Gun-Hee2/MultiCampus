package main;

import cls.MyClass;

public class VariablesSampleClass {

	public static void main(String[] args) {
		/*
		    Variable : 변수
		                                                memory  stack  heap  static  sys
                        local       지역                           o
                        static      정적                                         o
                        parameter   =지역                          o
                        member		=클래스 소속                           o    
		  
		*/
		
		
		int number; //local
		
		MyClass cls = new MyClass();
		
		cls.method('B', 1);
		cls.method('B', 1);
		cls.method('B', 1);
		
		MyClass cls1 = new MyClass();
		
		cls1.method('B', 1);
		
		MyClass.static_var++;
		
		cls1.method('B', 1);

	}

}

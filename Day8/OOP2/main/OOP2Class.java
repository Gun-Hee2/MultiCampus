package main;

import cal.Calculator;
import mycls.MyClass;

public class OOP2Class {

	public static void main(String[] args) {
		
		/*
		// class 할당, 객체생성
		MyClass cls = new MyClass();
		// cls : object, instance
		// 메모리: stack, heap, static, system
		// stack영역: cls
		// heap영역: new MyClass()
		
		System.out.println(cls);
		
		cls.number = 1001;
		cls.name = "홍길동";
		cls.height = 175.1;
		
		cls.method();
		cls.func();
		*/
		
		Calculator ca = new Calculator();
		
		ca.input();
		ca.calculator();
		ca.print();
		
		

	}

}

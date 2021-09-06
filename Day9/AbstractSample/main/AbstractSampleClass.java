package main;

import cls.AbstractClass;
import cls.MyClass;

public class AbstractSampleClass {

	public static void main(String[] args) {
		/*
		    Abstract Class : 추상 클래스
		                     추상 메소드를 하나 이상 포함하고 있는 클래스
		                     내용은 없고 선언만 되어 있는 메소드
		    
		    public void method(int n){  <- prototype(사양)
		        처리  
		    }    
		    
		    public abstract void method(int n);   // 추정해서 선언만 해 놓음 
		    
		*/
		
		// AbstractClass acls = new AbstractClass(); //  -> 불가능
		
		MyClass cls = new MyClass();
		
		cls.method();
		cls.abstractMethod();
		
		AbstractClass acls = new AbstractClass() {
			
			@Override
			public void abstractMethod() {
				System.out.println("AbstractClass abstractMethod()");
			}
		};
		
		acls.method();
		acls.abstractMethod();

	}

}

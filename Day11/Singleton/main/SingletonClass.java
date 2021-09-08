package main;

import cls.HeClass;
import cls.MyClass;
import cls.YouClass;
import single.Singleton;

public class SingletonClass {

	public static void main(String[] args) {
		
		/*
		    singleton pattern : instance(객체)1개만 생성해서 데이터를 접근하기 위한 패턴이다.
		                        class간에 대화가 목적이다.(대화는 클래스간에 데이터를 넘겨주거나 받는것을 의미)
		                        어떤 클래스에서도 접근이 가능하다.
		   
		*/
		
		MyClass mycls = new MyClass("홍길동");
		YouClass youcls = new YouClass();
		HeClass hecls = new HeClass();
	    /*
		String name = mycls.getName();
		youcls.setName(name);
		System.out.println(youcls.toString());
		*/
		
		mycls.method();
		youcls.func();
		youcls.func2();
		hecls.funct();
		System.out.println(youcls.toString());
		System.out.println(hecls.toString());
		
		/*
		Singleton si = Singleton.getInstance();
		System.out.println(si);
		
		System.out.println(Singleton.getInstance());
	    */
		

	}

}

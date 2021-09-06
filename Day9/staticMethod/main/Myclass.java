package main;

public class Myclass {
	
	static int stNumber;
	
	int memVar;
	
	public void memberMethod() {
		System.out.println("Myclass memberMethod()");
	}
	
	public static void staticMethod() {
		System.out.println("Myclass staticMethod()");
		
		// this, super 사용할 수 없다.
		// this.memVar = 1;
		
		stNumber = 34; // -> static 변수이기 때문에 가능.
	}
	
	public static Myclass getInstatnce() {
		Myclass m = new Myclass();
		m.memVar = 1;
		// 초기화 할 값이 많다.
		
		return m;
		
	}

}

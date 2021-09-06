package cls;

public class MyClass {
	
	private int number = 0;    // member변수 -> heap
	
	public static int static_var = 0; // static변수 -> global(전역) variable
	
	final int MEMBERNUMBER = 100;  //상수
	
	public void method(char c, int n) { // char c, int n == 매개변수 -> stack
		
		int mem = MEMBERNUMBER;
		
		c = 'A';
		
		c = 'Y';
		
		int num = 0;  //local -> stack
		num++;
		
		number++;  //instance(member) 변수
		
		MyClass.static_var++;
		
		System.out.println("local 변수 = " + num );
		
		System.out.println("member 변수 = " + number );
		
		System.out.println("static 변수 = " + MyClass.static_var );
		
	}
	

}

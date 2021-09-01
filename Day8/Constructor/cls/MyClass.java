package cls;

public class MyClass {
	private int number;
	private String name;
	private double height;
	
	public MyClass() {
		System.out.println("MyClass MyClass() ");
		number = 10;
		name = "빈칸";
		height = 100.0;
	}
	
	public MyClass(char c) {  // 오버로드가 가능하다
		System.out.println("MyClass MyClass(char c) ");
	}
	
	public MyClass(int number, String name, double height) {
		System.out.println("MyClass MyClass(int number, String name, double height) ");
		this.number = number;
		this.name = name;
		this.height = height;
	}
	
	public void init(int number, String name, double height) {
		System.out.println("MyClass MyClass(int number, String name, double height) ");
		this.number = number;
		this.name = name;
		this.height = height;
	}
	
	public MyClass(int i) {
		
		this(); // -> 기본 생성자 MyClass()
	//	this('A'); // 생성자 2개는 불러올 수 없다
		
		System.out.println("MyClass MyClass(int i) ");
	}

}

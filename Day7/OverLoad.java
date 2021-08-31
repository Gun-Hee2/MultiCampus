
public class OverLoad {

	public static void main(String[] args) {
		/*
		   Over Load : 함수(method)명은 같지만
		               매개 변수(parameter)의 자료형이나 갯수가 다른 것을 의미한다. -> 매개변수로 구분
		           
		               
		   ex)
		   
		   print() -> 매개변수없는 함수
		   print(int i) -> 매개변수가 있음
		   print(char c)
		   print(int i, char c)
		   print(char c, int i) -> 위와 함수명은 같고 매개변수의 순서만 다르지만 다른함수로 인식을 함
		   
		   // background
		   painting();
		   // image
		   painting(int x, int y);
		   painting(int x, int y, int a);
		    
		    
		*/
		
		method();
		method('A');
		method(3);
		method('B', 7);
		method(14, 'Y');

	}
	
	static void method() {
		System.out.println("method() 호출");
	}
	
	static void method(char c) {
		System.out.println("method(char c) 호출");
	}
	
	static void method(int i) {
		System.out.println("method(int i) 호출");
	}
	
	static void method(char c, int i) {
		System.out.println("method(char c, int i) 호출");
	}
	
	static void method(int i, char c) {
		System.out.println("method(int i, char c) 호출");
	}
	
	/*
	static void method(int a, char b) {
		System.out.println("method(int i, char c) 호출");    ->  불가능
	}
	*/
	
	

}

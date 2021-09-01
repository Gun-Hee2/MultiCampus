package dto;

public class MemberDto {
	
	// 멤버 변수 : 90%이상 -> private
	
	private int number;
	public String name; // 멤버 변수의 접근 지정자를 public으로 하는 경우는 드물다 
	protected double height;
	
	// 멤버 함수(메소드)는 90%이상 -> public
	
	// getter -> 외부에서 변수로 접근할 수 있도록하는 함수, 값을 (외부에서) 값을 취득
	public int getNumber() {
		return number;
	}
	// setter -> (외부에서)값을 변경
	public void setNumber(int num) {
		number = num;
	}
	
	public void method() {
		this.number = 123;
	}
	
	public void func(int number) {
		this.number = number; // this.number -> 멤버 변수  number -> 매개변수
	}
	
	public MemberDto getThis() {
		return this;
	}
	//this : 자기 참조 == heap영역의 주소

}

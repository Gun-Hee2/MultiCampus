package cal;

import java.util.Scanner;

public class Calculator {
	
	int num1;
	int num2;
	String operator;
	int result;
	
	// 입력
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연산할 숫자를 적으세요: ");
		num1 = sc.nextInt();
		
		System.out.print("원하는 연산의 기호를 적으세요: ");
		operator = sc.next();
		
		System.out.print("연산할 숫자를 적으세요: ");
		num2 = sc.nextInt();
	}
	
	// 계산
	public void calculator() {
		if(operator.equals("+")) {
			result = num1 + num2;
		}
		else if(operator.equals("-")) {
			result = num1 - num2;
		}
		else if(operator.equals("*")) {
			result = num1 * num2;
		}
		else if(operator.equals("/")) {
			result = num1 / num2;
		}
	}
	
	// 결과 출력
	public void print() {
		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	}

}

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1,num2;
		String ch;
		
		System.out.print("연산할 숫자를 적으세요: ");
		num1 = scan.nextInt();
		
		System.out.print("원하는 연산의 기호를 적으세요: ");
		ch = scan.next();
		
		System.out.print("연산할 숫자를 적으세요: ");
		num2 = scan.nextInt();
		
		if(ch.equals("+")) {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		}
		else if(ch.equals("-")) {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		}
		else if(ch.equals("*")) {
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		}
		else if(ch.equals("/")) {
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		}
		else {
			System.out.println("연산이 불가능합니다.");
		}
		

	}

}

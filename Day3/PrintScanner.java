import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 입력/출력
		//외부로부터 입력(숫자, 문자열)
		//출력(확인, 연산결과)
		
		System.out.println("Hello World");  // println == 개행해서 출력
		
		System.out.println("hi nice to meet you");
		
		System.out.println("Hello My World");
		
		// "Hello My World"
		System.out.println("\"Hello My World\"");
		
		// "문자열" '한' -> character
		System.out.println('한');
		
		System.out.println(256);
		
		System.out.println("World " + "Hello");
		
		System.out.println(372 + " 번호");
		
		System.out.println(123 + 45 + " 숫자");
		
		System.out.println("숫자 " + 123 + 45);
		
		System.out.println("숫자 " + (123 + 45));
		
		//printf   \n -> 개행
		System.out.printf("%c\n", 'A');
		
		System.out.printf("%c %d\n", '한', 123);
		
		// string == 문자열
		System.out.printf("%s", "안녕하세요");
		
		System.out.println();
		
		
		
		// 입력(console)
		Scanner scan = new Scanner(System.in);
		
		// console
		
		// boolean -> true/false
		// 저장공간이 준비되어있어야함
		/*
		boolean b;
		
		System.out.print("boolean 입력 = ");
		b = scan.nextBoolean();
		System.out.println(b);
		*/
		
		// integer 정수
		/*
		int num;
		
		System.out.print("숫자 입력 = ");
		num = scan.nextInt();
		System.out.println(num);
		*/
		
		// double 실수
		/*
		double d;
		
		System.out.print("소수 입력 = ");
		d = scan.nextDouble();
		System.out.println(d);
		*/
		/*
		// String 문자열
		 // Scanner
		
		String str = "";
		/*
		System.out.print("문자열 입력: ");
		str = scan.next();
		System.out.println(str);
		
		 // BufferedReader  Buffer(저장공간)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // new -> 메모리 할당, 객체 할당
		
		System.out.print("str = ");
		try {
			str = br.readLine(); // 실제 입력 -> 띄어 쓰기 가능
		}catch (Exception e) {
			
		}
	    System.out.println(str);
	    */
	    // Calculator(계산기)
	    
		
	    
		
		

	}

}

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int i;
		int j;
		String a;
		
		System.out.print("숫자를 입력하세요: ");
		
		i = scan.nextInt();
		
		System.out.print("원하는 연산을 입력하세요: ");
		
		a = scan.next();
		
		System.out.print("숫자를 입력하세요: ");
		
		j = scan.nextInt();
		
		if(a.equals("+")) {
			System.out.println(i + " " + "+" + " " + j + " " + "=" + " " + (i+j));
		}
		else if(a.equals("-")) {
			System.out.println(i + " " + "-" + " " + j + " " + "=" + " " + (i-j));
		}
		else if(a.equals("/")) {
			System.out.println(i + " " + "/" + " " + j + " " + "=" + " " + (i/j));
		}
		else if(a.equals("*")) {
			System.out.println(i + " " + "*" + " " + j + " " + "=" + " " + (i*j));
		}
		else {
			System.out.println("연산이 불가능합니다.");
		}

	}

}

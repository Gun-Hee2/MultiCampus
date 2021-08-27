import java.util.Scanner;

public class OneNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String strNum;
		
		System.out.print("숫자입력 = ");
		strNum = sc.next();
		
		char c = strNum.charAt(0);
		
		int n = (int)c;
		
		if(n >= 48 && n <= 57) {
			System.out.println("숫자입니다.");
		}
		else {
			System.out.println("문자입니다.");
		}
		
		// ASCII == 아스키 코드
		
	}

}

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int i;
		int j;
		
		System.out.print("계산하고자 하는 숫자를 입력하세요: ");
		i = scan.nextInt();
		System.out.print("계산하고자 하는 숫자를 입력하세요: ");
		j = scan.nextInt();
		System.out.println("==============================");
		System.out.println("덧셈" + "\t" + "뺄셈" + "\t" + "나눗셈" + "\t " + "곱셈");
		System.out.println("==============================");
		System.out.println(i + "+" + j + "=" + (i+j) + "\t" + i + "-" + j + "=" + (i-j) + "\t" + i + "/" + j + "=" + (i/j) + "\t" + i + "*" + j + "=" + (i*j));
		System.out.println("==============================");
		
		

	}

}

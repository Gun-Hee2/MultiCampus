import java.util.Scanner;

public class Work1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		   편의점
		   지불금액  : 3210원
		   본인금액  : 10,000원
		   
		   거스름 돈 -> ?
		   
		   
		 */
		int price,pay;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("지불해야 할 금액을 적으세요: ");
		price = scan.nextInt();
		
		System.out.print("본인이 지불한 금액을 적으세요: ");
		pay = scan.nextInt();
		
		int chamon = pay - price;
		
		int array1[] = { 5000, 1000, 500, 100, 50, 10 };
		
		System.out.println("거스름 돈 = " + (pay - price) + "원");
		System.out.println("5000원: " + ((pay - price)/array1[0]) + "장" + " " + "1000원: " + (((pay - price)%array1[0])/array1[1]) + "장" + " " + "500원: " + (((pay - price)%array1[1])/array1[2]) + "개"+ " " + "100원: " + (((pay - price)%array1[2])/array1[3]) + "개"+ " " + "50원: " + (((pay - price)%array1[3])/array1[4]) + "개"+ " " + "10원: " + (((pay - price)%array1[4])/array1[5]) + "개");
		
		
		
	}

}

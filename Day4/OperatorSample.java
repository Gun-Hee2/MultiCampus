
public class OperatorSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		  Operator : 연산자
		  
		  +, -, *, /, %
		  
		  ex) 9/2 -> 4 몫
		      9%2 -> 1 나머지
		 */
		
		int num1, num2;
		int result;
		
		num1 = 25;
		num2 = 7;
		
		result = num1 + num2;
		
		// ex)
		System.out.println(result);
		System.out.println(num1 + " + " + num2 + " = " + result);
		
		
		// 자기(변수) 자신의 값을 변경
		int num3 = 0;
		
		num3 = num3 + 3;
		
		System.out.println("num3 = " + num3);
		
		
		// increment(증가), decrement(감소)
		//    ++              --
		
		int num4 = 0;
		
		num4++;  // ->  num4 = num4 + 1,  num4 += 1,
		System.out.println(num4);
		
		num4--;
		System.out.println(num4);
		
		int num5, num6;
		num5 = 1;
		
		num6 = num5++;
		
		System.out.println(num5);
		System.out.println(num6);
		
		

	}

}

import java.util.Arrays;

public class Work4 {

	public static void main(String[] args) {
		/*
		
		   int num1[] = { 1, 2, 3, 4, 5 };
		   배열의 값에 *2배의 연산된 값이 산출되도록 메소드를 작성하시오.
		*/ 
		int num1[] = { 1, 2, 3, 4, 5 };
		
		num1 = numberDouble(num1);
		
		for (int i : num1) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(num1));
		/*
		   int[] original = {1,2,3,4,5,6,7,8,9};  // {4,7,3,1,9,8,2,6,5};
		   주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다. Math.random()
		   int[] result = shuffle(original);
		   
		   
		*/
		int original[] = {1,2,3,4,5,6,7,8,9};
		
	//	int r = (int)(Math.random() * 3) + 1; // 0 1 2
	//	System.out.println("r = " + r);
		
		original = shuffle(original);
		System.out.println(Arrays.toString(original));
		
		
		/*   
		   메소드명 : isNumber
		   기능 : 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
		   모두 숫자로만 이루어져 있으면 true를 반환하고,
		   그렇지 않으면 false를 반환한다.
        */
		boolean b = isNumber("193a74");
		if( b == true) {
			System.out.println("모두 숫자입니다");
		}else {
			System.out.println("문자가 있습니다");
		}
		
		
	}
	static int[] numberDouble(int num1[]) {
		for (int i = 0; i < num1.length; i++) {
			num1[i] = num1[i] * 2;
		}
		
		return num1;
	}
	
	static int[] shuffle(int original[]) {
		
		for(int i = 0; i < 1000; i++) { //섞는 회수
			
			int x = (int)(Math.random() * 9);  // 0 ~ 8
			int y = (int)(Math.random() * 9);  // 0 ~ 8
			
			int temp = original[x];         
			original[x] = original[y];
			original[y] = temp;
		}
		
		return original;
	}
	
	static boolean isNumber(String str) {
		
		boolean b = true;
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
		//	System.out.println(c);
			
			int asc = (int)c;
			if(asc < 48 || asc > 57) {   // 아스키 코드 값 48 == '0'  57 == '9'
				b = false;
			}
			
		}
		
		return b;
		
	}
    
}

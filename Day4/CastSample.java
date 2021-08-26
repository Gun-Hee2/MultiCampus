
public class CastSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		   우선 순위     바이트
		낮음   
		   boolean      1
		   
		   byte         1
		   short        2
		   int          4
		   long         8
		   
		   double       8
		   float        4
		높음
		   변환
		   자동 (자료)형 변환
		   강제 (자료)형 변환 -> Cast
		 */
		
		// 자동 형변환
		short sh = 12345;
		int num;
		
		num = sh;
		System.out.println(num);
		
		double d;
		d = num;
		System.out.println(d);
		
		// 강제(Cast) 형변환 -> 정수형에서 실수형으로 변환할 때 많이 사용.
		int number = 256;
		short sho;
		
		sho = (short)number;
		System.out.println(sho);
		
		
		float f;
		
		f = (float)3 / 2;
		System.out.println(f);
		
		// 연산중에 주의해야 될 연산
		//       /, %
		
		int result = 0;
		
	//	result = 3 / 0; // -> 분모가 0이면 연산불가, 분자가 0일때는 가능
	//	result = 3 % 0; // -> 분모가 0이면 연산불가, 분자가 0일때는 가능
		
	}

}

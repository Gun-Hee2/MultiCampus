
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		   상수(숫자) : 변할 수 없는 수(지정 숫자)
		           2진수 : 0, 1 사용
		           8진수 : 0 ~ 7
		           10진수 : 0 ~ 9
		           16진수 : 0 ~ 9 A B C D E F(15)
		           
		 */
		
		//variable(== 변수)
		
		/*
		  값을 저장하기 위한 공간
		  그릇 -> 데이터
		  이름을 정해준다
		  크기 -> 데이터의 종류(정수, 실수, 문자열, 문자, 논리(true/false))
		  
		   자료형 변수명;  -> 변수의 선언
		 ex)int number;
		 
		   작명의 규칙
		 
		 */
		int a;
		int A;
		// int int; 예약어는 사용할 수 없다.
		// int 2a; 변수명에 숫자가 맨 앞에 위치할 수 없다.
		// int 243; 변수명에 상수 사용 불가
		
		int _abc; // _를 변수명 맨앞에 사용할수는 있지만 권장하지는 않는다.
		// int -abc; 변수명 맨앞에 연산자는 사용불가
		
		int numPosChr;
		
		numPosChr = 246;
		
		/*
		     그릇(변수)의 자료형의 종류
		 */
		
		// 수치
		// 정수
		byte by;      // 1 byte 256개 -> 0 ~ 255  0000 0000
		              // -128 ~ 127
		by = -128;
		System.out.println(by);
		
		short sh;     // 2 byte
		sh = 12345;
		
		int i;        // 4 byte integer *중요*
		i = 244545;
		
		long l;       // 8 byte
		l = 54564564564L;
		
		//실수
		float f;      // 4 byte
		f = 123.4567F;
		
		double d;     // 8 byte
		d = 234.684684844684684;
		//문자
		//한 문자
		char c;       // 2 byte   character
		
		c = 'A';
		c = 'a';
		c = '한';
		// c = 'ab'; -> 문자열이기 때문에 불가능
		
		//문자열(String) == object
		String str = "문자들";
		str = "문자열";
		System.out.println(str);
		
		
		//논리 -> 참(true==1)/거짓(false==0)
		boolean b;     // 1 byte
		b = false;
		b = true;
		System.out.println(b);
		
		// escape sequence -> 탈출 구문
		// \n(개행), \", \', \t(띄어쓰기), \\
		
		System.out.println("\\");
		
		/*
		 변수를 선언, 값을 대입 후에 출력
		 
		 ======================================================
		 \ name     age lady    phone           height  address \
		 ======================================================
		 \ "홍길동"   20  true    010-111-2222    175.12  "경기도"  \
		 \ "홍길동"   20  true    02-123-4567     180.01  "서울"   \
		 \ "홍길동"   20  true    010-111-2222    155.78  "부산"   \
		 ======================================================
		 */
		

	}

}

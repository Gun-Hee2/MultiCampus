
public class WrapperClassSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		   Wrapper Class
		   
		   일반 자료형  ->  Wrapper class
		   boolean         Boolean
		   
		   byte            Byte
		   short           Short
		   int             Integer    ------
		   long            Long
		   
		   float           Float
		   double          Double     ------
		   
		   char            Character
		   char[]          String     ------
		 */
		
		// Integer == int
		int i = 123;
		Integer iobj = 123;
		
		System.out.println(i);
		System.out.println(iobj);
		
	//	String str = new String("hello");
		String str = "hello";
		
	//	Integer obj = new Integer(123);
		Integer obj = 123;
		
		// 숫자(Integer) -> 문자열(String) : 숫자의 변수 + ""  or   toString
		int number = 123;
		String s = number + "";
		
		Integer inumber = 123;
		String s1 = inumber.toString();
		
		// 문자열(String) -> 숫자(Integer) : parseInt -> *매우 유용*
		String strNum = "1024";
		int num = Integer.parseInt(strNum);
		System.out.println(num);
		
		String strNumber = "123.4567";
		double dnum = Double.parseDouble(strNumber);
		System.out.println(dnum);

	}

}

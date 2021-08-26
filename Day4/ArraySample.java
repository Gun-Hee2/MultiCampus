
public class ArraySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		   Array(배열): 같은 자료형의 묶음. -> 변수들
		               목적: 변수들을 관리, 통계에 많이 쓰임
		               
		   int num1, num2, num3, num4 ... num10;
		   
		   형식:
		   
		       자료형 배열변수명[] = new 자료형[배열의 총 개수]
		       int Array[] = new int[10]; -> 10 == Array.length
		                                  -> new는 동적할당, 동적할당: 정해지지 않은 갯수로, 본인이 결정해서 할당함을 의미
		   
		   // index number : [number], 배열변수에 접근하기 위한 번호, 0 ~ Array.length-1
		   Array[0] = 1; 
		   Array[1] = 2; 
		   Array[2] = 3;
		       : 
		   Array[9] = 10;  
		 */
		
	//	int Array[] = new int[5];
	//	int []Array = new int[5];
		int [] Array = new int[5];
		
		//동적 : dynamic 할당 : allocation
		
		System.out.println(Array);  // heap 영역의 주소 -> 4byte
		
		//배열의 길이
		
		System.out.println(Array.length);
		
		Array[0] = 11;
		Array[1] = 22;
		Array[2] = 33;
		Array[3] = 44;
		Array[4] = 55;
		
		System.out.println(Array[3]);
		
		int Array1[];
		
		Array1 = new int[10];
		
		//배열의 초기화
		
		int Array2[] = null; // 0000 0000  -> 배열의 초기화는 무조건 null로 한다.
		
		// value 초기화
		
		int Array3[] = { 10, 20, 30, 40, 50, 60, };
		
		// char 배열 ex) "World"
		
		char charArray[] = new char[5];
		charArray[0] = 'W';
		charArray[1] = 'o';
		charArray[2] = 'r';
		charArray[3] = 'l';
		charArray[4] = 'd';
		
		System.out.println(charArray);
		
		char charArray1[] =  { 'W', 'o', 'r', 'l', 'd' };
		
		System.out.println(charArray1);
		
		//배열 복사
		
		int arrayNum[] = { 11, 22, 33};
		
		int arrayCopy[] = arrayNum;
		
		System.out.println(arrayCopy[0]);
		System.out.println(arrayCopy[1]);
		System.out.println(arrayCopy[2]);
		
		arrayCopy[1] = 20;
		
		System.out.println(arrayNum[1]);
		
	}

}

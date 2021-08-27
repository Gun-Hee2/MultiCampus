package whileSample;

public class whileSample {

	public static void main(String[] args) {
		/*
		   loop문
		   
		   while문
		   
		   초기화
		   while(조건식){
		       처리
		       연산식
		   }
		 */
		
		int w;
		
		w = 0;
		while(w < 5) {
			System.out.println("while loop w = " + w);
			
			w++;
		}
		
		/* do - while문 -> while문과의 차이점은 do - while문은 조건식에 충족이 안되어도 무조건 한번은 실행을 함
		   
		   형식:
		       초기화
		       
		       do{
		           처리
		           연산식
		       }while(조건식);
		
		 */
		
		int dw;
		
		dw = 0;
		
		do {
			System.out.println("do while loop");
			dw++;
		}while(dw < 5);

	}

}

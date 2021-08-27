package forSample;

public class forSample {

	public static void main(String[] args) {
		/*
		    loop문
		    
		    for : 지정 횟수에 따라서 반복하는 제어문
		    
		    형식 :
		            for( (변수선언)초기화 ; 조건식 ; 연산식 ){
		                처리 //조건이 참이면 계속 반복, 거짓이 나오면 탈출
		            }
		            
		            for( (1) ; (2)(5)(8)(11) ; (4)(7)(10) ){ // (2)에서 참이면 (3)처리로, 거짓이면 for문 탈출
		                (3)(6)(9)처리  --> 3번
		            }
		            (12)
		 
		 
		 */
		
		int n = 0; // 변수 초기화는 for문 전에 생략가능
		
		for( n = 0; n < 3; n++) {
			System.out.println("for 문 ++ ");
		}
		
		for( n = 3; n > 0; n--) {
			System.out.println("for 문 -- ");
		}
		
		for( n = 0; n < 10; n = n + 2) {
			System.out.println("for 문 +2 n = " + n);
		}
		
		for(int i = 0; i < 10; i++) { // 0 ~ 9
			System.out.println("i = " + i);
		}
		
		for(int i = 1; i <= 10; i++) { // 1 ~ 10
			System.out.println("i = " + i);
		}
		
		// endless loop(무한루프) -> 조건식이 잘못되어 있을 때
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		
		// for 안에 for = 이중 for문
		for(int i = 0; i < 5; i++) {
			
			System.out.println("i = " + i);
			for(int j = 0; j < 4; j++) {
				System.out.println("\tj = " + j);
			}
		}
		
		// for문은 if문, 배열과 가장 많이 쓰임
		
		int Array[] = { 90, 100, 55, 85, 70, 45, 80 };
		
		for(int i = 0; i < Array.length; i++) {
			if(Array[i] < 60) {
				System.out.println(Array[i]);
			}
		}

	}

}

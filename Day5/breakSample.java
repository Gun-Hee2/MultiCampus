package breakSample;

public class breakSample {

	public static void main(String[] args) {
		/*
		    break문 == 탈출(loop문) -> for문에서 검색을 할때 제일 많이 쓰임
		    
		    for, while, do while
		    
		    형식:
		        for(int i = 0; i < 10 ; i++){
		            if(조건){
		                break;
		            }
		        }
		
		 */
		
		for(int i = 0; i < 10; i++) {
			System.out.println("for loop i = " + i);
			
			if(i == 5) {
				break;
			}
		}
		
		char cArray[] = { 'a', 'b', 'c', 'd' };
		
		for(int i = 0; i < cArray.length; i++) {
			System.out.println(cArray[i]);
			if(cArray[i] == 'c') {
				System.out.println("c를 찾았습니다");
				break;
			}
		}
		
		// foreach
		/*
		 * for문
		 
		    for(초기화; 조건식; 연산식){
		        처리
		    }
		 * foreach문
		    
		    for(자료형 변수 : 배열(리스트)){
		        처리
		    }
		 
		 */
		
		int array[] = { 11, 22, 33, 44, 55};
		
		/*
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		*/
		
		/*
		for(int num : array) {
			System.out.println(num);
		}
		*/
		
		/*
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			if(array[i] == 33) {
				break;
			}
		}  
		*/
		
		for(int num : array) {
			System.out.println(num);
			
			if(num == 22) {
				break;
			}
		}
	}

}

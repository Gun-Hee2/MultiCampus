
public class SwitchSample {

	public static void main(String[] args) {
		/*
		    switch : if와 비슷함.
		             값이 명확해야 됨.
		             범위를 지정할 수 없음. -> switch보다 if를 많이 쓰이는 이유
		             소수값 사용 X
		             
		    case, break 사용 // break를 쓰지않으면 엉뚱한 결과를 초래함
		    
		    형식:
		            switch( 대상이 되는 변수 ){
		               case 값1:
		                    처리1
		                    break; -> 처리1이 된다면 switch구문 탈출  
		               case 값2:
		                    처리2
		                    break; 
		               case 값3:
		                    처리3
		                    break;       
		               default:
		                    break;    
		            }
		               
		 */
		
		int number = 2;
		
		switch(number) {
		    case 1:   
		    	System.out.println("number는 1입니다");
		    	break;
		    case 2:   
		    	System.out.println("number는 2입니다");
		    	break;
		    	
		    default:
		    	System.out.println("number는 1도 아니고 2도 아닙니다");
			
		}
		
		/* 불가능한 switch문
		 
		switch(number) {
		    case number > 0: // -> 범위 지정 불가능
		    	break;
		}
		*/
		
		/*
		double d = 1.1;
		
		switch(d){    // -> 소수 사용 불가능
		    case 1.1:
		    	break;
		}
		*/

	}

}

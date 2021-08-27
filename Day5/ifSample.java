package ifSample;

public class ifSample {

	public static void main(String[] args) {
		/*
		    조건 문
		    
		    if
		    
		    형식:
		        if( 조건식 ){ -> 논리연산(true/false)
		             처리 //조건이 true면 처리를 함.    
		        }
		        
		        조건 :  A > B    if( A > B )  //조건식에서의 논리연산의 주체는 주로 왼쪽에 배치를 함 -> A는 B보다 클 때(왼쪽에 배치된 A가 주체가 됨)
		               B < A    if( B < A)
		                 ==     if( A == B )
		                 >=     if( A >= B )
		                 <=     if( A <= B )
		                 !=     if( A != B )
		 */
		
		int number = 5;
		
		if(number > 0) {
			System.out.println("number는 0보다 큽니다");
		}
		
		if(number < 10) {
			System.out.println("number는 10보다 작습니다");
		}
		
		if(number == 5) {
			System.out.println("number는 5입니다");
		}
		
		if(number != 0) {
			System.out.println("number는 0이 아닙니다");
		}
		
		// number가 5의 배수라면 2배 증가하라.
		if(number % 5 == 0) {
			number = number * 2;
		}
		System.out.println(number);
		
		/* 조건이 1가지 이상일 때
		 논리 연산자 사용:
		        &&(AND)   조건1 && 조건2 , 조건1 && 조건2 && 조건3
		        ||(OR)    조건1 || 조건2 ,         ,,
		        !(NOT)    !(조건1) -> 조건1이 거짓일 때
		 */
		
		int age = 24;
		
		if(age >= 18) {
			System.out.println("당신은 성인입니다");
		}
		
		if(age > 19 && age < 30) { // age = 20 ~ 29
			System.out.println("당신은 20대 청년입니다");
		}
		
		if(age > 20 && age <= 24) {
			System.out.println("당신의 연령의 범위는 21 ~ 23살 입니다");
		}
		
		if(age > 20 || age >= 30) {
			System.out.println("당신은 20살보다 많거나 30살보다 적거나 같습니다");
		}
		
		if(age < 20 || age >= 23) {
			System.out.println("당신은 20살보다 적거나 23살보다 많거나 같습니다");
		}
		
		if(!(age < 24)) {   // age >= 24
	         System.out.println("당신은 24보다 크거나 작습니다.");
	      }
		
		boolean setup = false;
	      /*
	      if(setup == true) {
	         System.out.println("setup은 되어 있습니다.");
	      }*/
	      if(!setup) {
	         System.out.println("setup은 되어 있습니다.");
	      }
	      /*
	      if(setup == false) {
	         System.out.println("setup은 false 입니다.");
	      }
	      */
	      if(!setup) {
	         System.out.println("setup은 true입니다.");
	      }
	      
	      /* if else
	       
	          if( 조건 ){
	              처리1
	          }
	          else{
	              처리2
	          }        
	       */
	      
	      age = 5;
	      
	      if(age >= 18) {
	    	  System.out.println("당신은 성인입니다");
	      }
	      else {
	    	  System.out.println("당신은 미성년자입니다");
	      }
	      
	      /*
	          삼항 연산자
	          
	          형식:
	              값 = ( 조건 ) ? 값1 : 값2 // 조건이 참이면 값1을, 거짓이면 값2를 인지
	       */
	      
	      int b = 0;
	      
	      b = (number > 20) ? 1 : 2;
	      
	      System.out.println("b = " + b);
	      
	      String msg;
	      msg = (number > 0) ? "양수입니다" : "음수입니다";
	      
	      System.out.println("msg:" + msg);
	      
	      /*
	          조건 분기 if ~ else if
	          
	          if( 조건1 ){
	              처리1
	          }
	          else if( 조건2 ){
	                   처리2
	          } 
	          else if( 조건3 ){
	                   처리3
	          } 
	          else if( 조건4 ){
	                   처리4
	          }
	          else{
	               처리5
	          }                  
	       
	       
	       */
	      
	      number = 90;
	      
	      if(number == 100) {
	    	  System.out.println("A+ 입니다");
	      }
	      else if(number >= 90) {
	    	  System.out.println("A 입니다");
	      }
	      else if(number >= 80) {
	    	  System.out.println("B 입니다");
	      }
	      else if(number >= 70) {
	    	  System.out.println("C 입니다");
	      }
	      else {
	    	  System.out.println("재시험입니다");
	      }
	      
	      /*
	      if(number >= 70) {
	    	  System.out.println("C 입니다");
	      }
	      else if(number >= 80) {
	    	  System.out.println("B 입니다");
	      }
	      else if(number >= 90) {
	    	  System.out.println("A 입니다");
	      }
	      else if(number >= 100) {
	    	  System.out.println("A+ 입니다");
	      }
	      else {
	    	  System.out.println("재시험입니다");
	      }
	      -> if ~ else if문에서 조건의 수는 위에서부터 큰 수로 해야한다.
	      
	      */
	      
	      /*
	         조건 안에 조건(중첩 조건문)
	         
	         if( 조건1 ){
	             if( 조건2 ){
	                 처리1
	             }
	             else{
	                 처리2
	             }        
	         }
	         else{
	         
	         }
	        
	       */
	      
	      number = 95;
	      
	      // 95 <= A+
	      // 95 > A
	      
	      if(number >= 90 && number <= 100) {
	    	  if(number <= 95) {
	    		  System.out.println("A+ 입니다");
	    	  }
	    	  else {
	    		  System.out.println("A 입니다");
	    	  }
	      }
	      else if(number >= 80 && number < 90) {
	    	  
	      }
	      
	      //String : 문자열 비교
	      String str1 = "안녕하세요";
	      String str2 = "안녕";
	      
	      str2 = str2 + "하세요";
	      
	      if(str1 == str2) {
	    	  System.out.println("같은 문자열입니다");
	      }
	      else {
	    	  System.out.println("다른 문자열입니다");
	      }
	      
	      if(str1.equals(str2) == true) { // == true는 생략가능
	    	  System.out.println("같은 문자열입니다");
	      }
	      else {
	    	  System.out.println("다른 문자열입니다");
	      }
	      
	      String str3 = "나는 반드시 성공할 것입니다";
	      
	      if(str3.contains("성공") == true) {
	    	  System.out.println("성공의 문자열을 포함하고 있습니다");
	      }
	      
	}

}









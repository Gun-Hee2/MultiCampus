
Day5
====
1.&nbsp;&nbsp;조건문
---------------------------
> * **if문**   
> 
>     형식:   
>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if( 조건식 ) {   
>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;처리   
>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}   
>     
>   조건식 : ex ) A > B &nbsp;&nbsp;-> &nbsp;&nbsp;if( A > B) &nbsp;//조건식에서 논리연산의 주체는 주로 왼쪽에 배치를 함 -> A는 B보다 클 때(왼쪽에 배치된 A가 주체가 됨)   
>    
>    ```
>    ex )
>    
>    int number =  5;
>    
>    if(number % 5 == 0) {  //number가 5의 배수라면 2배 증가시킴
>    number = number * 2;
>    }
>    
>    System.out.println(number);
>    
>    //console 출력결과 : 10
>    ```   
>    
>  * **if else문**   
>  
>     형식:   
>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if( 조건식 ) {   
>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;처리1   
>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}   
>     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;else{   
>     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;처리2   
>     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}   
>     
>     ```
>     ex )   
>     
>     age = 15;
>     if(age >= 18) {
>     System.out.println("당신은 성인입니다");
>     }
>     else {
>     System.out.println("당신은 미성년자입니다");
>     }
>     
>     //console 출력결과 :  당신은 미성년자입니다
>     ```
>     
>   * **if  ~ else if 문**   
>   
>     형식:   
>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if( 조건식 ) {   
>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;처리1   
>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}   
>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;else if( 조건2 ){   
>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;처리2   
>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}   
>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;else if( 조건3 ){   
>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;처리3   
>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}   
>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;else if( 조건4 ){   
>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;처리4   
>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}   
>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;else{   
>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;처리5   
>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}   
>  
>     ```
>     ex )
>     
>     number = 90;
>     if(number == 100) {
>     System.out.println("A+ 입니다");
>     }
>     else if(number >= 90) {
>     System.out.println("A 입니다");
>     }
>     else if(number >= 80) {
>     System.out.println("B 입니다");
>     }
>     else if(number >= 70) {
>     System.out.println("C 입니다");
>     }
>     else {
>     System.out.println("재시험입니다");
>     }   
>     
>     //console 결과출력 : A 입니다
>     ```
>     
>    * **중첩 조건문 (조건 안에 조건)**   
>    
>      형식:   
>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if( 조건식1 ) {   
>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if( 조건식2 ) {   
>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;처리1   
>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}   
>     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;else{   
>     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;처리2   
>     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}   
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}   
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;else{   
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;처리3   
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}   
>
>      ```
>      ex )
>      number = 95;
>      
>      // 95 <= A+
>      // 95 > A
>      
>      if(number >= 90 && number <= 100) {
>          if(number <= 95) {
>                  System.out.println("A+ 입니다");
>          }
>          else {
>                  System.out.println("A 입니다");
>          }
>      }
>      else if(number >= 80 && number < 90) {
>      }
>      
>      console 출력결과 : A+ 입니다
>    * **switch문**   
>       
>      if문과 비슷하나 값이 명확해야 하고 범위를 지정할 수 없음 - > switch문보다 if문을 많이 쓰는 이유   
>      소수값 사용 X   
>      case, break 사용 // break를 쓰지 않으면 엉뚱한 결과를 초래함   
>      ```
>      형식:
>           switch( 대상이 되는 변수 ){
>              case 값1:
>                   처리1
>                   break; -> 처리1이 된다면 switch구문 탈출
>              case 값2:
>                   처리2
>                   break;
>              case 값3:
>                   처리3
>                   break;
>              default:
>                   break;
>           }
>      ```
>      
>      ```
>      ex )
>      
>      int number = 2;
>      switch(number) {
>          case 1:
>              System.out.println("number는 1입니다");
>              break;
>          case 2:
>              System.out.println("number는 2입니다");
>              break;
>          default:
>              System.out.println("number는 1도 아니고 2도 아닙니다");
>      }
>      
>      //console 출력결과 : number는 2입니다
>      ```
---------------------------------------------------------------------------
2.&nbsp;&nbsp;for문
----------------------------
> * **for문**    
>   
>   지정 횟수에 따라서 반복하는 제어문
>   
>   ```
>   형식 :
>          for( (변수선언)초기화 ; 조건식 ; 연산식 ){
>             처리 //조건이 참이면 계속 반복, 거짓이 나오면 탈출
>          }
>          
>          for( (1) ; (2)(5)(8)(11) ; (4)(7)(10) ){ // (2)에서 참이면 (3)처리로, 거짓이면 for문 탈출
>                 (3)(6)(9)처리  --> 3번
>          }
>          (12)
>          **조건식이나 연산식을 잘못 설정하면 무한루프를 돌 수 있다.**
>   ```
>   
>   ```
>   ex )
>   
>   int sum = 0;
>   
>   for(int i = 1; i <= 10; i++) {
>           sum = sum + i;
>   }
>   System.out.println(sum);
>   
>   //console 출력결과 : 55
>   ```
>   
>  * **이중 for문**   
>     
>    for문 안에 for문
>    
>    ```
>    ex )
>    
>    for(int i = 0; i < 2; i++) {
>            System.out.println("i = " + i);
>            for(int j = 0; j < 3; j++) {
>                    System.out.println("\tj = " + j);
>            }
>    }
>    
>    //console 출력결과 : i = 0
>                                j = 0
>                                j = 1
>                                j = 2
>                         i = 1
>                                j = 0
>                                j = 1
>                                j = 2
>    ```
-------------------------------------------------------
3.&nbsp;&nbsp;while문
----------------------------
> * **while문**
>   
>   ```
>   형식:
>   while(조건식){
>         처리
>         연산식
>   }          
>   ```
>   
>   ```
>   ex )
>   
>    int w;
>    w = 0;
>    while(w < 5) {
>            System.out.println("while loop w = " + w);
>            w++;
>    }    
>    
>    //console 출력결과 :      
>                        while loop w = 0
>                        while loop w = 1
>                        while loop w = 2
>                        while loop w = 3
>                        while loop w = 4
>      ```
>      
>  * **do ~ while문**
>    
>    ```
>    형식:
>    
>     do{
>         처리
>         연산식
>     }while(조건식);
>     ```
>     
>     ```
>     ex )
>     
>     int dw;
>     dw = 0;
>     do {
>             System.out.println("do while loop");
>             dw++;
>     }while(dw < 5); 
>     
>     //console 출력결과 : 
>                        do while loop
>                        do while loop
>                        do while loop
>                        do while loop
>                        do while loop            
>    ```
------------------------------------------------------
    

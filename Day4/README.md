Day4
====
1.&nbsp;배열
------
>  - **배열 : 같은 자료형 변수의 묶음을 뜻함.**   
>  
>     배열을 쓰는 목적 : 변수들을 관리하기 위해 쓰임, 주로 통계에 많이 쓰임.   
>  - **배열의 형식**
>
>    자료형 배열변수명[ ] = new 자료형[배열의 총 개수]    
>    
>    ```   
>    ex )   
>    
>    int Array[] = new int[10];  
>    -> 10 == Array.length (배열의 길이) 
>    -> new는 동적할당, 동적할당 : 정해지지 않은 갯수로, 본인이 결정해서 할당함을 의미;   
>    ```   
>    [number] -> [ ]안에 있는 number 를 index number 라고 함, 배열변수에 접근하기 위한 번호 , 0 ~ Array.length-1
>   
>    ```
>    ex )   
>    
>    Array[0] = 1;
>    Array[1] = 2;
>    Array[2] = 3;
>      :
>    Array[9] = 10;
>    ```
>    
>   * **배열 복사**   
>     ```
>     자료형 배열변수명1 = { 1, 2, 3, 4, };   
>     자료형 배열변수명2 = 배열변수명1;   
>     ```
>     -> 배열변수명 2에 배열변수명1의 배열이 그대로 복사   

--------------------------------------------------------------------------
2.&nbsp;형변환
------------------
> * **자동 (자료)형 변환** 
> -> 낮은 우선순위의 자료형에서 높은 우선순위의 자료형으로 변환할 때 사용   
> 
> ```   
>  ex )   
>  
>  short sh = 12345;
>  int num;
>  num = sh;
>  System.out.println(num); ->  console창 출력결과 : 12345
>  
>  double d;
>  d = num;
>  System.out.println(d); -> console창 출력결과 : 12345.0   
>  ```
>  
> * **강제 (자료)형 변환**   
> -> cast 형변환 , 자동 형변환의 반대 의미이며, 강제로 형변환을 함   
> -> 정수형에서 실수형으로 변환할 때 주로 사용.   
> 
> ```
>  ex )   
>  
>  int number 256;
>  float f;
>  f = (float)number;
>  System.out.println(f); -> console창 출력결과 : 256.0
>  ```   
>  
> 
>  ```
>   ex ) *예외*   
>   
>   float f;
>   f = 3 / 2;
>   System.out.println(f); -> console창 출력결과 : 1.0
>   -> 출력 결과를 1.5로 예상했지만 1.0이 나왔다. 예상한 값 1.5를 출력하기 위해서는 다음과 같이 수정을 해야한다.    
>     
>   f = 3 / 2; -> f = (float)3 / 2;
>   -> 정수인 3이나 2중 하나를 (float)해줌으로 강제로 형변환이 되며, 수정 후 출력결과는 실수의 연산값이 나온다.   
>  ```   

---------------------------------------------------------------------------------   
 3.&nbsp;&nbsp;문자열 함수
 ---------------------------------
 >  * **함수란?**   
 >    Java에서 함수란 클래스의 기능을 뜻함.
 >   
 >    대표적으로 쓰이는 문자열 클래스를 간단한 예제들을 통해 알아보려 한다.   
 >    
 >    * **비교 함수(equals)**
 >     
 >     ```
 >     ex )
 >      
 >      String str3 = "world";
 >      String str4 = "word";
 >      
 >      boolean b = str3.equals(str4);
 >      System.out.println(b);
 >      
 >      -> console창 출력결과 : false   
 >      ```   
 >      
 >       * **위치 탐색 함수( indexOf / lastIndexOf )**
 >       
 >       ```   
 >       ex )
 >       
 >       String str5 =  "abcdeabcde"; // [0] ~ [9]
 >       int index = str5.indexOf("c"); // c의 위치를 문자열 앞에서 부터 탐색   
 >       System.out.println(index);
 >       
 >       -> console 출력결과 : 2
 >       
 >       int lastIndex = str5.lastIndexOf("c");
 >       System.out.println(lastIndex);
 >       
 >       -> console 출력결과 : 7
 >       ```   
 >       
 >       * **수정 함수(replace)**
 >       
 >       ```   
 >       ex )   
 >       
 >        String str6 = "A*B*C*D";
 >        String reStr = str6.replace("*","-"); // replace("기존 문자","수정 문자")   
 >        System.out.println(reStr);
 >        
 >        -> console 출력결과 : A-B-C-D
 >      ```   
 >      
 >       * **split 함수**   
 >        문자열을 token으로 자를 수 있음.   
 >        ex ) "홍길동-24-2000/02/17/서울시" &nbsp;&nbsp; -> &nbsp;&nbsp;'-' == token   
 >           
 >       ```
 >       ex )
 >       
 >        String str7 = "홍길동-24-2000/02/17-서울시";
 >        String split[] = str7.split("-");
 >        System.out.println(split[0]); // "-"token이 사라지고 index number 0에 선언된 홍길동이 출력됨   
 >        
 >        -> console 출력결과 : 홍길동 
 >      ```   
 >      
 >       * **substring 함수**   
 >        문자열의 범위를 설정해서 자를 수 있음.   
 >        
 >       ```
 >        ex )   
 >        
 >        String str8 = "홍길동-24-2000/02/17-서울시";
 >        String name = str8.substring(0, 3); // (시작위치, 이 위치 전까지)   
 >        System.out.println(name);
 >        
 >        console 출력결과 : 홍길동
 >       ```   
 >       
 >       * **toUpperCase / toLowerCase 함수**
 >       
 >       ```
 >       ex )  
 >       
 >       String str9 = "abcDEF";
 >       
 >       //문자열 -> 대문자로 (toUpperCase)
 >       String upStr = str9.toUpperCase();
 >       System.out.println(upStr);
 >       
 >       console 출력결과 : ABCDEF
 >       
 >       //문자열 -> 소문자로 (toLowerCase)
 >       String lowStr = str9.toLowerCase();
 >       System.out.println(lowStr);
 >       
 >       console 출력결과 : abcdef
 >       ```   
 >       
 >       * **trim 함수**   
 >        문자열의 앞위의 공백을 제거
 >        
 >       ```
 >       ex )
 >       
 >       String str10 = " java java java ";
 >       String trimStr = str10.trim();
 >       System.out.println(trimStr);
 >       
 >       console 출력 : java java java
 >      ```
 >      
 >     * **charAt 함수**   
 >      배열처럼 사용할 수 있는 함수 0 ~ n-1
 >       
 >      ```
 >      ex )
 >      
 >      String str11 = "가나다라마";
 >      char c = str11.charAt(0); // == str11[0]
 >      System.out.println(c);
 >      
 >      console 출력 : 가
 >     ```   
 >      
 >     * **contains 함수**   
 >      문자열을 탐색하는 함수
 >       
 >      ```
 >      ex )
 >       
 >       String str12 = "서울시 강남구";
 >       boolean b1 = str12.contains("강남"); // str12에 "강남" 이 포함 되는지를 true/false로 구분   
 >       System.out.println(b1);
 >       
 >       console 결과 : true
 >      ```
 -----------------------------------------------------------------------------------
  4.&nbsp;&nbsp;Wrapper Class
  ------------------------------------
 > * 일반 자료형 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;->&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Wrapper class   
 > &nbsp;&nbsp;&nbsp;boolean &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Boolean   
 > &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;byte &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Byte   
 > &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;short &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Short   
 > &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;int &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Integer   
 > &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;long&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Long   
 > &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;float&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Float   
 > &nbsp;&nbsp;&nbsp;&nbsp;double &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Double   
 > &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;char &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Character   
 > &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;char[] &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String   
 > 
 >   -> Integer , Double , String 이 주로 사용됨.
 >   
 >    ```
 >    ex )
 >    
 >    // 숫자(Integer) -> 문자열(String) : 숫자의 변수 + "" or toString
 >    
 >    int number = 123;
 >    String s = number + "";
 >    System.out.println(number);
 >    
 >    Integer inumber = 123;
 >    String s1 = inumber.toString();
 >    System.out.println(inumber);
 >    
 >    console 출력결과 : 123
 >    
 >    // 문자열(String) -> 숫자(Integer) : parseInt 함수 -> *매우 유용*
 >    
 >    String strNum = "1024";
 >    int num = Integer.parseInt(strNum);
 >    System.out.println(num);
 >    
 >    console 출력결과 : 1024
 >    
 >    String strNumber = "123.4567";
 >    double dnum = Double.parseDouble(strNumber);
 >    System.out.println(dnum);
 >    
 >    console 출력결과 : 123.4567
 >    ```   
 ----------------------------------------------------------------------------------



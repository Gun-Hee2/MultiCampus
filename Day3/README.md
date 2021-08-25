Day3
====
상수
------
> - **상수(숫자) : 변할 수 없는 수(지정 숫자)**
> 
>   상수는 2진수, 8진수, 10진수, 16진수로 표현이 가능.
>  
>    2진수: 0, 1 사용 
>   8진수: 0 ~ 7
>   10진수: 0 ~ 9 
>   16진수: 0 ~ 9, A, B, C, D, E, F  &nbsp;&nbsp;&nbsp;->&nbsp; &nbsp;&nbsp;&nbsp;A ~ F는 10 ~ 15와 같음.   
> 
----

Variable(변수)
-----------------
> - **변수: 값을 저장하기 위한 공간**
> 
>   변수는 그릇이라고 생각할 수 있으며, 그릇에 담아지는 내용물을 데이터라고 생각 가능.
> 
>   -> 데이터의 종류에는 (정수, 실수, 문자열, 문자, 논리(true,false))등이 있고, 데이터의 종류에 따라 자료형이 다름.
>
>   > **자료형**
>   >자료형 : **int**(정수), **float**(실수), **double**(실수), **String**(문자열), **char**(문자), **boolean**(논리)
>   -> 실수 자료형은 대체적으로 **double**을 자주 사용.
>  
>  - **변수명 작명의 규칙**
>  
>    자료형 변수명;&nbsp;&nbsp; ->&nbsp;&nbsp; 변수의 선언
>    ex) int number; &nbsp;&nbsp;->&nbsp; 정수 자료형 변수 number를 선언
>    
>    * **작명시 유의할 점**
>    
>      ex) int int; &nbsp;&nbsp;-> &nbsp;&nbsp;변수명으로 예약어 사용 X
>      ex) int 2a; &nbsp;&nbsp;-> &nbsp;&nbsp;변수명의 맨 앞에 숫자 X
>      ex) int 243; &nbsp;&nbsp;-> &nbsp;&nbsp;변수명으로 상수 사용 X 
>      ex) int _abc; &nbsp;&nbsp;-> &nbsp;&nbsp;변수명의 맨 앞에 _사용은 가능하지만 권장하지 않음.
>     
>      **변수명을 작명할 때 자신이 제일 편하게 알아볼 수 있는 변수명이 좋다.**
>
-----
표준 입/출력
------
> - **Java에서는 System클래스를 통해 기본적인 console창과 키보드를 통해 입출력을 나타냄.**
> - **System클래스 안에는 in, out 등의 멤버 변수가 있으며, 입력과 출력을 뜻함.**   
> 
> **출력**
>  >  System.out.print();&nbsp; &nbsp;->&nbsp;&nbsp; 출력을 확인하거나 연산결과를 확인.
>  ```
>  ex)
>  System.out.print("Hello World");
>  System.out.print("Hello My World");
>  ```
>  -> console창에 Hello WorldHello My World가 출력됨.
>  -> 개행이 되지 않고 출력됨.
> 
>  > System.out.println();&nbsp;&nbsp;->&nbsp;&nbsp; 개행해서 출력
>  ```
>  ex)
>  System.out.println("Hello World");
>  System.out.println("Hello My World");
>  ```
>  
>  ```
>  <console창 출력>
>  Hello World
>  Hello My World
>  ```
> 
>  -> 개행이 되고 출력됨.
>
>**입력**
>   * **입력을 할때는 Scanner클래스가 필요함**
>  -> Scanner클래스 호출을 위해 import문이 필요함.
>   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-> import java.util.Scanner;
>   * **Scanner클래스 호출 후 Scanner객체 생성**
>   -> Scanner scanner = new Scanner(System.in);
>   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-> Scanner 객체이름 = new Scanner(System.in);
>   * **Scanner객체 생성 후, 변수를 설정하여 출력하고 싶은 변수를 출력**
>   -> 변수 = 객체이름.next자료형();
>   -> System.out.println(변수);
>  ```
>  ex) 
>  import java.util.Scanner;
>public class Input {
>
>	public static void main(String[] args) {
>		// TODO Auto-generated method stub
>		Scanner scan = new Scanner(System.in);
>		int num;
>		num = scan.nextInt();
>		System.out.println(num);
>	}
>
>}
>  ```
>  -> Run을 해주고 console창에 원하는 숫자를 키보드로 입력하면 입력한 숫자가 출력됨.
---------

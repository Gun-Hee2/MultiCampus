Day8
====
1.&nbsp;&nbsp;클래스
---------------------------
> * **클래스**
>    ```
>   ex )
>   
>    public class Computer{
>    
>    }
>    ->  다음과 같이 컴퓨터 클래스를 만들 수 있음, 가장 간단한 형태의 클래스이며,    
>    클래스의 선언만 있고 껍데기 뿐인 클래스이다. 껍데기 뿐이지만 객체를 만들 수 있는 중요한 기능을 가지고 있다.
>    ```   
>    
>    ```
>    Computer monitor = new Computer();
>    -> new는 객체를 생성할 때 사용하는 키워드 이며 동적할당을 의미한다.   
>    이렇게 하면 Computer클래스의 인스턴스(instance)인 monitor, 즉 Computer의 객체가 만들어 진다.
>    ```
>    
>  * **메소드**
>      메소드는 클래스 내에 구현된 함수를 의미하는데 보통 함수라고 말하지 않고 메소드라고 말한다.
>      ```
>      ex  )
>      
>      public class Computer{
>          String brand;    // -> 객체 변수
>          
>          public void setBrand(String brand){
>              this.name = name;
>          }
>     ```
>     Computer클래스에 추가된 setBrand메소드는 다음 형태의 메소드이다.
>      
>       * 입력 : String brand   
>       
>       * 출력 : void(return값 없음)   
>       
>         -> 즉, 입력으로 brand라는 문자열을 입력받고 출력은 없는 형태의 메소드이다.   
>       
---------------------------------------------------------------------------------------------------------
2.&nbsp;&nbsp;OOP
-----------------------------------------------------------------
> * **OOP**
>   OOP란 Object Oriented Programing의 약어로, 객체 지향 프로그래밍을 뜻한다.
>   
```
ex ) 간단한 계산기 클래스를 예로 들어 다형성을 보려한다.
// Calculator.java

package cal;

import java.util.Scanner;

public class Calculator {

	// 객체 변수 생성
	
	int num1;            
	int num2;
	String operator;
	int result;
	
	// input(입력)메소드 생성 -> 연산할 숫자 2개와 원하는 연산의 기호를 입력
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연산할 숫자를 적으세요: ");
		num1 = sc.nextInt();
		
		System.out.print("원하는 연산의 기호를 적으세요: ");
		operator = sc.next();
		
		System.out.print("연산할 숫자를 적으세요: ");
		num2 = sc.nextInt();
	}
	
	// calculator(계산기)메소드 생성 -> input메소드에서 입력받은 숫자 2개와 연산의 기호로 계산
	
	public void calculator() {
		if(operator.equals("+")) {
			result = num1 + num2;
		}
		else if(operator.equals("-")) {
			result = num1 - num2;
		}
		else if(operator.equals("*")) {
			result = num1 * num2;
		}
		else if(operator.equals("/")) {
			result = num1 / num2;
		}
	}
	
	// print(연산결과 출력)메소드 생성 -> input메소드와 calculator메소드에서 나온 결과로 출력
	
	public void print() {
		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	}

}
```

```
// OOP.java

package main;

import cal.Calculator;
import mycls.MyClass;

public class OOP {

	public static void main(String[] args) {
		
		Calculator ca = new Calculator(); 
		// Calculator클래스의 인스턴스인 ca, 즉 Calculator의 객체가 만들어진다.
		
		ca.input(); // Calculator클래스의 input(입력)메소드 호출
		ca.calculator(); // Calculator클래스의 calculator(계산기)메소드 호출
		ca.print(); // Calculator클래스의 print(연산결과 출력)메소드 호출
		
	}

}
//  OOP클래스를 실행하면 Calculator클래스의 메소드들을 차례대로 호출하여 수행한다.
```
-------------------------------------------------------------------------------------------------------------------------------

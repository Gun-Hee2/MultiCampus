Day6
====
1.&nbsp;&nbsp;2차원 배열
--------------------------------   
> * **2차원 배열**   
>   2차원 배열이란 배열의 배열을 의미한다.
>    ```
>    형식:   
>      int array2[][] = new int[3][4];
>    int array2[][] = {
>      { 1, 2, 3, 4 },
>      { 5, 6, 7, 8 },
>      { 9, 10, 11, 12},
>   };
>  
>   ex ) 
>      array[1][2] => 7
>     ```   
>   
>    ```
>   ex )
>   
>   char cArray[][] = { // = new int[2][5];
>           { 'H', 'e', 'l', 'l', 'o' },
>           { 'W', 'o', 'r', 'l', 'd' },
>   };
>   System.out.println(cArray[1][2]);
>   
>   //console 출력결과 : r
>   ```   

2.&nbsp;&nbsp;Sorting   
----------------------------  
> * **Sorting** : 정렬(선택)   
>   선택 정렬은 오름차순과 내림차순으로 구분된다.
>   ```
>   ex)  
>   5 2 4 1 3
>   
>   1 2 3 4 5 -> 오름차순
>   5 4 3 2 1 -> 내림차순
>   ```
>   
>   ```
>   ex )
>   
>   int numbers[] = { 5, 1, 10, 2, 9, 3, 8, 4, 6, 7 };
>   int temp;
>   for(int i = 0; i < numbers.length - 1; i++) {
>       for(int j = i + 1; j < numbers.length; j++) {
>           if(numbers[i] > numbers[j]) { //오름차순
>                                         
>               temp = numbers[i];
>               numbers[i] = numbers[j];  ->  swap(교환)방식
>               numbers[j] = temp;
>           }
>       }
>   }
>   for(int i = 0; i < numbers.length; i++) {
>       System.out.print(numbers[i] + " ");
>   }
>   
>   //console 출력결과 : 1 2 3 4 5 6 7 8 9 10
>   ```   

3.&nbsp;&nbsp; 함수
------------------------   
>    * **method함수**
>       ```
>       형식 :
>       return값의 자료형 함수명( 매개변수, parameter ){
>           처리
>           return 값;
>       }
>       ```
>       
>       ```
>       ex )
>       
>       public class MethodSample {
>           public static void main(String[] args) {
>           
>               int rArr[] = getArray();
>               for(int num : rArr) { //foreach문
>                   System.out.println(num);
>               }
>           }
>           static int[] getArray() {  //  ->  자료형: 정수형 배열, // 함수명: getArray, // parameter: X
>               System.out.println("getArray() 호출");  //  ->  처리
>               
>           	int array[] = new int[3];
>           	array[0] = 111;
>           	array[1] = 222;
>           	array[2] = 333;
>           
>           	return array;  //  ->  array[]배열을 리턴
>           }
>      }
>      
>      //console 출력결과 :   
>                           getArray() 호출
>                           111
>                           222
>                           333
>       ```
------------------------------------------------------------------------------------------------------------------------------               

Day7
====
1.&nbsp;&nbsp;오버로드
------------------------------
> * **오버로드**   
>   함수(method)명은 같지만 매개변수(parameter)의 자료형이나 갯수가 다른 것을 의미한다. -> 매개변수로 구분   
>   
>   ```
>   ex)
>      print() -> 매개변수없는 함수
>      print(int i) -> 매개변수가 있음
>      print(char c)
>      print(int i, char c)
>      print(char c, int i) -> 위와 함수명은 같고 매개변수의 순서만 다르지만 다른함수로 인식을 함
>    ```
>    
----------------------------------------------------------------------------------------------------------------------------
2.&nbsp;&nbsp;예외(Exception)
---------------------------------------
> * **예외**   
>   예외는 에러와 다른 의미이다.   
>   
>   - 자주 발생하는 유형   
>       number    형식 위반   
>        array     범위 초과  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; -> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ex ) int arr[] = new int[3];      arr[3] = 12;   
>          class   없는 class   
>          file   파일 없음   
>          
>     
>
>    ```
>     형식:   
>     
>     try {
>        // 예외가 발생될 수 있는 코드
>      
>     }catch(예외 클래스1 e){
>        예외1 메시지를 출력
>     }catch(예외 클래스1 e){
>        예외2 메시지를 출력
>     }catch(예외 클래스1 e){
>        예외3 메시지를 출력
>     }
>     ```
>     
>     ```
>     ex )
>     
>     // ArrayIndexOutOfBoundsException
>     int arr[] = { 1, 2, 3 };
>     try {
>         arr[3] = 'A';  // -> 예외발생
>     }
>     catch(ArrayIndexOutOfBoundsException e) {  //  - > 예외 클래스를 넣어줌으로써 오류를 출력 하지않고 처리를 함   
>         System.out.println("배열범위 초과");
>     }
>     
>     //console 출력결과 : 배열범위 초과
>     ```
-------------------------------------------------------------------------------------------------
3.&nbsp;&nbsp;File(파일)
------------------------------
> * **File**   
> 
>    ```
>    //파일 생성
>    
>    File newfile = new File("c:\\temp\\newfile.txt"); // 파일의 객체(정보)를 생성
>    try {
>        if(newfile.createNewFile()) {     //  파일 생성
>            System.out.println("파일 생성 성공");  // 파일이 성공적으로 생성되면 출력, 만약 첫 생성 후 다시 실행하면 한번 생성되어 이미 존재하므로 else문의 파일 생성 실패가 출력된다.   
>        }
>        else {
>            System.out.println("파일 생성 실패");
>        }
>    }catch(IOException e) {
>        e.printStackTrace();
>    }
>    ```   
>    
>    ```
>    //파일의 존재 여부
>    
>    if(newfile.exists()) {  // -> true/false로 구분
>	    	System.out.println("newfile.txt가 존재합니다");  //  파일이 지정된 경로에 존재하면 if문의 결과를 출력
>	 }else {
>	    	System.out.println("newfile.txt가 존재하지 않습니다");
>	}
>   ```
>   
>   ```
>   //파일 쓰기, 추가쓰기
>   
>   import java.io.BufferedWriter;
>   import java.io.File;
>   import java.io.FileWriter;
>   import java.io.IOException;
>   import java.io.PrintWriter;
>   public class fileWrite {
>	    public static void main(String[] args)  {
>	        File file = new File("c:\\temp\\newfile.txt");
>	        try {
>			    //쓰기
>			    FileWriter fwriter = new FileWriter(file);
>			    fwriter.write("안녕" + "\n");
>			    fwriter.write("World");
>
>		        //추가 쓰기
>			    FileWriter fwriter = new FileWriter(file, true);
>			    fwriter.write("반갑습니다");
>			    fwriter.close();  // fwriter에서 write를 하고 무조건 close()를 해줘야한다.
>    ```
>    
>    ```
>    //파일 읽기
>    
>    import java.io.BufferedReader;
>    import java.io.File;
>    import java.io.FileNotFoundException;
>    import java.io.FileReader;
>    public class fileReadClass {
>        public static void main(String[] args) {
>            File file = new File("c:\\temp\\newfile.txt");
>            try {
>			        // 한 글자씩 읽기
>			        /*
>	     		FileReader fr = new FileReader(file);
>		     	int ch;
>		    	    while((ch = fr.read()) != -1) { //파일 끝날때까지
>		    		    System.out.println((char)ch);
>			        }
>			        fr.close();
>			        */
>
>			        // 한 문장씩 읽기
>			        FileReader fr = new FileReader(file);
>			        BufferedReader br = new BufferedReader(fr);
>
>			        String str = "";
>			        while( (str = br.readLine()) != null ) {
>				        System.out.println(str);
>			        }
>			        br.close();
>		     } catch (Exception e) {
>			        e.printStackTrace();
>		     }
>		 }
>   }
>   ```
---------------------------------------------------------------------------------------
    

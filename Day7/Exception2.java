import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception2 {

	public static void main(String[] args) {
		
		String str = null;
		// NullPointerException
		
		try {
			System.out.println(str.length());
		}catch(NullPointerException e) {
			System.out.println("str이 null입니다");
		}
		// ArrayIndexOutOfBoundsException
		int arr[] = { 1, 2, 3 };
		
		try {
			arr[3] = 'A';
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열범위 초과");
		}
	/*	catch(Exception e) {
			System.out.println("예외발생");
		}*/
		
		
		// FileNotFindException
		File file = new File("d:\\xxx");
		FileInputStream is;
		try {
			is = new FileInputStream(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		// StringIndexOutofBoundsException
		String str1 = "java";
		
		try {
			str1.charAt(4);
		}catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		// NumberFormatException
		try {
			int i = Integer.parseInt("123a5");
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}

	}

}

package fileWrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class fileWrite {

	public static void main(String[] args)  {
		
		File file = new File("c:\\temp\\newfile.txt");
		
		try {
			
			//쓰기
			/*
			FileWriter fwriter = new FileWriter(file);
			fwriter.write("안녕" + "\n");
			fwriter.write("World");
			*/
			
			//추가 쓰기
			/*기본
			FileWriter fwriter = new FileWriter(file, true);
			fwriter.write("반갑습니다");
			fwriter.close();  // fwriter에서 write를 하고 무조건 close()를 해줘야한다.
			*/
			
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			pw.println("안녕하세요");
			pw.print("hello");
			pw.println("world");
			
			pw.close();
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

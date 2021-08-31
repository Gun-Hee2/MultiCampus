
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class DatasClass {

	public static void main(String[] args) throws Exception {
		
		String human[][] = { 
				{"성춘향", "16", "남원시", "156.0"},		// "성춘향-16-남원시-156.0"
				{"홍길동", "24", "서울시", "172.0"},
				{"임정", "27", "부산직할시", "180.1"},		// "임정-27-부산직할시-180.1"
		};
		
		String datas[] = new String[human.length];		// nul == 빈칸 != null
		
		for (int i = 0; i < datas.length; i++) {
			datas[i] = human[i][0] + "-" + human[i][1] + "-" + human[i][2] + "-" + human[i][3];  
		}
		/*
		for (String s : datas) {
			System.out.println(s);
		}
		*/
		
		String filename = "human1.txt";
		File file = new File("c:\\temp\\" + filename);
		
		// 파일 생성
		if(file.createNewFile()) {
			System.out.println(filename + "파일이 생성되었습니다");				
		}else {
			System.out.println(filename + "과 같은이름의 파일이 있습니다");
		}
		
		// 파일 저장			
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		for (int i = 0; i < datas.length; i++) {
			pw.println(datas[i]);
		}
		pw.close();
		
		// -------------------------------------------------------------------------
		
		// 파일 읽기		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String arrStr[] = new String[3];
		
		String str = "";
		int count = 0;
		while((str = br.readLine()) != null) {
			arrStr[count] = str;
			count++;
		}
		
		for (String s : arrStr) {
			System.out.println(s);
		}
		
		String member[][] = new String[arrStr.length][4];
		
		/*
		String firstMem = arrStr[0];
		String split[] = firstMem.split("-");
		member[0][0] = split[0];
		member[0][1] = split[1];
		member[0][2] = split[2];
		member[0][3] = split[3];
		
		System.out.println( Arrays.toString(member[0]) );
		*/
		
		for (int i = 0; i < arrStr.length; i++) {
			String split[] = arrStr[i].split("-");
			member[i][0] = split[0];
			member[i][1] = split[1];
			member[i][2] = split[2];
			member[i][3] = split[3];
		}
		
		for (int i = 0; i < member.length; i++) {
			for (int j = 0; j < member[i].length; j++) {
				System.out.print(member[i][j] + " ");
			}
			System.out.println();
		}
	}
	

}
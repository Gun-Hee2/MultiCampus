package book;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import book.Bookdto;

public class Bookdao {
	Scanner sc = new Scanner(System.in);
	
	private List<Bookdto> list = new ArrayList<Bookdto>(); 
	
	public Bookdao() {
		
	}
	
    public void insert() { // 책에 관한 정보들을 리스트에 삽입한다.
    	
		System.out.print("바코드 = ");
		int isbn = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서 제목 = ");
		String title = sc.nextLine();
		
		System.out.print("저자 = ");
		String author = sc.nextLine();
		
		System.out.print("출판사 = ");
		String publisher = sc.nextLine();
		
		System.out.print("가격 = ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("설명 = ");
		String desc = sc.nextLine();
		
		list.add(new Bookdto(isbn, title, author, publisher, price, desc));
		
		System.out.println("삽입 되었습니다");
		
	}
    
	public void select() {	// 책에대한 정보 검색
		System.out.print("검색할 책이름을 입력 >> ");
		String title = sc.nextLine();
		// 검색
		int findIndex = search(title);
		
		// 출력
		if(findIndex == -1) {
			System.out.println("책정보 목록에 없습니다");
		}
		else {
			Bookdto dto = list.get(findIndex);
			System.out.println("********************" + " 도서목록 " + "**********************");
			System.out.println(dto.toString());
		}
	}
	
	public void filesave() { // 리스트에 저장되어 있는 목록중 원하는 책 제목을 입력하여 고른 후 책에 대한 정보에 대해 파일을 저장한다.
		System.out.print("파일저장을 원하는 책제목을 입력해주세요: ");
		String title = sc.nextLine();
		
		int findIndex = search(title);
		
		if(findIndex == -1) {
			System.out.println("책 목록에 없습니다");
		}
	// 입력된 제목에 해당되는 리스트 출력	
		else {
			Bookdto dto = list.get(findIndex);
			System.out.print("저장할 파일의 파일명을 입력해주세요(단, 파일의 형식을 반드시 표기해주세요.): ");
			String filename = sc.next();
			File file = new File("c:\\temp\\" + filename);
			try {
				file.createNewFile();
				FileWriter fwriter = new FileWriter(file);
				fwriter.write(dto.toString());
				fwriter.close();
			} catch (Exception e) {
					e.printStackTrace();
			  }
				
		}
	}
	
	public void fileload() { // 저장했던 책에대한 정보가 담긴 파일을 불러온다.
		System.out.print("파일불러오기를 원하는 책제목을 입력해주세요: ");
		String title = sc.nextLine();
		
		int findIndex = search(title);
		
		if(findIndex == -1) {
			System.out.println("책 목록에 없습니다");
		}
		else {
			System.out.print("불러올 파일의 파일명을 입력해주세요(단, 파일의 형식을 반드시 표기해주세요.): ");
			String filename = sc.next();
			File file = new File("c:\\temp\\" + filename);
			try {
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				
				String str = "";
				while( (str = br.readLine()) != null ) {
					System.out.println(str);
				}
				br.close();
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public int search(String title) { //책 정보에 대해서 책 제목으로 검색을 하는 기능의 메소드
		int findIndex = -1;
		for(int i = 0;i < list.size(); i++) {
			Bookdto dto = list.get(i);
			if(title.equals(dto.getTitle())) {
				findIndex = i;
				break;
			}			
		}
		return findIndex;
	}

}

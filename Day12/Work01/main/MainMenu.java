package main;

import java.util.Scanner;

import book.Bookdao;
import magazine.Magazinedao;

public class MainMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Bookdao bdao = new Bookdao();
		Magazinedao mdao = new Magazinedao();
		
		while(true) { // "도서"와 "잡지"중 원하는 항목을 입력받아 구분해서 실행한다.
			System.out.println("도서와 잡지중 어떤 항목의 관리를 원하십니까?");
			System.out.print(">> ");
				
			String value = sc.next();
			
			int work = 0;
			
			if(value.equals("도서")){ // "도서"를 입력받을 시 도서에 대한 관리기능들 실행.
				System.out.println("1.도서정보 생성");
				System.out.println("2.도서정보 검색");
				System.out.println("3.도서정보 저장");
				System.out.println("4.도서정보 불러오기");
				
				System.out.println("어느 작업을 하시겠습니까?");
				System.out.print(">> ");
				
				work = sc.nextInt();
				switch(work) {
			    case 1:
			    	bdao.insert();
			    	break;
			    case 2:
			    	bdao.select();
			    	break;
			    case 3:
			    	bdao.filesave();
			    	break;
			    case 4:
			    	bdao.fileload();
			    	break;
			    }
			}else if(value.equals("잡지")){ // "잡지"를 입력받을 시 도서에 대한 관리기능들 실행.
				System.out.println("1.잡지정보 생성");
				System.out.println("2.잡지정보 검색");
				System.out.println("3.잡지정보 저장");
				System.out.println("4.잡지정보 불러오기");
				
				System.out.println("어느 작업을 하시겠습니까?");
				System.out.print(">> ");
				
				work = sc.nextInt();
				switch(work) {
			    case 1:
			    	mdao.insert();
			    	break;
			    case 2:
			    	mdao.select();
			    	break;
			    case 3:
			    	mdao.filesave();
			    	break;
			    case 4:
			    	mdao.fileload();
			    	break;
			    }
			}
			System.out.print("다른 관리를 하시겠습니까?(y/n) = "); // 한번의 관리를 하고난 후 재 실행 여부를 묻는다.
			String again = sc.next();
			
			if(again.equals("n")) {
				System.out.println("안녕히 가십시오.");
				break;
			}
			System.out.println("다시 시작합니다 >>");
			
		}

	}

}

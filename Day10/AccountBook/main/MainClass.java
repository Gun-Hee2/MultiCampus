package main;

import java.util.Scanner;

import dao.AccountBookdao;

public class MainClass {

	public static void main(String[] args) {
		/*
		    가계부
		  
		    날짜 2021/09/07
		    금액 
		    수입/지출
		    제목
		    내용
		    
		    추가
		    삭제
		    검색(제목, 검색)
		    수정
		    
		    //모두출력, 파일저장, 불러오기
		*/
		
		Scanner sc = new Scanner(System.in);
		
		AccountBookdao dao = new AccountBookdao();
		
		while(true) {
			System.out.println("1.가계부 목록 추가");
			System.out.println("2.가계부 목록 삭제");
			System.out.println("3.가계부 목록 검색");
			System.out.println("4.가계부 목록 수정");
			System.out.println("5.가계부 목록 모두 출력");
			
			System.out.println("어느 작업을 하시겠습니까?");
			System.out.print(">> ");
			
			int work = sc.nextInt();
			
			switch(work) {
			    case 1:
			    	dao.Create();
			    	break;
			    case 2:
			    	dao.Delete();
			    	break;
			    case 3:
			    	dao.Read();
			    	break;
			    case 4:
			    	dao.Update();
			    	break;
			    case 5:
			    	dao.allprint();
			    	break;	
			}
			System.out.print("다른 가계부 활동을 하시겠습니까?(y/n) = ");
			String again = sc.next();
			
			if(again.equals("y")) {
				System.out.println("가계부 활동을 다시 시작합니다 >>");
				
			}else if(again.equals("n")){
				System.out.println("가계부 활동을 종료합니다");
				
			}
			
			
		}

	}

}

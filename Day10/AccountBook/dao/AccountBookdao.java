package dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import dto.AccountBookdto;

public class AccountBookdao {
	Scanner sc = new Scanner(System.in);
	
	private List<AccountBookdto> list = new ArrayList<AccountBookdto>();
	
	public AccountBookdao() {
		list.add(new AccountBookdto("2021/9/7", 15000, "지출", "키보드", "키보드값15000원"));
		list.add(new AccountBookdto("2021/9/7", 25000, "수입", "송금", "더치페이값25000원"));
		list.add(new AccountBookdto("2021/9/7", 4500, "지출", "담배", "담배값4500원"));
		
	}
	
	public void Create() {
		
		String date = calendar();
		
		System.out.println("날짜: " + date);
		
		System.out.print("금액: ");
		int price = sc.nextInt();
		
		System.out.print("수입/지출: ");
		String income = sc.next();
		
		System.out.print("제목: ");
		String title = sc.next();
		
		System.out.print("내용: ");
		String content = sc.next();
		
		list.add(new AccountBookdto(date, price, income, title, content));
		
	}
	
	public void Delete() {
		
		System.out.print("제목/날짜 중에 원하는 항목을 입력해주세요: ");
		String text = sc.next();
		if(text.equals("제목")) {
			System.out.print("제목을 입력해주세요: ");
			String title = sc.next();
			
			int findIndex = searchtitle(title);
			
			if(findIndex == -1) {
				System.out.println("가계부 목록에 없습니다");
			}
			else {
				list.remove(findIndex);
				
				System.out.println("가계부 목록에서 삭제했습니다");
			}
		}
		else if(text.equals("날짜")) {
			System.out.print("날짜를 입력해주세요: ");
			String date = sc.next();
			
			int findIndex = searchdate(date);
			
			if(findIndex == -1) {
				System.out.println("가계부 목록에 없습니다");
			}
			else {
                list.remove(findIndex);
				
				System.out.println("가계부 목록에서 삭제했습니다");
			}
		}
	}
	
	public void Read() {
		System.out.print("제목/날짜 중에 원하는 항목을 입력해주세요: ");
		String text = sc.next();
		if(text.equals("제목")) {
			System.out.print("제목을 입력해주세요: ");
			String title = sc.next();
			
			int findIndex = searchtitle(title);
			
			if(findIndex == -1) {
				System.out.println("가계부 목록에 없습니다");
			}
			else {
				AccountBookdto dto = list.get(findIndex);
				System.out.println(dto.toString());
			}
		}
		else if(text.equals("날짜")) {
			System.out.print("날짜를 입력해주세요: ");
			String date = sc.next();
			
			int findIndex = searchdate(date);
			
			if(findIndex == -1) {
				System.out.println("가계부 목록에 없습니다");
			}
			else {
				AccountBookdto dto = list.get(findIndex);
				System.out.println(dto.toString());
			}
			
		}
	}
	
	public void Update() {
		System.out.print("제목/날짜 중에 원하는 항목을 입력해주세요: ");
		String text = sc.next();
		if(text.equals("제목")) {
			System.out.print("제목을 입력해주세요: ");
			String title = sc.next();
			
			int findIndex = searchtitle(title);
			
			if(findIndex == -1) {
				System.out.println("가계부 목록에 없습니다");
			}
			else {		
				System.out.println("수정할 가계부 사항을 입력해 주세요");
				
				System.out.print("날짜 = ");
				String date = sc.next();
				
				System.out.print("금액 = ");
				int price = sc.nextInt();
				
				System.out.print("수입/지출 = ");
				String income = sc.next();
				
				System.out.print("제목 = ");
				String title1 = sc.next();
				
				System.out.print("내용 = ");
				String content = sc.next();
				
				AccountBookdto dto = list.get(findIndex);
				dto.setDate(date);
				dto.setPrice(price);
				dto.setIncome(income);
				dto.setTitle(title1);
				dto.setContent(content);
				
				System.out.println("가계부 세부사항을 수정했습니다");
			}	
		}
		else if(text.equals("날짜")) {
			System.out.print("날짜를 입력해주세요: ");
			String date = sc.next();
			
			int findIndex = searchdate(date);
			
			if(findIndex == -1) {
				System.out.println("가계부 목록에 없습니다");
			}
			else {
				System.out.println("수정할 가계부 사항을 입력해 주세요");
				System.out.print("금액 = ");
				int price = sc.nextInt();
				
				System.out.print("수입/지출 = ");
				String income = sc.next();
				
				System.out.print("제목 = ");
				String title = sc.next();
				
				System.out.print("내용 = ");
				String content = sc.next();
				
				AccountBookdto dto = list.get(findIndex);
				dto.setPrice(price);
				dto.setIncome(income);
				dto.setTitle(title);
				dto.setContent(content);
				
				System.out.println("가계부 세부사항을 수정했습니다");
			}
			
		}	
	}
	
	public void allprint() {
		for (int i = 0; i < list.size(); i++) {
			AccountBookdto dto = list.get(i);
			if(dto != null && dto.getIncome().equals("") == false) {
				System.out.println(dto.toString());
			}
		}
	}
	
	public int searchtitle(String title) {
		int findIndex = -1;
		for(int i = 0; i < list.size(); i++) {
			AccountBookdto dto = list.get(i);
			if(title.equals(dto.getTitle())){
				findIndex = i;
				break;
				
			}
		}
		return findIndex;
		
	}
	
	public int searchdate(String date) {
		int findIndex = -1;
		for(int i = 0; i < list.size(); i++) {
			AccountBookdto dto = list.get(i);
			if(date.equals(dto.getTitle())){
				findIndex = i;
				break;
				
			}
		}
		return findIndex;
		
	}
	
	public String calendar() {
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;   
	    int day = cal.get(Calendar.DATE);
	    
	    String date = (year + "/" + month + "/" + day);
	    
	    return date;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

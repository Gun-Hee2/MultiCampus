package dto;

public class AccountBookdto {
	
	private String date;
	private int price;
	private String income;
	private String title;
	private String content;
	
	public AccountBookdto() {
		
	}

	public AccountBookdto(String date, int price, String income, String title, String content) {
		super();
		this.date = date;
		this.price = price;
		this.income = income;
		this.title = title;
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getIncome() {
		return income;
	}

	public void setIncome(String income) {
		this.income = income;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "AccountBookdto [date=" + date + ", price=" + price + ", income=" + income + ", title=" + title + ", content=" + content + "]";
	}

	
	
	

}

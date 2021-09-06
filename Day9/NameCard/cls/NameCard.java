package cls;

public class NameCard {
	String name;
	String phone;
	String email;
	
	public NameCard(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	PrintNameCard printNameCard;
	
	public void setPrintNameCard(PrintNameCard p) {
		printNameCard = p;
	}
	
	public void print() {
		printNameCard.print(this);
	}
	
	PrintPhoneCard printPhoneCard;
	
	public void setPrintPhoneCard(PrintPhoneCard p) {
		printPhoneCard = p;
	}
	
	public void phoneprint() {
		printPhoneCard.print(this);
	}
	
	

}

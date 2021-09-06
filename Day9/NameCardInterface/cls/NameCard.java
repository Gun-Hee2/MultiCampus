package cls;

public class NameCard {
	
	String name;
	String phone;
	String email;
	
	public NameCard(String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	PrintInterface printInterface;
	
	public void setPrintNameCard(PrintInterface p) {
		printInterface = p;
	}
	
	public void print() {
		printInterface.print(this);
	}

}

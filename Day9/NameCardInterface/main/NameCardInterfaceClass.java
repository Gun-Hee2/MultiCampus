package main;

import cls.NameCard;
import cls.PrintInterface;
import cls.PrintNameCard;
import cls.PrintPhoneCard;

public class NameCardInterfaceClass {

	public static void main(String[] args) {
		
		NameCard nc = new NameCard("성춘향", "234-5678", "sch@daum.net");
		
		//PrintInterface p = new PrintNameCard();
		//p.print(nc);
		
		nc.setPrintNameCard(new PrintNameCard());
		nc.print();
		
		nc.setPrintNameCard(new PrintPhoneCard());
		nc.print();
		
		
	}

}

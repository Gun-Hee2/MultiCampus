package cls;

import single.Singleton;

public class HeClass {
	
	private int age;
	
	public void funct() {
		Singleton si = Singleton.getInstance();
		age = si.sage;
	}

	@Override
	public String toString() {
		return "HeClass [age=" + age + "]";
	}
	
	

}

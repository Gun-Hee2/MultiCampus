package st;

public class Student {
	public String name;
	public int ban;
	public int no;
	public int kor;
	public int eng;
	public int math;
	public int total;
	public int average;
	
	public int getTotal(int kor, int eng, int math) {
		this.total = this.kor + this.eng + this.math;
		return total;
	}
	
	public double getAverage() {
		this.average = this.total / 3;
		return average;
	}

}

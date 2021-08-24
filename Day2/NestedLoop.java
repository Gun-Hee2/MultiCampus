
public class NestedLoop {
	public static void main(String[] args) {
		for(int i=1; i<10; i++)	{ 
			for(int j=1; j<10; j++) { // 1단에서 9단
				System.out.print(i + "*" + j + "=" + i*j); // i * j = i*j값
				System.out.print('\t');
			}
			System.out.println();
		}
	}

}

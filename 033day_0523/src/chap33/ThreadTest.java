package chap33;

public class ThreadTest {

	public static void main(String[] args) {
		for(int i =0; i < 300 ; i++) {
			System.out.print("-");
		}
		
		for(int i=0; i<300; i++) {
			System.out.print("|");
		}
	}

}

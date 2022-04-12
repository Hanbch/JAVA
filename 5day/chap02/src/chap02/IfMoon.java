package chap02;

public class IfMoon {

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 7;
		
		//if문
		if(n1 < n2) {
			
			System.out.println("n1 > n2 is true");
			
		}
		
		
		//if else문
				if(n1 == n2) {
					
					System.out.println("n1 == n2 is true");
					
				}
				else {
					
					System.out.println("n1 > n2 is false");
					
				}
				
		// if else if
				
				if(n1 < 0) {
					
					System.out.println("n1 < 0");
					
				}
				else if (n1 < 4) {
					
					System.out.println("n1 < 4");
					
				}
				else {
					
					System.out.println(" 4 이상 ");
					
				}
		
		

	}

}

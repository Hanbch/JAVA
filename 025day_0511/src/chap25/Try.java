package chap25;

import java.util.Scanner;

public class Try {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int n1 = sc.nextInt();
			int n2 =sc.nextInt();
			System.out.println(n1/n2);
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Good Bye~~~~");
	} 
}

package chap13;

import java.util.Scanner; 

public class Scanner_ {
	public static void main(String[] args) {
		String source = "1 3 5 ";
		
		Scanner sc = new Scanner(source);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		System.out.println(sum);
		
		Scanner sc2 = new Scanner(System.in); 
		
		int num4 = sc2.nextInt();
		
		int num5 = sc2.nextInt();
		int num6 = sc2.nextInt();
		
		System.out.println(num4+num5+num6);
		
		Scanner sc3 = new Scanner(System.in); 
		
		System.out.println("문자열 입력: ");
		String str1 = sc3.nextLine();
		
		System.out.println("문자열 입력: ");
		String str2 = sc3.nextLine();
		
		System.out.println("문자열 입력: ");
		String str3 = sc3.nextLine();
		System.out.println(str1 + str2 + str3);
	}
	
}
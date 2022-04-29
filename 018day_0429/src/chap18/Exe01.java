package chap18;
//양의 저수를 10개 입력 받아 배열에 저장하고 
//배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라.

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("숫자입력");
			arr[i] = sc.nextInt();
	}
		
		for(int i =0; i <arr.length; i++) {
			if(arr[i]%3 == 0) {
				System.out.println(arr[i]);
			}
		}
		
		
	}

}

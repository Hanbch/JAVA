package chap18;
//양의 정수를 10개 입력 받아 배열에 저장하고 
//합과 평균을 구하여라.

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("숫자입력");
			arr[i] = (int)(Math.random()*10)+1;
	}
		int sum =0;
		
		for(int num:arr) {
			sum += num;
		}
		System.out.println("합: "+ sum);
		
		double avr = (double)sum/arr.length;
		System.out.println("평균: "+ avr);
	}

}

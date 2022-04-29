package chap18;
//양의 정수를 10개 입력 받아 배열에 저장하고 
//합과 평균을 구하여라.

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][4];
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (int)(Math.random()*10)+1;
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
}

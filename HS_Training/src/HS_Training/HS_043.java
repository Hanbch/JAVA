// 49."돈을 입력하세요
//12900
//오만원 : 0장
//만원 : 1장
//오천원 : 0장
//천원 : 2장
//오백원 : 1개
//백원 : 4개
//계속 Y :: 중단 N"

package HS_Training;

import java.util.Scanner;

class CalcMoney{
	
	CalcMoney(){};
	
	void getMoney(){
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("금액을 입력");
		int[] won = {50000,10000,5000,1000,500,100,50,10};
		int[] count = new int[8];
		int price = sc.nextInt();
		
		for(int i=0; i< won.length; i++) {
			count[i] = price/won[i];
			price = price%won[i];
		}
			
		for(int e:count) {
			System.out.println(e);
		}
			
			
			
			
	}
}

public class HS_043 {
	public static void main(String[] args) {
		CalcMoney m1 = new CalcMoney();
		
		m1.getMoney();
		
	}
}
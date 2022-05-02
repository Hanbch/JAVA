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

class CalcMoney01{
	
	CalcMoney01(){};
	
	void getMoney(){
		Scanner sc = new Scanner(System.in);
		String check = "Y";
		
		while(check.equals("Y") || check.equals("y")) {
			System.out.println("금액을 입력");
			int[] won = new int[6];
			int price = sc.nextInt();
			
			
			won[0] = price/50000;
			won[1]  = (price%50000)/10000;
			won[2]  = (price%10000)/5000;
			won[3]  = (price%5000)/1000;
			won[4]  = (price%1000)/500;
			won[5]  = (price%500)/100;
			
			
			
			System.out.println("오만원: "+ won[0]);		
			System.out.println("일만원: "+ won[1]);		
			System.out.println("오천원: "+ won[2]);		
			System.out.println("일천원: "+ won[3]);		
			System.out.println("오백원: "+ won[4]);		
			System.out.println("백원: "+ won[5]);		
			System.out.println("계속: Y :: 중단: N");
			check = sc.next();
		}
		System.out.println("프로그램 종료");
	}
}

public class HS_043_2 {
	public static void main(String[] args) {
		CalcMoney01 m1 = new CalcMoney01();
		
		m1.getMoney();
		
	}
}
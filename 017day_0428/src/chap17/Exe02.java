package chap17;

import java.util.Arrays;
import java.util.Scanner;

class Rectang{
	private int width;
	private int height;
	
	Rectang(int width, int height){
		this.width = width;
		this.height = height;
	}
	Rectang(int[] arr){
		this.width = arr[0];
		this.height = arr[1];
	}
	
	int getRecArea(){
		return width*height;
	}
	
}

public class Exe02 {
	
	static int sumAllArea(Rectang[] rec) {
		int sumAll = 0;
		
		for(int i =0; i<rec.length; i++) {
			sumAll += rec[i].getRecArea();
		}
		
		return sumAll;
	}
	
	public static void main(String[] args ) {
		//"Rectangle 을 배열로 3개 선언

		// 해당 객체에 인덱스 순서대로 가로 세로 설정 - 
		// 이번에는 반드시 scanner 로 입력 받을것
		
		// 해당 배열에 있는 Rectangle 의 총넓이의 합을 구하시오."
		
		Rectang[] rec = new Rectang[3];
		
		rec[0] = new Rectang(5,10);
		rec[1] = new Rectang(5,10);
		rec[2] = new Rectang(5,10);
		
		System.out.println(sumAllArea(rec));
		System.out.println();
		
		
		//"1. int 배열 5개 선언
		//2. 차례 대로 0 1 2 3 4 입력
		//3. 배열 순서 대로 출력"
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++ ) {
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		//"Rectangle 을 배열로 3개 선언

		//해당 객체에 인덱스 순서대로 가로 세로 설정 - 
		//이번에는 반드시 scanner 로 입력 받을것
		
		//해당 배열에 있는 Rectangle 의 총넓이의 합을 구하시오."
		Scanner sc = new Scanner(System.in);
		Rectang[] rec2 = new Rectang[3];
		
		System.out.println("첫번째원 가로의길이를 입력하시오.");
		int width1 = sc.nextInt();
		
		System.out.println("첫번째원 높이를 입력하시오.");
		int height1 = sc.nextInt();
		
		rec2[0] = new Rectang(width1,height1);
		
		System.out.println("두번째원 가로의길이를 입력하시오.");
		int width2 = sc.nextInt();
		System.out.println("두번째원 높이를 입력하시오.");
		int height2 = sc.nextInt();
		rec2[1] = new Rectang(width2, height2);
		
		System.out.println("세번째원 가로의길이를 입력하시오.");
		int width3 = sc.nextInt();
		System.out.println("세번째원 높이를 입력하시오.");
		int height3 = sc.nextInt();
		rec2[2] = new Rectang(width3,height3);
		
		System.out.println("세원의 합:" + sumAllArea(rec2));
		
		
		//로또 번호6개를 출력 -중복없이
		
		//"돈을 입력하세요
		//12900
		//오만원 : 0장
		//만원 : 1장
		//오천원 : 0장
		//천원 : 2장
		//오백원 : 1개
		//백원 : 4개
		//계속 Y :: 중단 N"
		String yn = "Y";
		
		for(;;) {
			if(yn.equals("Y") || yn.equals("y") ) {
			
				System.out.println("금액을 입력하시오.");
				int price = sc.nextInt();
				
				CalMoney mon = new CalMoney(price);
				
				mon.showMoney();
				
				System.out.println("계속:Y :: 종료: N");
				
				yn = sc.next();
			 }else if(yn.equals("N") || yn.equals("n") ) {
				 System.out.println("프로그램이 종료됩니다.");
				 return;
			 }else {
				 System.out.println("잘못입력 하셨습니다. Y나 N 중 하나를 입력해주세요.");
				 yn = sc.next();
			 }
		 }
	
	} 

}

class CalMoney{
	 int won1;
	 int won2;
	 int won3;
	 int won4;
	 int won5;
	
	int price;
	
CalMoney(int price){this.price = price;}
	
	int[] getMoney(){
		won1 = price/50000;
		won2 = (price%50000)/10000;
		won3 = (price%10000)/5000;
		won4 = (price%5000)/1000;
		won5 = (price%1000)/500;
		
		int[] countArr = {won1, won2, won3, won4, won5};
		return countArr;
	}
	
	void showMoney(){
		System.out.println("오만원: "+ getMoney()[0] +"장");
		System.out.println("일만원: "+ getMoney()[1] +"장");
		System.out.println("오천원: "+ getMoney()[2] +"장");
		System.out.println("일천원: "+ getMoney()[3] +"장");
		System.out.println("오백원: "+ getMoney()[4] +"장");
	}
}

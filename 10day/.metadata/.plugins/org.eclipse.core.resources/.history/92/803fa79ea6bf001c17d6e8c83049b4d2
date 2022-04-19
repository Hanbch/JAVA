package chap06;

public class Review {
	
	public static double getCirArea(int radius) {
		final double PI = 3.14;
		return PI*radius*radius;
	}
	
	public static int getRecArea(int width, int height) {
		
		int recArea = width*height;
		return recArea;
	}
	
	public static void StarTower(int num) {
		for(int i=0; i<num; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
		
		System.out.print('\n');
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		//반지름를 받아서 원의 넓이를 리턴하는 함수를 만드시오."
		int radius = 10;
		
		double rst = getCirArea(radius);
		System.out.println(rst);
		
		//가로 세로를 받아서 사각형의 넓이를 리턴하는 함수를 만드시오.
		int width = 10;
		int height = 20;
		
		System.out.println(getRecArea(width, height));
		
		//"아래를 함수로 짜시오. 5 이면 5층 석탑 6이면 6층 석탑
		//*
		//**
		//***
		//****
		//*****
		int num = 5;
		StarTower(num);
	
		
	}

}

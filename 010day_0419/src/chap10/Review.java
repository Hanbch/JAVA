package chap10;

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
	
	public static String getGrade(int kor, int math, int eng) {
		int total = kor + math + eng;
		double avg = total/3.0;
		String grade; 
		
		if(avg >=90 ) {
			grade = "수";
		}else if (avg >= 80) {
			grade ="우";
		}else if (avg >= 70) {
			grade ="미";
		}else if (avg >= 60) {
			grade ="양";
		}else {
			grade = "가";
		}
		
		return grade;
	}
	
	public static int getAdd(int num2) {
		int sum = 0;
		for(int i=1; i<=num2; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void googooDan(int dan) {
		for(int i=1; i <10; i++) {
			System.out.println(dan + "x" + i + "=" + dan*i);
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
		
		//점수를 받아서  성적출력하는 함수
		int kor =90;
		int math =100;
		int eng =40;
		
		String grade = getGrade(kor,math,eng);
	
		System.out.println("당신의 성적은 " + grade + " 입니다." );
		
		//하나의 정수를 입력받아 1부터 해당 정수 까지의 합을 구하시오.
		int num2 = 100;
		int rst2 = getAdd(num2);
		System.out.println(rst2);
		
		//하나의 정수를 받아서 정수의 구구단 출력
		System.out.println();
		
		int dan = 8;
		googooDan(dan);
	
	}
	
	
}

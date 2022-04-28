package chap17;

import java.util.Scanner;

class Circle{
	private int rad;
	
	public static double getCirArea02(int rad){
		return rad*rad*Math.PI;
	}
	
	public void getCirArea(){
		Scanner sc = new Scanner(System.in);
		String yn = "Y";
		
//		for(;;) {
//			if(yn.equals("Y") || yn.equals("y")) {
//				System.out.println("반지름을 입력해주세요.");
//				int rad = sc.nextInt();
//				System.out.println("반지름: " + rad);
//				System.out.println("넓이는: " + Circle.getCirArea02(rad));
//				System.out.println("계속 Y :: 중단 N");
//				yn = sc.next();
//			}else if( yn.equals("N") || yn.equals("n")){
//				System.out.println("프로그램이 종료되었습니다.");
//				return;
//			}else {
//				System.out.println("잘못된 값을 입력했습니다. Y(yes) 와 N(no) 중 하나를 입력하시오. " );
//				yn = sc.next();
//			}
//		}
		
		for(;;) {
			if(yn.equals("Y") || yn.equals("y")) {
				System.out.println("반지름을 입력해주세요.");
				rad = sc.nextInt();
				System.out.println("반지름: " + rad );
				System.out.println("넓이는: " + getCirArea02(rad) );
				System.out.println("계속 Y :: 중단 N");
				yn = sc.next();
			}else if(yn.equals("N") || yn.equals("n")) {
				System.out.println("프로그램 종료합니다.");
				return;
			}else {
				System.out.println("잘못된 값을 입력했습니다. Y(yes) 와 N(no) 중 하나를 입력하시오. " );
				yn = sc.next();
			}
		}
		
	}
}

class Rectangle{
	int width, height;
	
	public Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public static int getRecArea(int width, int height){
		return width*height;
	}
}

class Grade{
	
	public static String getGrade(int kor, int math, int eng) {
		int total = kor+math+eng;
		double avg = total/3.0;
		 String grade;
		 
		 if(avg >= 90) {
			 grade = "수 입니다.";
		 }else if(avg >= 80) {
			 grade = "우 입니다.";
		 }else if(avg >= 70) {
			 grade = "미 입니다.";
		 }else if(avg >= 60) {
			 grade = "양 입니다.";
		 }else {
			 grade = "가 입니다.";
		 }
		 System.out.println("총점: "+total);
		 System.out.println("평균: "+avg);
		 System.out.println("성적: "+grade);
		 return grade;
		
	}
}

public class Review {

	public static void main(String[] args) {
		//"Rectangle 클래스 작성 int 값 두개 입력  가로 세로 입력 하세요. 넓이를 구하시오."
		System.out.println(Rectangle.getRecArea(100,20));
		
		/*아래를 스캐너로 입력 받아 Grade  클래스를 만들어 결과값을 내시오.
		국어 :80
		영어 :70
		수학 :80

		성적은 총점: 0000 평균 ----- 
		수입니다."
		*/
		Grade.getGrade(90,100,80);
		
		//"int 값을 하나 입력 받아 원의 넓이를 구하는 프로그램을 짜시오. 
		//단 Circle 은 객체로 만들것. "
		//double CirArea = Circle.getCirArea(10);	
		//System.out.println(CirArea);
		
		/*
		39번 클래스를 이용하여 아래를 프로그래밍 하시오.
		=================================================
		반지름:90
		넓이는25446.900494077323
		계속 Y :: 중단 N
		y
		반지름:80
		넓이는20106.192982974677
		계속 Y :: 중단 N
		n
		프로그램이 종료 되었습니다.
		*/
		Circle cir = new Circle();
		cir.getCirArea();
		
		
	}

}

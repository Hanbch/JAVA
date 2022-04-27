package chap11;

class Human{
	int eye;
	
	public void setEye(int num) {
		this.eye = num;
	}
}

class Grade{
	int kor;
	int math;
	int eng;
	
	void initSub (int kor, int math, int eng) {
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		
	}
	
	public int getTotal(){
		return kor + math + eng;
		
	}
	public double getAvr() {
		return  getTotal() /3.0;
	}
	
	String getGrade() {
		String grade;
		double avg = getAvr();
		
		if( avg >= 90) {
			grade ="수";
		}else if (avg >=80 ) {
			grade ="우";
		}else if (avg >=70 ) {
			grade ="미";
		}else if (avg >=60 ) {
			grade ="양";
		}else {
			grade ="가";
		}
		return grade;
	}
	
}

public class Review {
	
	public static int adding(int num) {
		int sum = 0;
		for (int i=1; i<=num; i++) {
			sum += i;
		}
		return sum;
		
	}
	
	public static void makeGooGooDan(int dan) {
		for(int i=1; i<dan; i++) {
			System.out.println(dan + "x"+ i + "=" + dan*i);
		}
	}
	
	public static void printStar(int num) {
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-i; j++) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
	}
	
	
	
	public static void main(String[] args) {
		// 하나의 정수를  받아서 해당 1 부터 해당정수 까지의 합을 리턴 하는 함수
		int rst = adding(10);
		System.out.println(rst);
		
		//하나의 정수를  받아서 해당 정수의 구구단 출력
		int dan = 9;
		makeGooGooDan(dan);
		
		//"아래를 함수로 짜시오. 5 이면 5층 석탑 6이면 6층 석탑
		//*
		//**
		//***
		//****
		//*****
		int num =5;
		printStar(num);
		
		//"Human eye   변수 선언 후  set  함수 만들어 set   함수에  2를 집어넣고 eye  출력 하시오"
		
		Human hm = new Human();
		hm.setEye(2);
		System.out.println(hm.eye);
		
		Grade gr = new Grade();
		
		gr.initSub(90, 70, 80);
		
		System.out.println(gr.getTotal());
		System.out.println(gr.getAvr());
		System.out.println(gr.getGrade());
		
		
	}

}

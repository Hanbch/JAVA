package chap06;

public class Method01 {
	
	public static void hiEveryone(int age, double height) {//1. 인자 전달을 받지만 리턴 값이 없는 함수 생성
		System.out.println("제 나이는" + age + "세입니다." );
		System.out.println("제 키는" + height + "cm입니다." );
	}
	
	public static void byeEveryone() {//2. 인자 전달을 받지않고 리턴값이 없는 함수 생성
		System.out.println("bye");
	}
	
	public static int adder(int num1, int num2) {//3.인자전달을 받고 정수형 리턴값을 리턴하는 함수 생성
		int addRst = num1 + num2;
		return addRst;
	}
	
	public static double square(double num) {//3.인자전달을 받고 실수형 리턴값을 리턴하는 함수 생성
		return num * num;

	}
	
	public static void divide(int num1, int num2){//4. void 와 return
		if(num2 == 0) {
			System.out.println("0으로는 나누기를 할수 없습니다.");
			return; // void로 생성된 메서드안에서 return을 쓸떄는 뒤에 값이 올수 없음. return은 함수 종료의 의미
		}
		System.out.println(num1/num2);
	}
	
	public static void starPrint(int num) {// 5.별찍기 함수 생성
		for(int i=0; i <num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.print('\n');
			
		}
		
	}
	
	public static double recArea(double width, double height) { //6. 가로 세로를 매개변수로 받는 사각형의 넓이를 구하는 메서드 생성 
		return width*height;
	}
	
	public static double cirArea(double radius) { //7. 반지름의 값을 받아서 원의 넓이를 반환하는 메서드 생성 
		final double PI =3.14;
		return  radius*radius*PI;
	}
	
	public static String scoringMethod(int kor,int math, int eng) { //8.국어 영어 수학 성적을 받아서 성적내는 함수 생성
		int total =kor + math + eng;
		double avr = total/3.0;
		String result;
		
		if(avr >= 90) {
			result ="수";
		}else if(avr >= 80) {
			result = "우";
		}else if(avr >= 70) {
			result = "미";
		}else if(avr >= 60) {
			result = "양";
		}else {
			result = "가";
		}
		
		return result;
		
		
	}
	

	public static void main(String[] args) {
		double myHeight = 175.0;
		//1. 인자 전달을 하지만 리턴 값이 없는 함수 호출
		System.out.println('\n');
		
		hiEveryone(12, 12.5);
		hiEveryone(13, myHeight);
		  
		//2. 인자 전달을 하지않고 리턴값이 없는 함수 호출
		System.out.println('\n');
		  
		byeEveryone();
		
		//3.인자전달을 하고 리턴값을 받는 함수 호출
		System.out.println('\n');
		
		int rst = adder(4,5);
		
		System.out.println(rst);
		System.out.println(square(3.5));
		
		//4. void 와 return
		System.out.println('\n');
		
		divide(4,2);
		divide(6,2);
		divide(9,0);
		
		//5. 문제1
		System.out.println('\n');
		
		starPrint(5);
		
		// 6. 가로 세로를 매개변수로 받아서 사각형의 넓이를 구하는 메서드 호출 
		System.out.println('\n');
		double width = 92.5;
		double height = 5.8;
		double result = recArea(width,height);
		System.out.println("밑변이 "+ width + "이고 " + "높이가 " + height + "인 사각형의 넓이는 " + result + "입니다.");
		
		// 7. 반지름을 받아서 원의 넓이를 리턴하는 메서드 호출
		System.out.println('\n');
		
		double radius = 2.2;
		double result2 = cirArea(radius);
		System.out.println(result2);
		
		//8.국어 영어 수학 성적을 받아서 성적내는 함수 호출
		System.out.println('\n');
		
		int kor = 80;
		int math = 90;
		int eng = 60;
		
		String score = scoringMethod(kor, math, eng);
		System.out.println("당신의 성적은 "+ score + " 입니다.");
		System.out.println(scoringMethod(90, 90, 90)+ " 입니다.");
		
		
	}

}

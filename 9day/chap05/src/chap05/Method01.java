package chap05;

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
		
		
	}

}

package chap09;

class Circle{
	int radius;
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		final double PI = 3.14;
		return radius*radius*PI;
	}
}

class Rectangle {
	int width, height;
	
	void initRec(int width,int height) {
		this.width = width;
		this.height = height;
	}
	
	int getArea() {
		return width*height;
	}
}

class Grade{
	int kor,math,eng;
	
	void initGrade(int kor, int math,int eng) {
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	int getTotal() {
		return kor+math+eng;
	}
	
	double getAvg() {
		return getTotal()/3.0;
		
	}
	
	String getGrade() {
		double avg = getAvg();
		String grade;
		
		if(avg >=90 ) {
			grade = "수";
		}else if(avg >= 80) {
			grade = "우";
		}else if(avg >= 70) {
			grade = "미";
		}else if(avg >= 60) {
			grade = "양";
		}else {
			grade = "가";
		}
		
		return grade;
		
	}	
	
}

class Human{
	int eye;
	
	void setEye(int eye) {
		this.eye = eye;
	}
	
	void getEye() {
		System.out.println("눈은 " + eye + "개 입니다.");
	}
}

class Sum{
	
	
	int adding(int num) {
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		return sum;
	}
}


public class Review {

	public static void main(String[] args) {
		// "원의 넓이는 구하는 프로그램을 아래와 같이 작성하시오.
		//-원클래스를 만들것
		//-메인 메소드를 가진 다른 클래스에서 원 객체를 생성할것"
		Circle cir = new Circle();
		
		cir.setRadius(13);
		System.out.println(cir.getArea());
		
		//"사각형의 넓이는 구하는 프로그램을 아래와 같이 작성하시오.
		// -사각형 클래스를 만들것
		// -메인 메소드를 가진 다른 클래스에서 사각형 객체를 생성할것"
		Rectangle rec = new Rectangle();
		rec.initRec(20,30);
		System.out.println(rec.getArea());
		
		//- 메인을 가진 클래스 에서  Grade  객체 생성해서 
		// 90,70,80  에 대한 수우미양가 를 출력하세요.
		Grade gr = new Grade();
		gr.initGrade(90, 70, 60 );
		System.out.println(gr.getGrade());
		
		////"클래스 Human ,   변수 eye 선언 후  set  함수 만들어 set   함수에  2를 집어넣고 eye  출력 하시오.
		Human hm = new Human();
		hm.setEye(2);
		hm.getEye();
		
		//1 부터 num 까지 합을 구하는 class 를 작성하도록 하시오.
		Sum s1 = new Sum();
		System.out.println(s1.adding(100));
	}

}

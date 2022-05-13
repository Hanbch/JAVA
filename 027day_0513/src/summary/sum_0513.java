
//05/13
/*
1.다음 main()이 실행되면 아래 예시와 같이 출력되도록 
MyPoint 클래스를 작성하라.

public static void main(String [] args) {
	MyPoint p = new MyPoint(3, 50);
	MyPoint q = new MyPoint(4, 50);

	System.out.println(p);

	if(p.equals(q)) System.out.println("같은 점");
	else System.out.println("다른 점");			
}


Point(3,50)
다른점


2.중심을 나타내는 정수 x, y와 반지름 radius 필드를 가지는 Circle 클래스를 작성하고자 한다. 생성자는 3개의 인자(x, y, raidus)를 받아 해당 필드를 초기화하고, equals() 메소드는 두 개의 Circle 객체의 중심이 같으면 같은 것으로 판별하도록 한다.

public static void main(String[] args) {
	Circle a = new Circle(2, 3, 5); // 중심 (2, 3)에 반지름 5인 원
	Circle b = new Circle(2, 3, 30); // 중심 (2, 3)에 반지름 30인 원
	System.out.println("원 a : " + a);
	System.out.println("원 b : " + b);
	if(a.equals(b))
		System.out.println("같은 원");
	else 
		System.out.println("서로 다른 원");
}
====================
원 a : Circle(2,3)반지름5
원 b : Circle(2,3)반지름30
같은 원

3.문자열을 입력 받아 한 글자씩 회전시켜 모두 출력하는 프로그램을 작성하라.
=========================
문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.

I Love you
Love youI
Love youI
ove youI L
ve youI Lo
e youI Lov
youI Love
youI Love
ouI Love y
uI Love yo
I Love you

4.래퍼 클래스(Wrapper class)란 무엇인가?
  - 래퍼클래스란 기본형 데이터타입을 class로만들어 값을 객체화하는것이다.
  
5. auto unboxing 이란?
  - auto Boxing은 원시 타입의 값을 해당하는 wrapper 클래스의 객체로 바꾸는 과정을 의미 
  - auto unboxing은 그와 반대로 Wrapper 클래스 타입을 원시 타입으로 변환하는 과정의 의미

6. BigInteger 클래스에 대하여 설명하시오?
   - BigInteger 클래스는 클래스 이름 그대로, 큰! 정수를 다루기 위해 등장한 클래스입니다. 
   	 우리는 정수를 int, long 기본 자료형으로 표현할 수 있습니다. 
   	 하지만, int, long 은 모두 표현할 수 있는 값의 크기가 한계가 있습니다. 
   	 그러면, long 형 범위보다도 큰 값을 JAVA 에서는 표현하기 위해 자바에서는
   	 BigInteger 클래스를 지원해줍니다.
	 Wrapper 클래스들과 마찬가지로, Number 클래스를 상속하고 있습니다.



 */


package summary;

import java.util.StringTokenizer;

class MyPoint{//1번 문제 class
	int x,y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y =y;
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}

class Circle00{
	int x,y;
	double rad;
	
	Circle00(int x,int y, double rad){
		this.x = x;
		this.y = y;
		this.rad = rad;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( this.x == ((Circle00)obj).x && this.y == ((Circle00)obj).y )
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return "Circle(" + x + "," + y + ")" + "반지름" + rad;
	}
}

class getLetter{
	String a;
	
	getLetter(String a) {
		this.a = a;
	}
	
	void print() {
		
		StringTokenizer st = new StringTokenizer(this.a," ");
		while(st.hasMoreTokens())
		   System.out.print(st.nextToken() + ' ');
		   System.out.println();
	}
	
}

public class sum_0513 {
	public static void main(String[] args) {
		
		//1번문제
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);

		System.out.println(p);//Point(3,50)

		if(p.equals(q)) System.out.println("같은 점");
		else System.out.println("다른 점"); //다른점
		System.out.println("------------------------------------");
		
		//2번 문제
		Circle00 a = new Circle00(2, 3, 5); // 중심 (2, 3)에 반지름 5인 원
		Circle00 b = new Circle00(2, 3, 30); // 중심 (2, 3)에 반지름 30인 원
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		if(a.equals(b))
			System.out.println("같은 원");
		else 
			System.out.println("서로 다른 원");
		
		//3번문제
		String str = "가나다라 abcd asdfasd ㄴㅇㄻ놞ㄴ러ㅗ";
		getLetter s = new getLetter(str);
		
		s.print();
		
		
	}
}

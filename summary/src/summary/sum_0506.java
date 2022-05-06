
//05/06
/*
 1. class이름 및 함수에서 final의 의미는?
   -class의 final은 다른 클래스가 이 class를 상속 할 수 없음을 의미한다.
   - 메서드의 final은 오버라이딩이 안되는것을 의미한다.

2. interface 와 class 의 차이는?
  - interface에는 추상함수만 올수있고 다중상속이 가능하다 그리고 implement로 사용가능하다
  - class는 단일 상속만 가능하고 클래스내에 멤버 변수 함수 생성자가 가능하다.

3. @Override 에 대하여 설명하시오.
  - @ Override 키워드는 상위 클래스의 메소드를 오버라이딩 하는 것이 목적이라는 선언! 
	오버라이딩을 하는 형태가 아니면 컴파일러가 오류 메시지 전달.
	java 1.7버전 부터 가능하다.


4. abstract 키워드에 대하여 설명하시오.
  - abstract은 추상이라는 뜻으로 추상함수 앞에 붙는다. interface에서는 class의 디폴트 값이 
  	abstract이다.

5. 아래의 출력 결과가 아래와 같이 나오도록 프로그래밍 하시오.
Object obj = new Circle(10);

System.out.println(obj); 

//출력: 넓이는 100 입니다. (예시)

 * */

package summary;

import java.util.Scanner;


//5번 class

class Circle{
	double rad;
	
	Circle(double rad){this.rad = rad;}
	
	public String toString() {
		return "넓이는 " + (rad*rad*Math.PI) + "입니다.";
	}
	
}

public class sum_0506 {
	public static void main(String[] args) {
		
		Object obj = new Circle(10);
		System.out.println(obj);
		
	}
}

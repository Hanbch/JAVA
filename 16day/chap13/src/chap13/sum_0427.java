package chap13;

import java.util.Scanner;

public class sum_0427 {
	public static void main(String[] args) {
		/*
		 *  1.String 클래스에서 concat 메서드를 설명하시오.
		 *   - concat은 문자열을 더해주는 기능을한다.
		 *  
			2.str.substring(2, 4); substring 사용법에 대하여 설명하시오.
			  - substring메서드는 문자열에서 지정한 부분 추출하는 기능이다
			    ex) str.substring(2, 4) 이 경우 str이라는 문자열에 index 2부터 처음4번쨰가지 추출
			
			3.st1.compareTo(st2);compareTo 사용법에 대하여 설명하시오.
			  - st1 과 st2의 문자열이 같으면 0 반환 다를시 st1이 st2보다 사전상 앞에있으면 음수 뒤에있으면 양수 반환 
			
			4.String.valueOf 에 대하여 설명하시오.
			  - String.valueOf() 이 메서드는 ()안에 오는 다른데이터타입의 데이터를 문자열인 String으로 변환해줌
			
			5. 아래의 연산과정에서 호출되는 함수(원리)를 써서 표현해 보세요.
			String str = "age: " + 17;
			
			  - str = "age: ".concat(17);
			    -> "age: ".concat(String.valueOf(17));
			    -> "age: " + "17" 
			
			6.StringBuilder 와 String 의 차이는?
			  - StringBuilder는 immutable 객체가 아니라서 값이 변할수있는 반면 
			    String 은 immutable 객체라서 값이 원형이 보존이되고 값이 변경될시 새로운객체를 생성하여 새로 메모리에 할당한다.
			
			7.아래를 프로그래밍 하시오.
			입력 : abcde
			출력 : edcba
			
			아래참조
			
			8.아래를 프로그래밍 하시오.
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
		 * 
		 * */
		
		//7번 문제 
		StringBuilder sb = new StringBuilder("abcde");
		
		sb.reverse();
		
		System.out.println(sb);
		
		//8번문제
		
		Circle01.showResult();
	
	}
}

class Circle01{
	
	public static double getCirArea(int rad) {
		return rad*rad*Math.PI;
	}
	
	public static void showResult() {
		Scanner sc = new Scanner(System.in);
		String yn = "Y";
		
		for(;;) {
			if(yn.equals("Y")) {
				System.out.println("반지름을 입력해주세요.");
				int rad = sc.nextInt();
				System.out.println("반지름: " + rad);
				System.out.println("넓이는: " + Circle01.getCirArea(rad));
				System.out.println("계속 Y :: 중단 N");
				yn = sc.next();
			}else if( yn.equals("N")){
				System.out.println("프로그램이 종료되었습니다.");
				return;
			}else {
				System.out.println("잘못된 값을 입력했습니다. Y(yes) 와 N(no) 중 하나를 입력하시오. " );
				yn = sc.next();
			}
		}
	}
	
}
		
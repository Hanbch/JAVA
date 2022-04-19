package chap03;

public class CondOp {

	public static void main(String[] args) {
		
		// 삼항연산자
		
		int num1 = 50;
		int num2 = 100;
		int big;
		int diff;
		
		big = ( num1 > num2 ) ? num1 : num2; // ( 괄호 )안의 조건식이 참이면 ? 앞에 값이 리턴됨 거짓이면  뒤에값이 리턴됨
		System.out.println("큰 수: " + big);
		
		diff = (num1 > num2) ? (num1 - num2) : (num2 - num1);
		System.out.println("절댓값: " + diff );
		 
	}

}

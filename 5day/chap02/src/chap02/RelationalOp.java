package chap02;

public class RelationalOp {

	public static void main(String[] args) {
		System.out.println("3 >= 2 : " + (3 >= 2) );
		System.out.println("3 >= 2 : " + (3 <= 2));
		System.out.println("7.0 == 7 : " + (7.0 == 7)); // "==" 이것도 연산자 이므로 7.0 과 7이 하나의 데이터 타입으로 합쳐진다.
														// int 형인 7이 double형인 7.0 과 같은 double 형으로 자동형변환된다.
														// 그러므로 결과는 true를 반환한다.
		System.out.println("7.0 != 7 : " + (7.0 != 7));
		

	}

}

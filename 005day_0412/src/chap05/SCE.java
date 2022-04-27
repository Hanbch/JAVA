package chap05;

public class SCE {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean result;
		
		result = ((num1 += 10) < 0) && ((num2 += 10) > 0); // &&연산자는 앞에 ((num1 += 10) < 0)
														   // 부분이 이미 false이므로 false를 반환시키고
														   // && 뒤에 연산을 하지않고 종료한다.
														   // 그러므로 앞에 num1은 10이 더해지고 num2는 0이면된다
		System.out.println(result); // false
		System.out.println(num1);   // num1 +=10 연산되어서 10;
		System.out.println(num2);   // num2 +=10은 연산이 안되어서 그대로 0;
		
		result = ((num1 +=10 ) > 0) || ((num2 += 10) > 0);
		System.out.println(result);
		System.out.println(num1);
		System.out.println(num2);

	}

}

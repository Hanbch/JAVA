package HS_Training;
/* 78.
 "다음과 같이 +로 연결된 덧셈식을 입력받아 덧셈 결과를 출력하는 프로그램을 작성하라. 
StringTokenizer와 Integer.parseInt(). 
String의 trim()을 활용하라.

입력 : 2 + 5 + 6 + 10
출력 : 합은 23 "
 */

import java.util.StringTokenizer;

public class HS_078 {

	public static void main(String[] args) {
		String str = "2 + 5 + 6 + 10";
		int sum = 0;
		StringTokenizer st1 = new StringTokenizer(str, "+");
		
		while (st1.hasMoreTokens()) {
			sum += Integer.parseInt(st1.nextToken().trim());
		}
		System.out.println(sum);
	}

}

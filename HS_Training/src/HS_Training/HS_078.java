package HS_Training;
/* 78.
 "������ ���� +�� ����� �������� �Է¹޾� ���� ����� ����ϴ� ���α׷��� �ۼ��϶�. 
StringTokenizer�� Integer.parseInt(). 
String�� trim()�� Ȱ���϶�.

�Է� : 2 + 5 + 6 + 10
��� : ���� 23 "
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

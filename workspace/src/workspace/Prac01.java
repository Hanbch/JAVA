package workspace;

import java.util.*;

/*
 "5. Scanner 클래스로 -1이 입력될 때까지 양의 정수를 입력 받아 저장하고 검색하여 가장 큰 수를 출력하는 프로그램을 작성하라.
정수(-1이 입력될 때까지)
-스캐너로 입력된 정수는 List로 관리 할것.
입력:
>> 10 6 22 6 88 77 -1
출력:
가장 큰 수는 88"
 * */
public class Prac01 {
	public static void main(String[] args) {
		
		List<Integer> num = new ArrayList<>();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("번호 입력");
		
		int n1=0;
		
		while(n1 != -1) {
			n1 = sc.nextInt();
			num.add(n1);
		}
		
		int max=0;
		for(int m:num) {
			if(m > max) {
				max = m;
			}
		}
		System.out.println(max);
	}

}

package HS_Training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 82.
Scanner 클래스로 -1이 입력될 때까지 양의 정수를 입력 받아 저장하고 검색하여 가장 큰 수를 출력하는 프로그램을 작성하라.
정수(-1이 입력될 때까지)
-스캐너로 입력된 정수는 List로 관리 할것.
입력:
>> 10 6 22 6 88 77 -1
출력:
가장 큰 수는 88"
*/

public class HS_082 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> numBox = new ArrayList<>();
		int maxNum = 0;
		int num = 0;
		
		while (num != -1) {
			System.out.println("양의 정수입력");
			num = sc.nextInt();
			numBox.add(num);
		}

//		for (int i = 0; i < numBox.size(); i++) {
//			for (int j = 0; j < i; j++) {
//				if ((numBox.get(i)) > (numBox.get(j))) {
//					maxNum = i;
//				} else {
//					maxNum = j;
//				}
//			}
//		}
		
		for(int temp: numBox) {
			if(temp > maxNum) {
				maxNum = temp;
			}
		}
		System.out.println(maxNum);
	}

}

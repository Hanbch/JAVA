package HS_Training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 82.
Scanner Ŭ������ -1�� �Էµ� ������ ���� ������ �Է� �޾� �����ϰ� �˻��Ͽ� ���� ū ���� ����ϴ� ���α׷��� �ۼ��϶�.
����(-1�� �Էµ� ������)
-��ĳ�ʷ� �Էµ� ������ List�� ���� �Ұ�.
�Է�:
>> 10 6 22 6 88 77 -1
���:
���� ū ���� 88"
*/

public class HS_082 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> numBox = new ArrayList<>();
		int maxNum = 0;
		int num = 0;
		
		while (num != -1) {
			System.out.println("���� �����Է�");
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

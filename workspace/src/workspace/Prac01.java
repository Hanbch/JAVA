package workspace;

import java.util.*;

/*
 "5. Scanner Ŭ������ -1�� �Էµ� ������ ���� ������ �Է� �޾� �����ϰ� �˻��Ͽ� ���� ū ���� ����ϴ� ���α׷��� �ۼ��϶�.
����(-1�� �Էµ� ������)
-��ĳ�ʷ� �Էµ� ������ List�� ���� �Ұ�.
�Է�:
>> 10 6 22 6 88 77 -1
���:
���� ū ���� 88"
 * */
public class Prac01 {
	public static void main(String[] args) {
		
		List<Integer> num = new ArrayList<>();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("��ȣ �Է�");
		
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

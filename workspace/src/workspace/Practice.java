package workspace;

import java.util.HashSet;

public class Practice{
	
	public static void main(String[] args) {
		 
		HashSet<Integer> hSet = new HashSet<Integer>();
		hSet.add(500);
		hSet.add(100);
		hSet.add(300);
		hSet.add(200);
		
		for(int n: hSet)
			System.out.println(n);
		
		System.out.println("����� ������ ��: " + hSet.size());
		System.out.println(hSet);

		/*
		============
		����� ������ ��: 2
		[LEE(010-222), PARK(010-333)]
		 */
		
		HashSet<Integer> numBox = new HashSet<>(); //���� ũ�� ���������� ����ϱ�����  TreeSet���
		final int COUNT = 6;
		
		//while(numBox.size() < COUNT) { //while���� �̿��� 6���� ���ڸ� ���������� �ݺ�
		//	int rn = (int)(Math.random()*45)+1;
		//	numBox.add(rn);
		//}
		
		numBox.add(32);
		numBox.add(2);
		numBox.add(6);
		numBox.add(23);
		numBox.add(44);
		numBox.add(28);
		
		System.out.println(numBox);

	}
	
}
package workspace;

import java.util.HashSet;

public class LottoBySet {

	public static void main(String[] args) {
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

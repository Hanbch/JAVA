package HS_Training;

import java.util.HashSet;
import java.util.Set;

/* 81.
�ζ� ���α׷��� �ۼ��Ͻÿ�.(Set ����)
*/


public class HS_081 {

	public static void main(String[] args) {
		Set<Integer> Ln = new HashSet<>();
		
		while(Ln.size() < 6) {
			Ln.add((int)(Math.random()*45)+1);
		}
		
		System.out.println(Ln);
	}

}

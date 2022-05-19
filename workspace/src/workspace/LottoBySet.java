package workspace;

import java.util.HashSet;

public class LottoBySet {

	public static void main(String[] args) {
		HashSet<Integer> numBox = new HashSet<>(); //숫자 크기 순자적으로 출력하기위해  TreeSet사용
		final int COUNT = 6;
		
		//while(numBox.size() < COUNT) { //while문을 이용해 6개의 숫자를 받을때까지 반복
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

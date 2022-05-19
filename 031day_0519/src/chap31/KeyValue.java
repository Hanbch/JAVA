package chap31;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;


public class KeyValue {

	public static void main(String[] args) {
		TreeMap<Integer, String> map =new TreeMap<>();
		
		//key-value ��� ������ ����
		map.put(45,"Brown");
		map.put(37,"red");
		map.put(23,"Blue");
		
		//������ Ž��
		System.out.println("23��: " + map.get(23));
		System.out.println("37��: " + map.get(37));
		System.out.println("45��: " + map.get(45));
		
		//������ ����
		map.remove(37);
		
		//������ ���� Ȯ��
		System.out.println("37��: " + map.get(37));
		
		//Key�� ����ִ� �÷��� �ν��Ͻ� ����
		Set<Integer> ks = map.keySet();
		
		//��ü key ��� (for-each��  ���)
		for(Integer n : ks)
			System.out.println(n.toString() + '\t');
		System.out.println();
		
		//��ü Value ��� (for-each��  ���)
		for(Integer n : ks)
			System.out.println(map.get(n).toString() + '\t');
		System.out.println();
		
		//��ü Value ��� (�ݺ��� ���)
		for(Iterator<Integer> itr = ks.iterator(); itr.hasNext();)
			System.out.println(map.get(itr.next()) + '\t');
		System.out.println();
		
	}

}

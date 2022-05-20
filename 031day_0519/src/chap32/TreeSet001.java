package chap32;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet001 {

	
	public static void main(String[] args) {
		 
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(3); tree.add(1);
		tree.add(2); tree.add(4);
		System.out.println("�ν��Ͻ� ��: " + tree.size());
		
		//for-each���� ���� �ݺ�
		for(Integer n: tree)
			System.out.println(n.toString() + '\t');
		System.out.println();
		
		//Iterator �ݺ��ڿ� ���� �ݺ�
		for(Iterator<Integer> itr = tree.iterator(); itr.hasNext();)
			System.out.println(itr.next().toString() + '\t');
		System.out.println();
		
		
	}
	
}
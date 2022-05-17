package chap29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Set00 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Toy");
		set.add("Box");
		set.add("Robot");
		set.add("Box");
		System.out.println("인스턴스 수 : " + set.size());
	
		for(Iterator<String> itr = set.iterator(); itr.hasNext(); )
			System.out.print(itr.next() + '\t');
		System.out.println();
		
		for(String s: set)
			System.out.print(s + '\t');
		System.out.println();
		
		Set<Integer> num = new HashSet<>();
		int n = (int)(Math.random()*6)+1;
		for(Iterator<Integer> itr = num.iterator(); itr.hasNext(); )
			//itr = (int)(Math.random()*6+1);
		for(Integer n1:num)
			System.out.println(n1);
	}

}

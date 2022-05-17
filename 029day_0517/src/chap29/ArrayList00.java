package chap29;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList00 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i) + '\t');
		System.out.println('\n');
		
		list.remove(0);
		
		for(int i = 0; i<list.size(); i++)
			System.out.print(list.get(i) + '\t');
		System.out.println();
	}

}

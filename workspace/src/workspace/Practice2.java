package workspace;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Practice2{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> nations = new HashMap<>();
		final int COUNT = 5;
		
		System.out.println("������ �α��� �Է�");
		for(int i=0; i<COUNT; i++) {
			System.out.print("����� �α���>>  ");
			String name = sc.next();
			int pop = sc.nextInt();
			
			nations.put(name, pop);
		}
		
		Set<String> key = nations.keySet();
		
		int max =0;
		String country ="";
		
		for(String n : key) {
			if( max < nations.get(n) ) {
				max = nations.get(n);
				country = n;
			}
		}
			
		System.out.println("�ִ��α��� ������ " + country + " �α����� " + max + "�� �Դϴ�.");
		
	}
}
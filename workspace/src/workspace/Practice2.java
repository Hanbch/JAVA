package workspace;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Practice2{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> nations = new HashMap<>();
		final int COUNT = 5;
		
		System.out.println("나라명과 인구수 입력");
		for(int i=0; i<COUNT; i++) {
			System.out.print("나라명 인구수>>  ");
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
			
		System.out.println("최대인구수 국가는 " + country + " 인구수는 " + max + "명 입니다.");
		
	}
}
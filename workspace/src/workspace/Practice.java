package workspace;

import java.util.HashSet;

class Person00{
	private String name;
	private String pNum;
	
	Person00(String name, String pNum){
		this.name = name;
		this.pNum = pNum; 
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if( name.equals(((Person00)obj).name) && pNum.equals( ((Person00)obj).pNum) )
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return this.name + "(" + this.pNum + ")";
	}
	
}

public class Practice{
	
	public static void main(String[] args) {
		 
		HashSet<Person00> hSet = new HashSet<Person00>();
		hSet.add(new Person00("LEE", "010-222"));
		hSet.add(new Person00("LEE", "010-222"));
		hSet.add(new Person00("PARK", "010-333"));
		hSet.add(new Person00("PARK", "010-333"));

		System.out.println("저장된 데이터 수: " + hSet.size());
		System.out.println(hSet);

		/*
		============
		저장된 데이터 수: 2
		[LEE(010-222), PARK(010-333)]
		*/
	}
	
}
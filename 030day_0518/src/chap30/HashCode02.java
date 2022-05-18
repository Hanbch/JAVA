package chap30;

import java.util.HashSet;

class Person00{
	
	private String name;
	private int age;
	
	Person00(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return age%3;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person00) {
	          Person00 person = (Person00)obj;
		}
		
		if( this.age == ((Person00)obj).age && this.name == ((Person00)obj).name )
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return this.name + " (" + age + "技)";
	}
	
	
}


public class HashCode02 {

	
	public static void main(String[] args) {
		 
		HashSet<Person00> hSet = new HashSet<Person00>();
		hSet.add(new Person00("LEE", 10));
		hSet.add(new Person00("LEE", 10));
		hSet.add(new Person00("PARK", 35));
		hSet.add(new Person00("PARK", 35));

		System.out.println("历厘等 单捞磐 荐: " + hSet.size());
		System.out.println(hSet);

		/*
		============
		历厘等 单捞磐 荐: 2
		[LEE(10技), PARK(35技)]
		*/
	}
	
}
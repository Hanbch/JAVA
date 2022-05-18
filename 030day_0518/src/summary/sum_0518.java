package summary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

//05/18
/*
1. Set 호출되는 원리와 순서를 설명하시오.
  - Set은 집합을 구현한 것으로 저장 순서가 유지되지 않고, 데이터의 중복 저장을 허용하지 않는다. 
  	이를 구현하기 위해서는 동일 인스턴스가 중복 저장되지 않도록 해야한다. 
  	그러므로 set을 호출하기 위해서 다음 두 개가 호출되어야 한다는 것을 반드시 이해해야 한다. 
  	아래의 두 개가 다 같아야 동일 인스턴스이다.
	
	1). hash code 호출 (두 개 객체 주소-hash code가 같은지 비교)
	hashCode 는 Object에 있다. 아래의 예시와 같이 오버라이드 한 함수를 통과해 리턴 되는 값으로 군집(집합, 캐비넷)을 만든다. 그리고 그 다음 equals를 호출한다.
	
	2). equals 호출 (문자열 비교 걸러냄)
	hash code의 호출로 군집히 형성되면 그 군집 내의 요소들을 비교해 나간다.

2. 아래와 같이 출력되도록 하시오.
HashSet<Person> hSet = new HashSet<Person>();
hSet.add(new Person("LEE", 10));
hSet.add(new Person("LEE", 10));
hSet.add(new Person("PARK", 35));
hSet.add(new Person("PARK", 35));

System.onut.println("저장된 데이터 수: " + hSet.size());
System.out.println(hSet);


============
저장된 데이터 수: 2
[LEE(10세), PARK(35세)]

3. 아래가 프로그래밍 되도록 Num 을 만드시오.

        HashSet<Num> set = new HashSet<>();
        set.add(new Num(7799));
        set.add(new Num(9955));
        set.add(new Num(7799));

        System.out.println("인스턴스 수: " + set.size());

        for(Num n : set)
            System.out.print(n.toString() + '\t');

        System.out.println();

/*
====출력
인스턴스 수: 2
7799	9955
*/

class Person00{ //2번
	
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
		return this.name + " (" + age + "세)";
	}
	
	
}

class Num{
	private int num;
	
	Num(int num){this.num = num;}
	
	@Override
	public int hashCode() {
		return num%3;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( this.num == ((Num)obj).num )
			return true;
		else 
			return false;
	}
	
	@Override
	public String toString() {
		return this.num + "";
	}
}

public class sum_0518 {
	public static void main(String[] args) {

		//2번
		HashSet<Person00> hSet = new HashSet<Person00>();
		hSet.add(new Person00("LEE", 10));
		hSet.add(new Person00("LEE", 10));
		hSet.add(new Person00("PARK", 35));
		hSet.add(new Person00("PARK", 35));

		//System.out.println("저장된 데이터 수: " + hSet.size());
		//System.out.println(hSet);

		//3번
		HashSet<Num> set = new HashSet<>();
        set.add(new Num(7799));
        set.add(new Num(9955));
        set.add(new Num(7799));

        System.out.println("인스턴스 수: " + set.size());

        for(Num n : set)
            System.out.print(n.toString() + '\t');

        System.out.println();
	}
}

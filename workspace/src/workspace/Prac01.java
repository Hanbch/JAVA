package workspace;

/*
 * "아래의 프로그램이 돌아 가도록 하시오.
public static void main(String[] args) {
   Friend[] frns = new Friend[10];
   int cnt = 0;
   
   frns[cnt++] = new UnivFriend(""LEE"", ""Computer"", ""010-333-555"");
   frns[cnt++] = new UnivFriend(""SEO"", ""Electronics"", ""010-222-444"");
   frns[cnt++] = new CompFriend(""YOON"", ""R&D 1"", ""02-123-999"");
   frns[cnt++] = new CompFriend(""PARK"", ""R&D 2"", ""02-321-777"");
   
   // 모든 동창 및 동료의 정보 전체 출력
   for(int i = 0; i < cnt; i++) {
      frns[i].showInfo();      // 오버라이딩 한 메소드가 호출된다.
      System.out.println();
   }
}"
 * */

import java.util.Scanner;

class A{}

class B extends A {
	
}

class Friend{
	protected String name;
	protected int phN;
	
	Friend(String name, int phN){
		this.name = name;
		this.phN = phN;
	}
}

class UnivFriend extends Friend{
	String course;
	
	UnivFriend(String name, String course, int phN){
		super(name,phN);
		this.course = course;
	}
	
	void print() {
		System.out.print(this.name+ " ");
		System.out.print(super.phN+ " ");
		System.out.println(course+ " ");
	}
}

class CompFriend extends Friend{
	String dept;
	
	CompFriend(String name, String dept, int phN){
		super(name,phN);
		this.dept = dept;
	}
	
	void print() {
		System.out.print(this.name + " ");
		System.out.print(super.phN+ " ");
		System.out.println(dept+ " ");
	}
}

public class Prac01 {
	public static void main(String[] args) {
		
		Friend[] frns = new Friend[10];
	   int cnt = 0;
	   
	   frns[cnt++] = new UnivFriend("LEE", "Computer", 5);
	   frns[cnt++] = new UnivFriend("SEO", "Electronics", 6);
	   frns[cnt++] = new CompFriend("YOON", "R&D 1",100000);
	   frns[cnt++] = new CompFriend("PARK", "R&D 2", 100000);
		
		for(int i=0; i<cnt; i++) {
			if(frns[i] instanceof UnivFriend) {
				((UnivFriend)frns[i]).print();
			}else if (frns[i] instanceof CompFriend) {
				((CompFriend)frns[i]).print();
			}
		}
//		A a = new B();
//		
//		if( a instanceof B ){
//			System.out.println("a라는 객체안에 B라는 class가있다.");
//		}else{
//			System.out.println("a라는 객체안에 B라는 class가없다.");
//		}
//		
//		testMethod(2);
	
	}
	
	public static void testMethod(int a) {
		System.out.println(a);
	}

}


//05/12
/*
1. 다음을 참고하여, INum 을 구현하시오.

public static void main(String[] args) {
   INum num1 = new INum(10);
   INum num2 = new INum(12);
   INum num3 = new INum(10);

   if(num1.equals(num2))
      System.out.println("num1, num2 내용 동일하다.");
   else
      System.out.println("num1, num2 내용 다르다.");

   if(num1.equals(num3))
      System.out.println("num1, num3 내용 동일하다.");
   else
      System.out.println("num1, num3 내용 다르다.");
}

======================================
결과
num1, num2 내용 다르다.
num1, num3 내용 동일하다.

2. 아래의 결과가 나는 이유를 설명하시오.

public static void main(String[] args) {
   String str1 = new String("So Simple");
   String str2 = new String("So Simple");

   // 참조 대상을 비교하는 if ~ else문
   if(str1 == str2)
      System.out.println("str1, str2 참조 대상 동일하다.");
   else
      System.out.println("str1, str2 참조 대상 다르다.");

   // 두 인스턴스 내용 비교하는 if ~ else문
   if(str1.equals(str2))
      System.out.println("str1, str2 내용 동일하다.");
   else
      System.out.println("str1, str2 내용 다르다.");
}

 - 문자열을 비교할때 == 연산자와 .equals의 차이점은 equals메서드는 문자열의 내용 하나한를 비교하서 
 	같은면 treu 다르면 false를 반환하는데 == 연산자는 객제의 주소값을 비교한다. 같은 내용의 문자열이라도
 	메모리상에 다른 주소에 저장되어있으면 false를 반환한다.

3. 다음 조건을 만족하는 클래스 String의 객체 이용 프로그램을 작성하여 메소드 equals()와 연산자 == 의 차이를 비교 설명하시오.(필수) ⭐️
- 메소드 equals()와 비교 연산자 ==의 차이를 다음 소스로 점검

String s1 = new String("java");
String s2 = new String("java");
String s3 = s2;

System.out.println(s1 == s2);
System.out.println(s1.equals(s2));
System.out.println(s2 == s3);
System.out.println(s2.equals(s3));

public class StringEquals {
	
	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = new String("java");
		String s3 = s2;

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3));
		
		if(s1 == s2)
			System.out.println("s1, s2 참조 대상 같다.");
		else
			System.out.println("s1, s2 참조 대상 다르다. ");
		
		if(s2 == s3)
			System.out.println("s2, s3 참조 대상 같다.");
		else
			System.out.println("s2, s3 참조 대상 다르다. ");
	
		if(s1.equals(s2))
			System.out.println("s1, s2 내용 동일하다.");
		else
			System.out.println("s1, s2 내용 다르다.");
		
		if(s2.equals(s3))
			System.out.println("s2, s3 내용 동일하다.");
		else
			System.out.println("s2, s3 내용 다르다.");

	}
}


false
true
true
true
s1, s2 참조 대상 다르다. 
s2, s3 참조 대상 같다.
s1, s2 내용 동일하다.
s2, s3 내용 동일하다.


4. 아래를 구현하시오.
- 클래스 Person은 이름을 저장하는 필드 구성
- 클래스 Person은 상위 클래스 Object의 메소드 equals()를 오버라이딩하여 이름이 같으면 true를 반환하는 메소드 구현
- 다음과 같은 소스로 클래스 Person을 점검

Person p1 = new Person("홍길동");
System.out.println(p1.equals(new Person("홍길동")));
System.out.println(p1.equals(new Person("최명태")));



5. 래퍼 클래스(Wrapper class)에 대하여 설명하시오.
  - 래퍼 클래스란 8개의 기본 타입에 해당하는 데이터를 객체로 표현하기 위해 포장해주는 클래스라고 한다.
	각각의 타입에 해당하는 데이터를 인수로 전달받아 해당 값을 가지는 객체로 만들어준다.
 */


package summary;

class INum{//1번 문제 class
	int num;
	
	INum(int num){
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(((INum)obj).num == this.num)
			return true;
		else
			return false;
	}
}

class Person{//4번 문제
	String name;
	
	Person(String name){
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( this.name == ((Person)obj).name)
			return true;
		else
			return false;
	}
	
}

public class sum_0512 {
	public static void main(String[] args) {
		
		//1. 다음을 참고하여, INum 을 구현하시오.
		
	   INum num1 = new INum(10);
	   INum num2 = new INum(12);
	   INum num3 = new INum(10);

	   if(num1.equals(num2))
	      System.out.println("num1, num2 내용 동일하다.");
	   else
	      System.out.println("num1, num2 내용 다르다.");

	   if(num1.equals(num3))
	      System.out.println("num1, num3 내용 동일하다.");
	   else
	      System.out.println("num1, num3 내용 다르다.");
	   
	   //4번 문제
	   Person p1 = new Person("홍길동");
	   System.out.println(p1.equals(new Person("홍길동")));
	   System.out.println(p1.equals(new Person("최명태")));
		
	}
}

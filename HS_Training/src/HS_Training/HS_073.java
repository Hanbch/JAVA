package HS_Training;
/* 74.
 아래를 구현하시오.
- 클래스 Person은 이름을 저장하는 필드 구성
- 클래스 Person은 상위 클래스 Object의 메소드 equals()를 
오버라이딩하여 이름이 같으면 true를 반환하는 메소드 구현
- 다음과 같은 소스로 클래스 Person을 점검

Person p1 = new Person(""홍길동"");
System.out.println(p1.equals(new Person(""홍길동"")));
System.out.println(p1.equals(new Person(""최명태"")));"
 */

class Person002{
	String name;
	
	Person002(String name){
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( this.name == ((Person002)obj).name )
			return true;
		else
			return false;
	}
	
}

public class HS_073 {

	public static void main(String[] args) {
		Person002 p1 = new Person002("홍길동");
		System.out.println(p1.equals(new Person002("홍길동")));
		System.out.println(p1.equals(new Person002("최명태")));
	}

}

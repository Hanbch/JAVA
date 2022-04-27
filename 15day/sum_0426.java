
public class sum_0426 {

	public static void main(String[] args) {
		
		/*
		 1.메소드 오버로딩이란?
		   - 메서드 오버로딩이란 같은이름의 메서드를 생성할때 받는 파라미터의 타입이 다르거나 갯수가
		     다르면 이름이 같은 메서드를 생성할수 있다.
 		 
		 2.메소드 오버로딩을 적용한 대표적인 함수는?
		   - println() 메서드가 대표적이다.
		   
		 3.this 함수에 대하여 설명하시오.
		   - this(par,par2); 형태로 생성자함수를 호출 할 수 있다.
		    
		 4.this란 무엇인가?
		   - this는 자기자신을 뜻한다 즉 행당객체를 가리킨다.
		     매개변수로 선언된 변수의 이름이 인스턴스 변수와 같을 때 		                 인스턴스 변수와 지역변수를 구분하기 위해서 사용한다.
		   
	     5.스트링 객체를 생성하는 2가지 방법은?
	       - String str = "abcdefg";
	       - String str1 = new String("abcdefg");
	       
		 6.immutable 에 대하여 설명하시오.
		   - 객체의 원형이 보전되는 것을 immutable이라 한다.
		 */   
		 //7. 문자열(영문으로)에서 자음과 모음 개수를 계산하는 프로그램을 작성하라.
		 String str1 = "Let's count String's length";
		 
		 
		 searchChar(str1);
		 
		 System.out.println("------------------------------------");
		 
		 //8.아래의 클래스를 구현하시오.
		 Employee employee = new Employee("홍길동", 19, "서울 뉴욕시", "개발 1팀");
		 employee.printInfo();
		 
			
		 //출력:
		 //이름 : 홍길동
		 //나이 : 19
		 //주소 : 서울 뉴욕시
		 //부서 : 개발 1팀
		 
		
	}
	public static void searchChar(String str) {
		int mo_count = 0;
		int ja_count = 0;
		
		for(int i=0; i<str.length();i++) { 
			char alp = str.charAt(i);
			 if( alp == 'a' || alp == 'e' || alp == 'i' || alp == 'o' || alp == 'u' ) {
				 mo_count++;
			 }else if(alp == ' '){
			 
			 }else {
				 ja_count++;
			 }
			
		}
		System.out.println("자음은: "+ja_count+'\n'+"모음은: "+mo_count);
	}

}

class Employee {
	String name;
	int age;
	String city;
	String team;
	
	public Employee() {}
	public Employee(String name, int age, String city, String team) {
		this.name = name;
		this.age = age;
		this.city = city;
		this.team = team;
	}
	
	public void printInfo() {
		System.out.println("이름: " + name + '\n' + "나이: " + age + "\n" + "지역: " + city+ "\n"  + "팀명: " + team);
	}
	
}

package chap16;

class Employee{
	private String name;
	private int age;
	private String city;
	private String dept;
	
	public Employee() {}
	public Employee(String name, int age, String city, String dept) {
		this.name = name;
		this.age = age;
		this.city = city;
		this.dept = dept;
	}
	
	public void printInfo() {
		System.out.println("이름: " + name + '\n' + "나이: " + age + "\n" + "지역: " + city+ "\n"  + "팀명: " + dept);
		System.out.print('\n');
	}
}

public class Review {
	
	public static void getCharNum(String str) {
		int mo_count = 0;
		int ja_count = 0;
		
		for(int i=0; i<str.length(); i++) {
			char alp = str.charAt(i);
			
			if( alp == 'a' || alp == 'e' || alp == 'i' || alp == 'o' || alp == 'u' ) {
				mo_count++;
			}else if (alp == ' ') {
				
			}else {
				ja_count++;
			}
		}
		
		System.out.println("모음: " + mo_count + "개" + '\n' + "자음: " + ja_count + "개");
	}
	
	public static void main(String[] args) {
		
		Employee employee = new Employee("홍길동", 19, "서울 뉴욕시", "개발 1팀");
		employee.printInfo();
		
		// 문자열(영문으로)에서 자음과 모음 개수를 계산하는 프로그램을 작성하라.
		String str = "Simple String";

		getCharNum(str);
		
		
		
	}
	
}

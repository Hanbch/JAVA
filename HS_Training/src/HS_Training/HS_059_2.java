package HS_Training;

// 59.
/*
 "5.다음을 만족하는 클래스 Employee01를 작성하시오
아래 6번과 연관됨

- 클래스 Employee01(직원)은 클래스 Regular01(정규직)와 Temporary(비정규직)의 상위 클래스
- 필드: 이름, 나이, 주소, 부서, 월급 정보를 필드로 선언
- 생성자 : 이름, 나이, 주소, 부서를 지정하는 생성자 정의
- 메소드 printInfo() : 인자는 없고 자신의 필드 이름, 나이, 주소, 부서를 출력

6. 다음을 만족하는 클래스 Regular01를 작성하시오.  (필수)
클래스 Regular01는 위에서 구현된 클래스 Employee01의 하위 클래스
생성자 : 이름, 나이, 주소, 부서를 지정하는 상위 생성자 호출
Setter : 월급 정보 필드를 지정
메소드 printInfo() : 인자는 없고 ""정규직""이라는 정보와 월급을 출력
"  "
  */
class Employee01{
	String name;
	int age;
	String adress;
	String department;
	
	Employee01(String name, int age, String adress, String department){
		this.name = name;
		this.age = age;
		this.adress = adress;
		this.department = department;
	}
	
	
	void printInfo(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(adress);
		System.out.println(department);
	}
}

class Regular01 extends Employee01{
	
	int salary;
	
	Regular01(String name, int age, String adress, String department){
		super(name, age, adress, department);
	}
	
	void setSalary(int sal){
		this.salary = sal;
	}
	
	void printinfo(){
		System.out.println("정규직입니다.");
		System.out.println(salary);
	}
	
}

public class HS_059_2 {
	
	public static void main(String[] args) {
		 
			Regular01 ep1 = new Regular01("choi",20,"안양","IT");
			
			ep1.setSalary(300);
			
			ep1.printInfo();
	}

}

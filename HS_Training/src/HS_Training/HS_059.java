package HS_Training;

// 59.
/*
 "5.다음을 만족하는 클래스 Employee를 작성하시오
아래 6번과 연관됨

- 클래스 Employee(직원)은 클래스 Regular(정규직)와 Temporary(비정규직)의 상위 클래스
- 필드: 이름, 나이, 주소, 부서, 월급 정보를 필드로 선언
- 생성자 : 이름, 나이, 주소, 부서를 지정하는 생성자 정의
- 메소드 printInfo() : 인자는 없고 자신의 필드 이름, 나이, 주소, 부서를 출력

6. 다음을 만족하는 클래스 Regular를 작성하시오.  (필수)
클래스 Regular는 위에서 구현된 클래스 Employee의 하위 클래스
생성자 : 이름, 나이, 주소, 부서를 지정하는 상위 생성자 호출
Setter : 월급 정보 필드를 지정
메소드 printInfo() : 인자는 없고 ""정규직""이라는 정보와 월급을 출력
"  "
  */
class Employee{
	String name;
	int age;
	String adress;
	String department;
	int salary;
	
	Employee(String name, int age, String adress, String department) {
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

class Regular extends Employee{
	
	Regular(String name, int age, String adress, String department){
		super(name,age,adress,department);
	}
	
	void setSalary(int salary){
		super.salary = salary;
	}
	
	void printinfo(){
		System.out.println("정규직입니다.");
		System.out.println(salary);
	}
	
}

public class HS_059 {
	
	public static void main(String[] args) {
		 
			Regular ep1 = new Regular("choi",20,"안양","IT");
			
			ep1.setSalary(300);
			
			ep1.printInfo();
	}

}

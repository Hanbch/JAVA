/*
 05/03
 
 1. 단일 상속과 다중상속 이란?
   - 단일 상속이란 A -> B -> C
   - 다중 상속  A -> B
   			  A -> C		
 
2. is a 관계와 has a 관계에 대하여 설명하시오.
	- 상속시킬때 자식class is 부모클래스 가 성립하거나          ex) 현대차(자식) is 자동차(부모) 
	  애매할때는 부모클래스 has 자식클래스를 대입해보고 성립해야한다 ex)  사람 has 눈
	  
3. 다형성(polymorphism)이란 무엇인가?
  - 객체생성할떄 데이터 타입과 생성자의 데이터형이 다른것이다.

3. 아래가 되지 않는 이유에 대하여 메모리 그림으로 설명하시오.
SmartPhone ph2 = new MobilePhone();
  - 폴리모피즘 데이터타입이 부모클래스가와야한다.
  - 스마트폰이 모바일폰보다 좁은범주라서 스마트폰을 모바일폰이 상속할는것는 적절치않다.

4. 메소드 오버라이딩(Overriding) 이란?
  - 오버라이딩이란 상속관계에서 같은 같은 반환타입을 반환하고 메서드명이같은 함수가
    내용 즉 body 가 다른것을 말한다.

5.다음을 만족하는 클래스 Employee를 작성하시오
아래 6번과 연관됨

- 클래스 Employee(직원)은 클래스 Regular(정규직)와 Temporary(비정규직)의 상위 클래스
- 필드: 이름, 나이, 주소, 부서, 월급 정보를 필드로 선언
- 생성자 : 이름, 나이, 주소, 부서를 지정하는 생성자 정의
- 메소드 printInfo() : 인자는 없고 자신의 필드 이름, 나이, 주소, 부서를 출력

6. 다음을 만족하는 클래스 Regular를 작성하시오.  (필수)
클래스 Regular는 위에서 구현된 클래스 Employee의 하위 클래스
생성자 : 이름, 나이, 주소, 부서를 지정하는 상위 생성자 호출
Setter : 월급 정보 필드를 지정
메소드 printInfo() : 인자는 없고 "정규직"이라는 정보와 월급을 출력

7.아래의 프로젝트가 컴파일 되도록 짜시오.

Shape[] shapes = { new Rectangle(10, 10), new Circle(20) };
            
            double total =0;
            
            for (Shape shape : shapes) {
                    total = total + shape.getArea();
                }
            System.out.println(total);        
 
 */

//5. 6. 7.번문제 풀이
package summary;

import javax.swing.plaf.SliderUI;

//class Employee{
//	private String name;
//	private int age;
//	private String adress;
//	private String department;
//	protected int salary;
//	
//	Employee(String name, int age, String adress, String department){ //생성자
//		this.name = name;
//		this.age = age;
//		this.adress = adress;
//		this.department = department;
//		this.salary = salary;
//	}
//	
//	void printInfo() { //메서드
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(adress);
//		System.out.println(department);
//	}
//	
//}

//class Regular extends Employee{
//	
//	Regular(String name, int age, String adress, String department){ // 생성자
//		super(name, age, adress, department); //부모클래스에서 호출
//	}
//	
// 	public void setSalary(int salary){
//		 super.salary = salary;
//	}
// 	
// 	void printInfo() {
//		System.out.println("정규직");
//		System.out.println(salary);
//	}
//	
//}
//class Temporary extends Employee{
//	
//	Temporary(String name, int age, String adress, String department){
//		super(name, age, adress, department);
//	}
//}
//
//class Shape{
//	
//	double getArea(){return 0;}
//}
//
//class Rectangle extends Shape{
//	int width, height;
//	
//	Rectangle(int width ,int height){
//		this.width = width;
//		this.height = height;
//	}
//	
//	double getArea(){
//		return width*height;
//	}
//	
//}
//
//class Circle extends Shape{
//	double rad;
//	
//	Circle(double rad){
//		this.rad = rad;
//	}
//	
//	double getArea(){
//		return rad*rad*Math.PI;
//	}
//	
//}

//public class sum_0503{
//	public static void main(String[] args) {
//		
//		Regular e1 = new Regular("Choi",20,"안양","IT");
//		
//		e1.setSalary(3000000);
//		e1.printInfo();
//		
//		System.out.println("----------------------------------------------");
//		
//		Shape[] shapes = { new Rectangle(10, 10), new Circle(20) };
//        
//        double total =0;
//        
//        for (Shape shape : shapes) {
//                total = total + shape.getArea();
//            }
//        System.out.println(total);    
//		
//	}
//}
// 
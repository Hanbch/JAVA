/*
 05/03
 
 1. ���� ��Ӱ� ���߻�� �̶�?
   - ���� ����̶� A -> B -> C
   - ���� ���  A -> B
   			  A -> C		
 
2. is a ����� has a ���迡 ���Ͽ� �����Ͻÿ�.
	- ��ӽ�ų�� �ڽ�class is �θ�Ŭ���� �� �����ϰų�          ex) ������(�ڽ�) is �ڵ���(�θ�) 
	  �ָ��Ҷ��� �θ�Ŭ���� has �ڽ�Ŭ������ �����غ��� �����ؾ��Ѵ� ex)  ��� has ��
	  
3. ������(polymorphism)�̶� �����ΰ�?
  - ��ü�����ҋ� ������ Ÿ�԰� �������� ���������� �ٸ����̴�.

3. �Ʒ��� ���� �ʴ� ������ ���Ͽ� �޸� �׸����� �����Ͻÿ�.
SmartPhone ph2 = new MobilePhone();
  - ���������� ������Ÿ���� �θ�Ŭ�������;��Ѵ�.
  - ����Ʈ���� ����������� �������ֶ� ����Ʈ���� ��������� ����Ҵ°ʹ� ����ġ�ʴ�.

4. �޼ҵ� �������̵�(Overriding) �̶�?
  - �������̵��̶� ��Ӱ��迡�� ���� ���� ��ȯŸ���� ��ȯ�ϰ� �޼�����̰��� �Լ���
    ���� �� body �� �ٸ����� ���Ѵ�.

5.������ �����ϴ� Ŭ���� Employee�� �ۼ��Ͻÿ�
�Ʒ� 6���� ������

- Ŭ���� Employee(����)�� Ŭ���� Regular(������)�� Temporary(��������)�� ���� Ŭ����
- �ʵ�: �̸�, ����, �ּ�, �μ�, ���� ������ �ʵ�� ����
- ������ : �̸�, ����, �ּ�, �μ��� �����ϴ� ������ ����
- �޼ҵ� printInfo() : ���ڴ� ���� �ڽ��� �ʵ� �̸�, ����, �ּ�, �μ��� ���

6. ������ �����ϴ� Ŭ���� Regular�� �ۼ��Ͻÿ�.  (�ʼ�)
Ŭ���� Regular�� ������ ������ Ŭ���� Employee�� ���� Ŭ����
������ : �̸�, ����, �ּ�, �μ��� �����ϴ� ���� ������ ȣ��
Setter : ���� ���� �ʵ带 ����
�޼ҵ� printInfo() : ���ڴ� ���� "������"�̶�� ������ ������ ���

7.�Ʒ��� ������Ʈ�� ������ �ǵ��� ¥�ÿ�.

Shape[] shapes = { new Rectangle(10, 10), new Circle(20) };
            
            double total =0;
            
            for (Shape shape : shapes) {
                    total = total + shape.getArea();
                }
            System.out.println(total);        
 
 */

//5. 6. 7.������ Ǯ��
package summary;

import javax.swing.plaf.SliderUI;

//class Employee{
//	private String name;
//	private int age;
//	private String adress;
//	private String department;
//	protected int salary;
//	
//	Employee(String name, int age, String adress, String department){ //������
//		this.name = name;
//		this.age = age;
//		this.adress = adress;
//		this.department = department;
//		this.salary = salary;
//	}
//	
//	void printInfo() { //�޼���
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(adress);
//		System.out.println(department);
//	}
//	
//}

//class Regular extends Employee{
//	
//	Regular(String name, int age, String adress, String department){ // ������
//		super(name, age, adress, department); //�θ�Ŭ�������� ȣ��
//	}
//	
// 	public void setSalary(int salary){
//		 super.salary = salary;
//	}
// 	
// 	void printInfo() {
//		System.out.println("������");
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
//		Regular e1 = new Regular("Choi",20,"�Ⱦ�","IT");
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
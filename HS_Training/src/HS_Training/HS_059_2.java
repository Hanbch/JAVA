package HS_Training;

// 59.
/*
 "5.������ �����ϴ� Ŭ���� Employee01�� �ۼ��Ͻÿ�
�Ʒ� 6���� ������

- Ŭ���� Employee01(����)�� Ŭ���� Regular01(������)�� Temporary(��������)�� ���� Ŭ����
- �ʵ�: �̸�, ����, �ּ�, �μ�, ���� ������ �ʵ�� ����
- ������ : �̸�, ����, �ּ�, �μ��� �����ϴ� ������ ����
- �޼ҵ� printInfo() : ���ڴ� ���� �ڽ��� �ʵ� �̸�, ����, �ּ�, �μ��� ���

6. ������ �����ϴ� Ŭ���� Regular01�� �ۼ��Ͻÿ�.  (�ʼ�)
Ŭ���� Regular01�� ������ ������ Ŭ���� Employee01�� ���� Ŭ����
������ : �̸�, ����, �ּ�, �μ��� �����ϴ� ���� ������ ȣ��
Setter : ���� ���� �ʵ带 ����
�޼ҵ� printInfo() : ���ڴ� ���� ""������""�̶�� ������ ������ ���
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
		System.out.println("�������Դϴ�.");
		System.out.println(salary);
	}
	
}

public class HS_059_2 {
	
	public static void main(String[] args) {
		 
			Regular01 ep1 = new Regular01("choi",20,"�Ⱦ�","IT");
			
			ep1.setSalary(300);
			
			ep1.printInfo();
	}

}

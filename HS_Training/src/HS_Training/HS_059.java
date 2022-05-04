package HS_Training;

// 59.
/*
 "5.������ �����ϴ� Ŭ���� Employee�� �ۼ��Ͻÿ�
�Ʒ� 6���� ������

- Ŭ���� Employee(����)�� Ŭ���� Regular(������)�� Temporary(��������)�� ���� Ŭ����
- �ʵ�: �̸�, ����, �ּ�, �μ�, ���� ������ �ʵ�� ����
- ������ : �̸�, ����, �ּ�, �μ��� �����ϴ� ������ ����
- �޼ҵ� printInfo() : ���ڴ� ���� �ڽ��� �ʵ� �̸�, ����, �ּ�, �μ��� ���

6. ������ �����ϴ� Ŭ���� Regular�� �ۼ��Ͻÿ�.  (�ʼ�)
Ŭ���� Regular�� ������ ������ Ŭ���� Employee�� ���� Ŭ����
������ : �̸�, ����, �ּ�, �μ��� �����ϴ� ���� ������ ȣ��
Setter : ���� ���� �ʵ带 ����
�޼ҵ� printInfo() : ���ڴ� ���� ""������""�̶�� ������ ������ ���
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
		System.out.println("�������Դϴ�.");
		System.out.println(salary);
	}
	
}

public class HS_059 {
	
	public static void main(String[] args) {
		 
			Regular ep1 = new Regular("choi",20,"�Ⱦ�","IT");
			
			ep1.setSalary(300);
			
			ep1.printInfo();
	}

}

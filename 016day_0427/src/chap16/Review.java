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
		System.out.println("�̸�: " + name + '\n' + "����: " + age + "\n" + "����: " + city+ "\n"  + "����: " + dept);
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
		
		System.out.println("����: " + mo_count + "��" + '\n' + "����: " + ja_count + "��");
	}
	
	public static void main(String[] args) {
		
		Employee employee = new Employee("ȫ�浿", 19, "���� �����", "���� 1��");
		employee.printInfo();
		
		// ���ڿ�(��������)���� ������ ���� ������ ����ϴ� ���α׷��� �ۼ��϶�.
		String str = "Simple String";

		getCharNum(str);
		
		
		
	}
	
}

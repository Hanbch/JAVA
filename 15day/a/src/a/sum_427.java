
public class sum_427 {

	public static void main(String[] args) {
		
		/*
		 1.�޼ҵ� �����ε��̶�?
		   - �޼��� �����ε��̶� �����̸��� �޼��带 �����Ҷ� �޴� �Ķ������ Ÿ���� �ٸ��ų� ������
		     �ٸ��� �̸��� ���� �޼��带 �����Ҽ� �ִ�.
 		 
		 2.�޼ҵ� �����ε��� ������ ��ǥ���� �Լ���?
		   - println() �޼��尡 ��ǥ���̴�.
		   
		 3.this �Լ��� ���Ͽ� �����Ͻÿ�.
		   - this(par,par2); ���·� �������Լ��� ȣ�� �� �� �ִ�.
		    
		 4.this�� �����ΰ�?
		   - this�� �ڱ��ڽ��� ���Ѵ� �� ��簴ü�� ����Ų��.
		     �Ű������� ����� ������ �̸��� �ν��Ͻ� ������ ���� �� 		                 �ν��Ͻ� ������ ���������� �����ϱ� ���ؼ� ����Ѵ�.
		   
	     5.��Ʈ�� ��ü�� �����ϴ� 2���� �����?
	       - String str = "abcdefg";
	       - String str1 = new String("abcdefg");
	       
		 6.immutable �� ���Ͽ� �����Ͻÿ�.
		   - ��ü�� ������ �����Ǵ� ���� immutable�̶� �Ѵ�.
		 */   
		 //7. ���ڿ�(��������)���� ������ ���� ������ ����ϴ� ���α׷��� �ۼ��϶�.
		 String str1 = "Let's count String's length";
		 
		 
		 searchChar(str1);
		 
		 System.out.println("------------------------------------");
		 
		 //8.�Ʒ��� Ŭ������ �����Ͻÿ�.
		 Employee employee = new Employee("ȫ�浿", 19, "���� �����", "���� 1��");
		 employee.printInfo();
		 
			
		 //���:
		 //�̸� : ȫ�浿
		 //���� : 19
		 //�ּ� : ���� �����
		 //�μ� : ���� 1��
		 
		
	}
	public static void searchChar(String str) {
		int mo_count = 0;
		int ja_count = 0;
		
		for(int i=0; i<str.length();i++) { 
			char alp = str.charAt(i);
			 if( alp == 'a' || alp == 'e' || alp == 'i' || alp == 'o' || alp == 'u' ) {
				 mo_count++;
			 }else {
				 ja_count++;
			 }
			
		}
		System.out.println("������: "+ja_count+'\n'+"������: "+mo_count);
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
		System.out.println("�̸�: " + name + '\n' + "����: " + age + "\n" + "����: " + city+ "\n"  + "����: " + team);
	}
	
}

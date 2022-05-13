package HS_Training;
/* 74.
 �Ʒ��� �����Ͻÿ�.
- Ŭ���� Person�� �̸��� �����ϴ� �ʵ� ����
- Ŭ���� Person�� ���� Ŭ���� Object�� �޼ҵ� equals()�� 
�������̵��Ͽ� �̸��� ������ true�� ��ȯ�ϴ� �޼ҵ� ����
- ������ ���� �ҽ��� Ŭ���� Person�� ����

Person p1 = new Person(""ȫ�浿"");
System.out.println(p1.equals(new Person(""ȫ�浿"")));
System.out.println(p1.equals(new Person(""�ָ���"")));"
 */

class Person002{
	String name;
	
	Person002(String name){
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( this.name == ((Person002)obj).name )
			return true;
		else
			return false;
	}
	
}

public class HS_073 {

	public static void main(String[] args) {
		Person002 p1 = new Person002("ȫ�浿");
		System.out.println(p1.equals(new Person002("ȫ�浿")));
		System.out.println(p1.equals(new Person002("�ָ���")));
	}

}


//05/04
/*
1. instanceof  �����ڿ� ���Ͽ� �����Ͻÿ�.
  - instanceof�����ڴ� ��ü�� class�� �����ִ��� Ȯ���ϴ� �������̴�
    ex) a instanceof Car �̰��� a��� ��ü�� Car��� ��ü�� ������ ������ true ��ȯ �ƴϸ� false

2. Object Ŭ������ ���Ͽ� �����Ͻÿ�.
  - Object�� �ֻ����� �θ�Ŭ�����̴� ����� ���������� ������ extends Object�� ����Ʈ���̴�.

3. �Ʒ��� ���� ��µǴ� ������ �����Ͻÿ�.

class A{

}

public class Test {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);
	}
}
���
A@111111111

  - class A�� Object class�� ����Ѵ�. ObjectŬ������ �⺻������ ����� �Լ����ִµ� 
    ���� �ϳ��� toString �̴� ������ A ���� toString�� �������̵� �Ǿ����� �����Ƿ� �׳� �ּҰ��� ����Ѵ�.

4. �Ʒ��� ���α׷��� ���� ������ �Ͻÿ�.
public static void main(String[] args) {
   Friend[] frns = new Friend[10];
   int cnt = 0;
   
   frns[cnt++] = new UnivFriend("LEE", "Computer", "010-333-555");
   frns[cnt++] = new UnivFriend("SEO", "Electronics", "010-222-444");
   frns[cnt++] = new CompFriend("YOON", "R&D 1", "02-123-999");
   frns[cnt++] = new CompFriend("PARK", "R&D 2", "02-321-777");
   
   // ��� ��â �� ������ ���� ��ü ���
   for(int i = 0; i < cnt; i++) {
      frns[i].showInfo();      // �������̵� �� �޼ҵ尡 ȣ��ȴ�.
      System.out.println();
   }
}


5.�Ʒ��� ���α׷��� �Ͻÿ�.

���ӽ��� 1
�������� 2
>>
1
���ڸ� �Է����ּ��� : 50
Down ===> 9�� ���� �ֽ��ϴ�.
���ڸ� �Է����ּ��� : 25
Down ===> 8�� ���� �ֽ��ϴ�.
���ڸ� �Է����ּ��� : 12
Up ====> 7�� ���� �ֽ��ϴ�.
���ڸ� �Է����ּ��� : 17
��ġ

 
 * */
// 4�� 5�� ����
package summary;

import java.util.Scanner;

//4������ Class
class Friend{
	protected String name, phone;
	
	public Friend(String na, String ph){
		this.name = na;
		this.phone = ph;
	}
	
	public void showInfo(){}
	
}

class UnivFriend02 extends Friend { // ���� ��â
	
	private String major; // ����

	public UnivFriend02(String na, String ma, String ph) {
		super(na, ph);
		major = ma;
		
	}

	public void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + major);
		System.out.println("��ȭ: " + phone);
	}
}

class CompFriend02 extends Friend{ // ���� ����
	
	private String department; // �μ�

	public CompFriend02(String na, String de, String ph) {
		super(na, ph);
		department = de;
		
	}

	public void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("�μ�: " + department);
		System.out.println("��ȭ: " + phone);
	}
}

//5������ Class

class UpDown {
	private int targetNum;
	private int userNum;

	UpDown() {
	}

	public void checkNum() {
		Scanner sc = new Scanner(System.in);

		targetNum = (int) (Math.random() * 100) + 1;

		System.out.print("���ڸ� �Է����ּ���: ");
		userNum = sc.nextInt();

		int count = 1;
		boolean check = true;

		while (check) {
			if (targetNum == userNum) {
				System.out.println("��ġ");
				check = false;
			} else if (targetNum > userNum) {
				System.out.println("UP" + "=====>" + (10 - count++) + "�� ���ҽ��ϴ�.");
				userNum = sc.nextInt();
			} else if (targetNum < userNum) {
				System.out.println("Down" + "=====>" + (10 - count++) + "�� ���ҽ��ϴ�.");
				userNum = sc.nextInt();
			}

			if (count == 10) {
				System.out.println("Game Over");
				System.out.println("������: " + targetNum);
				return;
			}

		}
	}

}

public class sum_0504 {
	public static void main(String[] args) {
		
		//4��
		Friend[] frns = new Friend[10];
		   int cnt = 0;
		   
		   frns[cnt++] = new UnivFriend02("LEE", "Computer", "010-333-555");
		   frns[cnt++] = new UnivFriend02("SEO", "Electronics", "010-222-444");
		   frns[cnt++] = new CompFriend02("YOON", "R&D 1", "02-123-999");
		   frns[cnt++] = new CompFriend02("PARK", "R&D 2", "02-321-777");
		   
		   // ��� ��â �� ������ ���� ��ü ���
		   for(int i = 0; i < cnt; i++) {
		      frns[i].showInfo();      // �������̵� �� �޼ҵ尡 ȣ��ȴ�.
		      System.out.println();
		   }
		//5��
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("���ӽ��� 1");
			System.out.println("�������� 2");

			UpDown g1 = new UpDown();

			int check = sc.nextInt();

			if (check == 1)
				g1.checkNum();
			else
				System.out.println("��������");
			return;
		}
	}
}

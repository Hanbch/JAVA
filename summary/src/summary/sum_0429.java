package summary;

import java.util.Scanner;

public class sum_0429{
	public static void main(String[] args) {
/*

1.�Ʒ��� �޸� �׸��� �׸��ÿ�.
 2���� �迭int[][] arr = new int[3][3]
 
 ai���� ����

2. �Ʒ��� ���α׷��� �Ͻÿ�.(ȭ�� �ż�)

���� �Է��ϼ���
12900
������ : 0��
���� : 1��
��õ�� : 0��
õ�� : 2��
����� : 1��
��� : 4��
��� Y :: �ߴ� N

3. ���������� ���� 

�Ʒ��� ���α׷��� �Ͻÿ�.
==============================================
���� ���� ���� �Է��ϼ���.
����
����:���� �����:����
�����ϴ�
��� Y :: �ߴ� N
y
���� ���� ���� �Է��ϼ���.
��
����:���� �����:��
���� �����ϴ�.
��� Y :: �ߴ� N
n
�ȳ��� ������

4. �Ʒ��� ���α׷��� �Ͻÿ�.

���� �ڵ�� ���� ����� ������ ¦�� �̷絵�� 2���� �迭�� �ۼ��϶�.

String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
int score[]  = {95, 88, 76, 62, 55};
�׸��� ���� ���ÿ� ���� ���� �̸��� �Է¹޾� ������ ����ϴ� ���α׷��� �ۼ��϶�. "�׸�"�� �Է¹����� �����Ѵ�. (Java�� �ε��� 0�� �����Ƿ� score[0]�� ���)

���� �̸� >> Jaba
���� �����Դϴ�.
���� �̸� >> Java
Java�� ������ 95
���� �̸� >> �ȵ���̵�
�ȵ���̵��� ������ 55
���� �̸� >> �׸�

5. ���شٿ� UP&Down ���ڸ��߱� ����

��ǻ�Ͱ� 1~100 ����(���� ����) �� �ϳ��� �������� ���մϴ�. (�̸� �˷����� �ʽ��ϴ�.)
����ڴ� �� ���ڸ� ���߾�� �մϴ�.
�Է��� ���ں��� ������ ũ�� �� "UP" ���,
�Է��� ���ں��� ������ ������ �� "DOWN" ���.
������ ���߸� �� "����"�� ����ϰ�, ���ݱ��� ���ڸ� �Է��� Ƚ���� �˷��ݴϴ�.

(����)
��ǻ�Ͱ� 1~100 �� ���� ���� �ϳ��� ���մϴ�.
�� ���ڸ� �����ּ���.
1~100 ���� �Է�:50
DOWN
1~100 ���� �Է�:25
UP
1~100 ���� �Է�:38
DOWN
1~100 ���� �Է�:32
UP
1~100 ���� �Է�:35
UP
1~100 ���� �Է�:37
DOWN
1~100 ���� �Է�:36
�����Դϴ�! 7ȸ ���� ������.

*/
//2������
		Scanner sc = new Scanner(System.in);
		String yn = "Y";
		
		for(;;) {
			if(yn.equals("Y") || yn.equals("y") ) {
			
				System.out.println("�ݾ��� �Է��Ͻÿ�.");
				int price = sc.nextInt();
				
				CalMoney mon = new CalMoney(price);
				
				mon.showMoney();
				
				System.out.println("���:Y :: ����: N");
				
				yn = sc.next();
			 }else if(yn.equals("N") || yn.equals("n") ) {
				 System.out.println("���α׷��� ����˴ϴ�.");
				 return;
			 }else {
				 System.out.println("�߸��Է� �ϼ̽��ϴ�. Y�� N �� �ϳ��� �Է����ּ���.");
				 yn = sc.next();
			 }
		 }
		
		
//3������
	
//		for(;;) {
//			System.out.println("���� ���� �� ����");
//			
//				
//				String[] Random = {"����","����","��"};
//				String me = sc.next();
//				String com =Random[(int)(Math.random()*3)];
//				
//				
//					if(me.equals("����")){
//							
//							switch(com) {
//								case ("����"): 
//									System.out.println("com�� "+ com);
//									System.out.println("����"+ me);
//									System.out.println("�����ϴ�.");
//								break;
//								
//								case ("����"): 
//									System.out.println("com�� "+ com);
//									System.out.println("����"+ me);
//									System.out.println("�����ϴ�.");
//								break;
//								
//								case ("��"): 
//									System.out.println("com�� "+ com);
//									System.out.println("����"+ me);
//									System.out.println("�̰���ϴ�.");
//								break;
//							}
//					}
//					
//					else if(me.equals("����")) {
//						switch(com) {
//							case ("����"): 
//								System.out.println("com�� "+ com);
//								System.out.println("����"+ me);
//								System.out.println("�̰���ϴ�.");
//							break;
//							
//							case ("����"): 
//								System.out.println("com�� "+ com);
//								System.out.println("����"+ me);
//								System.out.println("�����ϴ�.");
//							break;
//							
//							case ("��"): 
//								System.out.println("com�� "+ com);
//								System.out.println("����"+ me);
//								System.out.println("������ϴ�.");
//							break;
//						}
//					}
//					
//					else if(me.equals("��")) {
//						switch(com) {
//							case ("����"): 
//								System.out.println("com�� "+ com);
//								System.out.println("����"+ me);
//								System.out.println("�����ϴ�.");
//							break;
//							
//							case ("����"): 
//								System.out.println("com�� "+ com);
//							System.out.println("����"+ me);
//								System.out.println("�̰���ϴ�.");
//							break;
//							
//							case ("��"): 
//								System.out.println("com�� "+ com);
//							System.out.println("����"+ me);
//								System.out.println("�����ϴ�.");
//							break;
//						}
//			
//					}
//					
//					else {
//						System.out.println("�߸� �Է��ϼ̽��ϴ�. ����, ����, ��  �� �ϳ��� �Է��ϼ���");			
//					}
//			}
		
		
//4������
//			String[] course = new String[5];
//			int[] score = new int[5];
//			
//			course[0] = "Java";
//			course[1] = "C++";
//			course[2] = "HTML5";
//			course[3] = "��ǻ�ͱ���";
//			course[4] = "�ȵ���̵�";
//			
//			score[0] = 95;
//			score[1] = 88;
//			score[2] = 76;
//			score[3] = 62;
//			score[4] = 55;
//	
//		
//			System.out.print("���� �̸� �Է�: ");
//			String courseName = sc.next();
//			int scoreNum = 0;
//	
//			for(;;) {
//				boolean check = false;
//			
//				for(int i =0; i<course.length; i++) {
//				
//					if(courseName.equals(course[i])) {
//						scoreNum = score[i];
//						check = true;
//					}
//				}
//				
//				if(check) {
//					System.out.println("�����̸�: " + courseName);
//					System.out.println(courseName + "�� ������ " + scoreNum);
//					System.out.println("���� �̸� �Է�: ");
//					courseName = sc.next();
//				}else {
//					System.out.println("�ٽ��Է�");
//					courseName = sc.next();
//				}
//				
//				if(courseName.equals("�׸�")) {
//					return;
//				}
//			}
		
//5������
//		int targetNum = (int)(Math.random()*100+1);
//		int count = 0;
//		boolean check =true;
//		
//		System.out.println("1~100 ���� ���� �Է�");
//		int userNum = sc.nextInt();
//		for(;;) {
//			count++;
//			if(check) {
//				if( targetNum > userNum) {
//					System.out.println("up");
//					userNum = sc.nextInt();
//				}else if(targetNum < userNum) {
//					System.out.println("down");
//					userNum = sc.nextInt();
//				}else if(targetNum == userNum){
//					System.out.println("����!!"+count+"������ ����");
//					check = false;
//				}
//			}else {
//				return;
//			}
//		}

	}
	
}

class CalMoney{
	 int won1;
	 int won2;
	 int won3;
	 int won4;
	 int won5;
	
	int price;
	
CalMoney(int price){this.price = price;}
	
	int[] getMoney(){
		won1 = price/50000;
		won2 = (price%50000)/10000;
		won3 = (price%10000)/5000;
		won4 = (price%5000)/1000;
		won5 = (price%1000)/500;
		
		int[] countArr = {won1, won2, won3, won4, won5};
		return countArr;
	}
	
	void showMoney(){
		System.out.println("������: "+ getMoney()[0] +"��");
		System.out.println("�ϸ���: "+ getMoney()[1] +"��");
		System.out.println("��õ��: "+ getMoney()[2] +"��");
		System.out.println("��õ��: "+ getMoney()[3] +"��");
		System.out.println("�����: "+ getMoney()[4] +"��");
	}
}
package chap18;
/*"���� �ڵ�� ���� ����� ������ ¦�� �̷絵�� 2���� �迭�� �ۼ��϶�.

String course[] = {""Java"", ""C++"", ""HTML5"", ""��ǻ�ͱ���"", ""�ȵ���̵�""};
int score[]  = {95, 88, 76, 62, 55};
�׸��� ���� ���ÿ� ���� ���� �̸��� �Է¹޾� ������ ����ϴ� ���α׷��� �ۼ��϶�. ""�׸�""�� �Է¹����� �����Ѵ�. (Java�� �ε��� 0�� �����Ƿ� score[0]�� ���)

���� �̸� >> Jaba
���� �����Դϴ�.
���� �̸� >> Java
Java�� ������ 95
���� �̸� >> �ȵ���̵�
�ȵ���̵��� ������ 55
���� �̸� >> �׸�"
*/


import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		
		String[] course = new String[5];
		int[] score = new int[5];
		
		course[0] = "Java";
		course[1] = "C++";
		course[2] = "HTML5";
		course[3] = "��ǻ�ͱ���";
		course[4] = "�ȵ���̵�";
		
		score[0] = 95;
		score[1] = 88;
		score[2] = 76;
		score[3] = 62;
		score[4] = 55;
		
		Scanner sc = new Scanner(System.in);
		
			System.out.print("���� �̸� �Է�: ");
			String courseName = sc.next();
			int scoreNum = 0;
	
			for(;;) {
				boolean check = false;
			
				for(int i =0; i<course.length; i++) {
				
					if(courseName.equals(course[i])) {
						scoreNum = score[i];
						check = true;
					}
				}
				
				if(check) {
					System.out.println("�����̸�: " + courseName);
					System.out.println(courseName + "�� ������ " + scoreNum);
					System.out.println("���� �̸� �Է�: ");
					courseName = sc.next();
				}else {
					System.out.println("�ٽ��Է�");
					courseName = sc.next();
				}
				
				if(courseName.equals("�׸�")) {
					return;
				}
			}
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
	}

}

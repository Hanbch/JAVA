// 54.
/*"���� �ڵ�� ���� ����� ������ ¦�� �̷絵�� 2���� �迭�� �ۼ��϶�.

String course[] = {""Java"", ""C++"", ""HTML5"", ""��ǻ�ͱ���"", ""�ȵ���̵�""};
int score[]  = {95, 88, 76, 62, 55};
�׸��� ���� ���ÿ� ���� ���� �̸��� �Է¹޾� ������ ����ϴ� ���α׷��� 
�ۼ��϶�. ""�׸�""�� �Է¹����� �����Ѵ�.
 (Java�� �ε��� 0�� �����Ƿ� score[0]�� ���)

���� �̸� >> Jaba
���� �����Դϴ�.
���� �̸� >> Java
Java�� ������ 95
���� �̸� >> �ȵ���̵�
�ȵ���̵��� ������ 55
���� �̸� >> �׸�"

*/

package HS_Training;

import java.util.Scanner;

class ShowInfo{
	private String[] courseArr = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
	private  int[] scoreArr = {95, 100, 80, 70, 50};
	private String course;
	private String check;
	
	
	
	
	ShowInfo(String course) {this.course = course;}
	
	public void printInfo(){
		Scanner sc = new Scanner(System.in);
		for(;;) {
			boolean YN = false;
			
			for(int i=0; i<scoreArr.length; i++) {
				
				if(course.equals(courseArr[i])) {
					System.out.println("�����̸�: " + course);
					System.out.println(course + "�� ������: " + scoreArr[i]);
					YN=true;
					
				}
	
			}
			if(YN == false) {
				System.out.println("�߸��Է� �ٽ� �Է�");
				course =sc.next();
				continue;
			}	
			
			System.out.println("���Y :: �׸�N");
			check =sc.next();
			
			if(check.equals("N") || check.equals("n")) {
				System.out.println("���α׷� ����");
				return;
			}
			System.out.println("����� �Է�");
			course =sc.next();
		}	
		
		
	}
	
	
	
}

public class HS_054 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("����� �Է�");
			String course = sc.next();
			ShowInfo hb = new ShowInfo(course);
			
			hb.printInfo();
			
			
		
		
		
		
	}
}
package workspace;

import java.lang.Math;
import java.util.Scanner;

public class RockCeaserPaper {
	public static void main(String[] args) {
		
	for(;;) {
		System.out.println("���� ���� �� ����");
		Scanner sc  = new Scanner(System.in);
			
			String[] Random = {"����","����","��"};
			String me = sc.next();
			String com =Random[(int)(Math.random()*3)];
			
			
				if(me.equals("����")){
						
						switch(com) {
							case ("����"): 
								System.out.println("com�� "+ com);
								System.out.println("����"+ me);
								System.out.println("�����ϴ�.");
							break;
							
							case ("����"): 
								System.out.println("com�� "+ com);
								System.out.println("����"+ me);
								System.out.println("�����ϴ�.");
							break;
							
							case ("��"): 
								System.out.println("com�� "+ com);
								System.out.println("����"+ me);
								System.out.println("�̰���ϴ�.");
							break;
						}
				}
				
				else if(me.equals("����")) {
					switch(com) {
						case ("����"): 
							System.out.println("com�� "+ com);
							System.out.println("����"+ me);
							System.out.println("�̰���ϴ�.");
						break;
						
						case ("����"): 
							System.out.println("com�� "+ com);
							System.out.println("����"+ me);
							System.out.println("�����ϴ�.");
						break;
						
						case ("��"): 
							System.out.println("com�� "+ com);
							System.out.println("����"+ me);
							System.out.println("������ϴ�.");
						break;
					}
				}
				
				else if(me.equals("��")) {
					switch(com) {
						case ("����"): 
							System.out.println("com�� "+ com);
							System.out.println("����"+ me);
							System.out.println("�����ϴ�.");
						break;
						
						case ("����"): 
							System.out.println("com�� "+ com);
						System.out.println("����"+ me);
							System.out.println("�̰���ϴ�.");
						break;
						
						case ("��"): 
							System.out.println("com�� "+ com);
						System.out.println("����"+ me);
							System.out.println("�����ϴ�.");
						break;
					}
		
				}
				
				else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. ����, ����, ��  �� �ϳ��� �Է��ϼ���");			
				}
		}
		
	
	}

}

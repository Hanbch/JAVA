package workspace;

import java.util.Scanner;

interface IGame{
	
	public void run(int getStart);
	
}

class UpDownGame implements IGame{
	
	public void run(int getStart) {
		Scanner sc = new Scanner(System.in);
		int targetNum = (int)(Math.random()*100)+1;
		int userNum;
		int[] inputArr = new int[10];
		int count = 1;
		boolean check = true;
		
		if(getStart == 1) {
			System.out.println("1~100�� ���ڸ� �Է����ּ���.");
			userNum = sc.nextInt();
			
			while(true) {
				if(targetNum > userNum) {
					System.out.println("UP");
					System.out.println("���� ��ȸ : " + (10 - count++));
					userNum = sc.nextInt();
				}else if(targetNum < userNum) {
					System.out.println("DOWN");
					System.out.println("���� ��ȸ : " + (10 - count++));
					userNum = sc.nextInt();
				}else {
					System.out.println(count + "�� ���� ����!!");
					return;
				}
				
				if(count == 10) {
					System.out.println("GameOver");
					return;
				}
			}
		}else if(getStart == 2) {
			System.out.println("���� ����");
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�." + "\n" + "1. ���ӽ��� " + "\n" + "2. �������� ");
		}
		
		
	}
	
}

class RSPGame implements IGame{
	
	public void run(int getStart) {
		
		while(getStart == 1) {
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
			System.out.println("1.���ӽ���"+ "\n" + "2.���� ����");
			getStart = sc.nextInt();
		} 
		
		System.out.println("���� ����");
		return;
		
	}
	
}

public class MakeGame {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int getStart = 1;
		
		while(getStart == 1) {
			System.out.println("1.���ӽ���"+ "\n" + "2.���� ����");
			getStart = sc.nextInt();
			
			IGame g1 = new UpDownGame();
			//g1.run(getStart);
			
			IGame g2 = new RSPGame();
			g2.run(getStart);
		}
		
	}

}

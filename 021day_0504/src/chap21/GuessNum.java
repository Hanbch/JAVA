package chap21;

import java.util.Scanner;

class UpDown{
	private int targetNum;
 	private int userNum;
	
	UpDown(){ }
	
	public void checkNum(){
		Scanner sc = new Scanner(System.in);
		
		targetNum = (int)(Math.random()*100)+1;
		
		System.out.print("���ڸ� �Է����ּ���: ");
		userNum = sc.nextInt();
		
		int count = 1;
		boolean check = true;
		
		while(check) {
			if( targetNum == userNum ) {
				System.out.println("��ġ");
				check = false;
			}else if( targetNum > userNum ) {
				System.out.println("UP" + "=====>" + (10-count++) + "�� ���ҽ��ϴ�.");
				userNum = sc.nextInt();
			}else if( targetNum < userNum ){
				System.out.println("Down" + "=====>" + (10-count++) + "�� ���ҽ��ϴ�.");
				userNum = sc.nextInt();
			}
			
			if(count == 10) {
				System.out.println("Game Over");
				System.out.println("������: "+ targetNum);
				return;
			}
			
		}
	}
	
	
}

public class GuessNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UpDown g1 = new UpDown();
		
		for(;;) {
			System.out.println("���ӽ��� 1");
			System.out.println("�������� 2");
			
			int check = sc.nextInt();
			
			if(check == 1)
				g1.checkNum();
			else
				System.out.println("��������");
				return;
		}
	}

}

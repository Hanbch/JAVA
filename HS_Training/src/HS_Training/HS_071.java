package HS_Training;
/* 71.
 ���� ������ ������. �� ����� ������ �����Ѵ�. 
�̵��� �̸��� Ű����� �Է¹����� �� ����� Person Ŭ������ �ۼ��϶�. 
�׷��Ƿ� ���α׷����� 2���� Person ��ü�� �����Ǿ�� �Ѵ�. 
�� ����� ������ ���鼭 ������ �����ϴµ� 
�� ����� �ڱ� ���ʿ��� <Enter> Ű�� �Է��ϸ�, 
3���� ������ �߻��ǰ� �� ���ڰ� ��� ������ ���ڰ� �ǰ� ������ ������.
 ������ ������ �ʹ� ũ�� ������ 3���� ���ڰ� ��ġ�ϰ� ���� ���ɼ��� 
���� ������ ������ ������ 1~3������ �Ѵ�."
 */
import java.util.Scanner;

class Person{
	private String name;
	
	Person(String name){this.name = name;}
	
	String getName(){
		return name;
	}
}

class GambleGame{
	
	void run(String a, String b) {
		Scanner sc = new Scanner(System.in);
		Person player1 = new Person(a);
		Person player2 = new Person(b);
		String check = "Y";
		
		System.out.println("player1�� " + player1.getName());
		System.out.println("player2�� " + player2.getName());
		System.out.println();
		
		while(true) {
			System.out.println(player1.getName() + " Enter");
			
			String start = sc.nextLine();
			
			int num1, num2, num3 ;
			num1 = (int)(Math.random()*3+1);
			num2 = (int)(Math.random()*3+1);
			num3 = (int)(Math.random()*3+1);
			System.out.println(num1 + "" + num2 + "" + num3);
			
			if(num1 == num2 && num2 == num3) {
				System.out.println(player1.getName() + "���� �̰���ϴ�." + "\n");
				return;
			}else {
				System.out.println("�ƽ�����!" + "\n");
			}
			
			System.out.println(player2.getName() + " Enter");
			
			start = sc.nextLine();
			num1 = (int)(Math.random()*3+1);
			num2 = (int)(Math.random()*3+1);
			num3 = (int)(Math.random()*3+1);
			System.out.println(num1 + "" + num2 + "" + num3);
			
			if(num1 == num2 && num2 == num3) {
				System.out.println(player2.getName() + "���� �̰���ϴ�." + "\n");
				return;
			}else {
				System.out.println("�ƽ�����!" + "\n");
			}
		}
	}
	
}

public class HS_071{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("player1 �̸��� �Է����ּ���.");
		String p1 = sc.next();
		System.out.println("player2 �̸��� �Է����ּ���.");
		String p2 = sc.next();
		System.out.println();
		
		GambleGame game = new GambleGame();
		game.run(p1, p2);
		
	}
}
// 51.����������
package HS_Training;

import java.util.Scanner;

class RSP{
	private String name;
	private int rsp;
	
	RSP(){
		this.name = "com";
		this.rsp = (int)(Math.random()*3+1);
	}
	RSP(String name, int rsp){
		this.name = name;
		this.rsp = rsp;
	}
	
	public String toString(int rsp) {
		if(rsp == 1) 
			return "����";
		else if(rsp == 2) 
			return "����";
		else
			return "��";	
	}
	
	
	void printResult(RSP player) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(this.name + "�� " + toString(this.rsp) + " " +player.name + "�� " + toString(player.rsp));
	
		if(this.rsp == player.rsp)
			System.out.println("�����ϴ�.");
		
		if(player.rsp == 1 && this.rsp == 2) 
			System.out.println(player.name + "�� �����ϴ�.");
		else if(player.rsp == 1 && this.rsp == 3)
			System.out.println(player.name + "�� �̰���ϴ�.");
		else if(player.rsp == 2 && this.rsp == 1)
			System.out.println(player.name + "�� �̰���ϴ�.");
		else if(player.rsp == 2 && this.rsp == 3)
			System.out.println(player.name + "�� �����ϴ�.");
		else if(player.rsp == 3 && this.rsp == 1)
			System.out.println(player.name + "�� �����ϴ�.");
		else if(player.rsp == 3 && this.rsp == 2)
			System.out.println(player.name + "�� �̰���ϴ�.");
		
		
		
		
	}
		
}

public class HS_051_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String check = "Y";

		for(;;) {
			System.out.println("1.���� 2.���� 3.�� �ش� ��ȣ �Է�");
			
			int rsp = sc.nextInt();
			
			RSP com = new RSP();
			RSP palyer1 = new RSP("Choi", rsp);
			
			com.printResult(palyer1);
			
			System.out.println("��� Y :: �ߴ� N");
			check = sc.next();
			
			if(check.equals("N") || check.equals("n")) {
				System.out.println("���α׷� ����");
				return;
			}
		}
		
	}
}
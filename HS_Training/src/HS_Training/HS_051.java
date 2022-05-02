// 51.����������
package HS_Training;

import java.util.Scanner;

class RSPPlayer{
	private String name;
	private int rsp;
	
	
	public RSPPlayer(){
		name = "��ǻ��";
		rsp = (int)(Math.random()*3+1);
	}
	
	public RSPPlayer(String name,String str){
		this.name = name;
		if(str.equals("����"))
			rsp = 1;
		else if(str.equals("����"))
			rsp = 2;
		else 
			rsp = 3;
	}
	
	private String getRspString(int rsp) {
		String str = "";
		
		if(rsp == 1)
			str = "����";
		else if(rsp == 2)
			str = "����";
		else 
			str = "��";
		
		return str;
		
		
	}
	
	public void result(RSPPlayer you) {
		System.out.println(this.name + ":" + getRspString(this.rsp) +" " +
				you.name + ":" + getRspString(you.rsp));
		
		if(this.rsp == you.rsp) {
			System.out.println("�����ϴ�.");
			return;
		}
		
		if(this.rsp == 1 && you.rsp == 2) {
			System.out.println(this.name + " �����ϴ�.");
		}else if (this.rsp == 1 && you.rsp == 3) {
			System.out.println(this.name + " �̰���ϴ�.");
		}else if (this.rsp == 2 && you.rsp == 1) {
			System.out.println(this.name + " �̰���ϴ�.");
		}else if (this.rsp == 2 && you.rsp == 3) {
			System.out.println(this.name + " �����ϴ�.");
		}else if (this.rsp == 3 && you.rsp == 1) {
			System.out.println(this.name + " �����ϴ�.");
		}else if (this.rsp == 3 && you.rsp == 2) {
			System.out.println(this.name + " �̰���ϴ�.");
		}
			
		
	}
	
}

public class HS_051 {
	public static void main(String[] args) {
		while(true){
			Scanner sc= new Scanner(System.in);
			System.out.println("�Է�");
			String rsp = sc.next();
			RSPPlayer com = new RSPPlayer();
			RSPPlayer you = new RSPPlayer("����",rsp);
			
			com.result(you);
			
			System.out.println("Y::N");
			String check = sc.next();
			if(check.equals("N") || check.equals("n"))
				break;
		}
		System.out.println("���α׷� ����");
	}
}
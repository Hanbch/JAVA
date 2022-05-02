// 51.가위바위보
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
			return "가위";
		else if(rsp == 2) 
			return "바위";
		else
			return "보";	
	}
	
	
	void printResult(RSP player) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(this.name + "은 " + toString(this.rsp) + " " +player.name + "은 " + toString(player.rsp));
	
		if(this.rsp == player.rsp)
			System.out.println("비겼습니다.");
		
		if(player.rsp == 1 && this.rsp == 2) 
			System.out.println(player.name + "가 졌습니다.");
		else if(player.rsp == 1 && this.rsp == 3)
			System.out.println(player.name + "가 이겼습니다.");
		else if(player.rsp == 2 && this.rsp == 1)
			System.out.println(player.name + "가 이겼습니다.");
		else if(player.rsp == 2 && this.rsp == 3)
			System.out.println(player.name + "가 졌습니다.");
		else if(player.rsp == 3 && this.rsp == 1)
			System.out.println(player.name + "가 졌습니다.");
		else if(player.rsp == 3 && this.rsp == 2)
			System.out.println(player.name + "가 이겼습니다.");
		
		
		
		
	}
		
}

public class HS_051_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String check = "Y";

		for(;;) {
			System.out.println("1.가위 2.바위 3.보 해당 번호 입력");
			
			int rsp = sc.nextInt();
			
			RSP com = new RSP();
			RSP palyer1 = new RSP("Choi", rsp);
			
			com.printResult(palyer1);
			
			System.out.println("계속 Y :: 중단 N");
			check = sc.next();
			
			if(check.equals("N") || check.equals("n")) {
				System.out.println("프로그램 종료");
				return;
			}
		}
		
	}
}
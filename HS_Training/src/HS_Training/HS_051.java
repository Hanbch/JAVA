// 51.가위바위보
package HS_Training;

import java.util.Scanner;

class RSPPlayer{
	private String name;
	private int rsp;
	
	
	public RSPPlayer(){
		name = "컴퓨터";
		rsp = (int)(Math.random()*3+1);
	}
	
	public RSPPlayer(String name,String str){
		this.name = name;
		if(str.equals("가위"))
			rsp = 1;
		else if(str.equals("바위"))
			rsp = 2;
		else 
			rsp = 3;
	}
	
	private String getRspString(int rsp) {
		String str = "";
		
		if(rsp == 1)
			str = "가위";
		else if(rsp == 2)
			str = "바위";
		else 
			str = "보";
		
		return str;
		
		
	}
	
	public void result(RSPPlayer you) {
		System.out.println(this.name + ":" + getRspString(this.rsp) +" " +
				you.name + ":" + getRspString(you.rsp));
		
		if(this.rsp == you.rsp) {
			System.out.println("비겼습니다.");
			return;
		}
		
		if(this.rsp == 1 && you.rsp == 2) {
			System.out.println(this.name + " 졌습니다.");
		}else if (this.rsp == 1 && you.rsp == 3) {
			System.out.println(this.name + " 이겼습니다.");
		}else if (this.rsp == 2 && you.rsp == 1) {
			System.out.println(this.name + " 이겼습니다.");
		}else if (this.rsp == 2 && you.rsp == 3) {
			System.out.println(this.name + " 졌습니다.");
		}else if (this.rsp == 3 && you.rsp == 1) {
			System.out.println(this.name + " 졌습니다.");
		}else if (this.rsp == 3 && you.rsp == 2) {
			System.out.println(this.name + " 이겼습니다.");
		}
			
		
	}
	
}

public class HS_051 {
	public static void main(String[] args) {
		while(true){
			Scanner sc= new Scanner(System.in);
			System.out.println("입력");
			String rsp = sc.next();
			RSPPlayer com = new RSPPlayer();
			RSPPlayer you = new RSPPlayer("초이",rsp);
			
			com.result(you);
			
			System.out.println("Y::N");
			String check = sc.next();
			if(check.equals("N") || check.equals("n"))
				break;
		}
		System.out.println("프로그램 종료");
	}
}
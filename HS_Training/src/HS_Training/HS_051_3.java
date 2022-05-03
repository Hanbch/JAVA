// 51.가위바위보
package HS_Training;

import java.util.Scanner;

class RSP02{
	String user;
	int rsp;
	
	RSP02(){
		this.user = "com";
		rsp = (int)(Math.random()*3+1);
	}
	
	RSP02(String user, int rsp){
		this.user = user;
		this.rsp = rsp;
	}
	String toString(int rsp) {
		if(rsp == 1)
			return "가위";
		else if (rsp == 2)
			return "바위";
		else
			return "보";
		
	}
	
	void Result(RSP02 you) {
		System.out.println( this.user + ": " + toString(this.rsp) + " "  +  you.user + " :" + toString(you.rsp));
		
		if(this.rsp == you.rsp)
			System.out.println("비겼습니다.");
		
		if(you.rsp == 1 && this.rsp == 2) 
			System.out.println(you.user + "가 졌습니다.");
		else if(you.rsp == 1 && this.rsp == 3)
			System.out.println(you.user + "가 이겼습니다.");
		else if(you.rsp == 2 && this.rsp == 1)
			System.out.println(you.user + "가 이겼습니다.");
		else if(you.rsp == 2 && this.rsp == 3)
			System.out.println(you.user + "가 졌습니다.");
		else if(you.rsp == 3 && this.rsp == 1)
			System.out.println(you.user + "가 졌습니다.");
		else if(you.rsp == 3 && this.rsp == 2)
			System.out.println(you.user + "가 이겼습니다.");
	}
	
}

public class HS_051_3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String check = "Y";
		
		while(check.equals("Y")) {
			System.out.println("1.가위 2.바위  3.보");
			int rsp = sc.nextInt();
			RSP02 com = new RSP02();
			RSP02 choi = new RSP02("choi",rsp);
			com.Result(choi);
			
			System.out.println("Y :: N");
			check = sc.next();
		}
		System.out.println("프로그램 종료");
		
	}
}
package workspace;

import java.util.Scanner;

class Person003{
	String name;
	
	Person003(String name){
		this.name = name;
	}
	
	void Gamble(){
		int[] rNum = new int[3];
		for(int i=0; i<rNum.length; i++) {
			rNum[i] = (int)(Math.random()*3+1);
		}
		System.out.println(name + ":" + rNum[0] + " " + rNum[1] + " " + rNum[2]);
		
		if( rNum[0] == rNum[1] && rNum[1] == rNum[2]) {
			System.out.println(this.name + "win");
			return;
		}else {
			System.out.println("아쉽");
		}
		
	}
	
}


 
public class Practice{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("p1 입력");
		String p1 = sc.next();
		System.out.println("p2 입력");
		String p2 = sc.next();
		
		Person003 pl1 = new Person003(p1); 
		Person003 pl2 = new Person003(p2); 
		
		System.out.println("p1: " + pl1.name);
		System.out.println("p2: " + pl2.name);
		
		while(true) {
			System.out.println("enter");
			String start = sc.nextLine();
			pl1.Gamble();
			
			System.out.println("enter");
			start = sc.nextLine();
			pl2.Gamble();
		}
	}
	
}

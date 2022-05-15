package workspace;

import java.util.Scanner;

class Person003{
	String name;
	
	Person003(String name){
		this.name = name;
	}
}

class Game{
	
	public boolean Gamble(){
		int[] rNum = new int[3];
		
		for(int i=0; i<rNum.length; i++) {
			rNum[i] = (int)(Math.random()*3)+1;
			System.out.print(rNum[i] + " ");
		}
		
		if( rNum[0] == rNum[1] && rNum[1] == rNum[2] )
			return true;
		else 
			return false;
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		System.out.print("p1 입력");
		String pl1 = sc.next();
		System.out.print("p2 입력");
		String pl2 = sc.next();
		
		Person003 p1 = new Person003(pl1);
		Person003 p2 = new Person003(pl2);
		
		System.out.println("p1: " + p1.name);
		System.out.println("p2: " + p2.name);
		String buffer = sc.nextLine();
		while(true) {
			System.out.println(p1.name + "Gamble start (press Enter key)");
			buffer = sc.nextLine();
			
			if(Gamble()) {
				System.out.println(p1.name + " win");
				return;
			}
			else
				System.out.println("아쉽군요");
			
			System.out.println(p2.name + "Gamble start (press Enter key)");
			buffer = sc.nextLine();
			
			if(Gamble()) {
				System.out.println(p2.name + " win");
				return;
			}
			else
				System.out.println("아쉽군요");
		}	
		
	}
	
}

 
public class GambleG{
	
	public static void main(String[] args) {
		
		Game g1 = new Game();
		
		g1.run();
		
	}
	
}

package workspace;

import java.lang.Math;
import java.util.Scanner;

class Game{
	
	String user1, user2;
	
	Game(String user1, String user2){
		this.user1 = user1;
		this.user2 = user2;
	}
	
	int getRandomNum(){
		
		int randomNum = (int)(Math.random()*3)+1;
		return randomNum;
	}
	 
	void run() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번쨰선수 >> " + user1);
		System.out.println("두번쨰선수 >> " + user2);
		
		while(true) {
			System.out.println(user1 + " Enter");
			String start = sc.nextLine();
			int a,b,c;
			
			a = getRandomNum();
			b = getRandomNum();
			c = getRandomNum();
			System.out.println(a + " " + b + " " + c);
			
			if(a == b && b == c ) {
				System.out.println(user1 + "님이" + "이겼습니다.");
				return;
			}else {
				System.out.println("아쉽군요");
				System.out.println();
			}
			
			System.out.println(user2 + " Enter");
			start = sc.nextLine();
			a = getRandomNum();
			b = getRandomNum();
			c = getRandomNum();
			System.out.println(a + " " + b + " " + c);
			
			if(a == b && b == c ) {
				System.out.println(user2 + "님이" + "이겼습니다.");
				return;
			}else {
				System.out.println("아쉽군요");
				System.out.println();
			}
		}
		
	}
	
	
	
}

public class GamblingGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String user1, user2;
		
		System.out.println("user1 입력");
		user1 = sc.next();
		System.out.println("user2 입력");
		user2 = sc.next();
			
		Game g1 = new Game(user1,user2);
		g1.run();
	}

}

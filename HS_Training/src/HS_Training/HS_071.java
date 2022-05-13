package HS_Training;
/* 71.
 갬블링 게임을 만들어보자. 두 사람이 게임을 진행한다. 
이들의 이름을 키보드로 입력받으며 각 사람은 Person 클래스로 작성하라. 
그러므로 프로그램에는 2개의 Person 객체가 생성되어야 한다. 
두 사람은 번갈아 가면서 게임을 진행하는데 
각 사람이 자기 차례에서 <Enter> 키를 입력하면, 
3개의 난수가 발생되고 이 숫자가 모두 같으면 승자가 되고 게임이 끝난다.
 난수의 범위를 너무 크게 잡으면 3개의 숫자가 일치하게 나올 가능성이 
적기 때문에 숫자의 범위는 1~3까지로 한다."
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
		
		System.out.println("player1은 " + player1.getName());
		System.out.println("player2은 " + player2.getName());
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
				System.out.println(player1.getName() + "님이 이겼습니다." + "\n");
				return;
			}else {
				System.out.println("아쉽군요!" + "\n");
			}
			
			System.out.println(player2.getName() + " Enter");
			
			start = sc.nextLine();
			num1 = (int)(Math.random()*3+1);
			num2 = (int)(Math.random()*3+1);
			num3 = (int)(Math.random()*3+1);
			System.out.println(num1 + "" + num2 + "" + num3);
			
			if(num1 == num2 && num2 == num3) {
				System.out.println(player2.getName() + "님이 이겼습니다." + "\n");
				return;
			}else {
				System.out.println("아쉽군요!" + "\n");
			}
		}
	}
	
}

public class HS_071{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("player1 이름을 입력해주세요.");
		String p1 = sc.next();
		System.out.println("player2 이름을 입력해주세요.");
		String p2 = sc.next();
		System.out.println();
		
		GambleGame game = new GambleGame();
		game.run(p1, p2);
		
	}
}
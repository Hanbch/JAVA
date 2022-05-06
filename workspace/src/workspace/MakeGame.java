package workspace;

import java.util.Scanner;

interface IGame{
	
	public void run(int getStart);
	
}

class UpDownGame implements IGame{
	
	public void run(int getStart) {
		Scanner sc = new Scanner(System.in);
		int targetNum = (int)(Math.random()*100)+1;
		int userNum;
		int[] inputArr = new int[10];
		int count = 1;
		boolean check = true;
		
		if(getStart == 1) {
			System.out.println("1~100의 숫자를 입력해주세요.");
			userNum = sc.nextInt();
			
			while(true) {
				if(targetNum > userNum) {
					System.out.println("UP");
					System.out.println("남은 기회 : " + (10 - count++));
					userNum = sc.nextInt();
				}else if(targetNum < userNum) {
					System.out.println("DOWN");
					System.out.println("남은 기회 : " + (10 - count++));
					userNum = sc.nextInt();
				}else {
					System.out.println(count + "번 만에 정답!!");
					return;
				}
				
				if(count == 10) {
					System.out.println("GameOver");
					return;
				}
			}
		}else if(getStart == 2) {
			System.out.println("게임 종료");
		}else {
			System.out.println("잘못입력하셨습니다." + "\n" + "1. 게임시작 " + "\n" + "2. 게임종료 ");
		}
		
		
	}
	
}

class RSPGame implements IGame{
	
	public void run(int getStart) {
		
		while(getStart == 1) {
			System.out.println("가위 바위 보 선택");
			Scanner sc  = new Scanner(System.in);
				
			String[] Random = {"가위","바위","보"};
			String me = sc.next();
			String com =Random[(int)(Math.random()*3)];
			
			
			if(me.equals("가위")){
					
					switch(com) {
						case ("가위"): 
							System.out.println("com은 "+ com);
							System.out.println("나는"+ me);
							System.out.println("비겼습니다.");
						break;
						
						case ("바위"): 
							System.out.println("com은 "+ com);
							System.out.println("나는"+ me);
							System.out.println("졌습니다.");
						break;
						
						case ("보"): 
							System.out.println("com은 "+ com);
							System.out.println("나는"+ me);
							System.out.println("이겼습니다.");
						break;
					}
			}
			
			else if(me.equals("바위")) {
				switch(com) {
					case ("가위"): 
						System.out.println("com은 "+ com);
						System.out.println("나는"+ me);
						System.out.println("이겼습니다.");
					break;
					
					case ("바위"): 
						System.out.println("com은 "+ com);
						System.out.println("나는"+ me);
						System.out.println("비겼습니다.");
					break;
					
					case ("보"): 
						System.out.println("com은 "+ com);
						System.out.println("나는"+ me);
						System.out.println("졌겼습니다.");
					break;
				}
			}
			
			else if(me.equals("보")) {
				switch(com) {
					case ("가위"): 
						System.out.println("com은 "+ com);
						System.out.println("나는"+ me);
						System.out.println("졌습니다.");
					break;
					
					case ("바위"): 
						System.out.println("com은 "+ com);
					System.out.println("나는"+ me);
						System.out.println("이겼습니다.");
					break;
					
					case ("보"): 
						System.out.println("com은 "+ com);
					System.out.println("나는"+ me);
						System.out.println("비겼습니다.");
					break;
				}
	
			}
			
			else {
				System.out.println("잘못 입력하셨습니다. 가위, 바위, 보  중 하나를 입력하세요");			
			}
			System.out.println("1.게임시작"+ "\n" + "2.게임 종료");
			getStart = sc.nextInt();
		} 
		
		System.out.println("게임 종료");
		return;
		
	}
	
}

public class MakeGame {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int getStart = 1;
		
		while(getStart == 1) {
			System.out.println("1.게임시작"+ "\n" + "2.게임 종료");
			getStart = sc.nextInt();
			
			IGame g1 = new UpDownGame();
			//g1.run(getStart);
			
			IGame g2 = new RSPGame();
			g2.run(getStart);
		}
		
	}

}

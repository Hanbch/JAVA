package workspace;

import java.util.Scanner;

class UpDown {
	int targetNum =(int) (Math.random()*100+1);
	int userNum;
	boolean check = true;

	UpDown() {}

	void checkNum(){
		int count = 0;
		
		while(check) {
			
			Scanner sc = new Scanner(System.in);
			
			count++;
			
			System.out.println("숫자를 입력해주세요.");
			userNum = sc.nextInt();
			
			if(userNum <=100 && userNum > 0) {
				if(userNum < targetNum) {
					System.out.println("up");
				}else if(userNum > targetNum) {
					System.out.println("down");
				}else if (userNum == targetNum) {
					System.out.println("정답입니다."+ count + "번만에 맞춰습니다.");
					check = false;
				}
			}else {
				System.out.print("1~100사이의 ");
				count--;
			}
			
		}
		
	}

}

public class GuessNum2 {

	public static void main(String[] args) {
		
		UpDown ud = new UpDown();
		ud.checkNum();
	}
}
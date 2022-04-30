package workspace;

import java.lang.Math;
import java.util.Scanner;

public class GuessNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int targetNum = (int)(Math.random()*100+1);
		int count = 0;
		boolean check =true;
		
		System.out.println("1~100 사이 숫자 입력");
		int userNum = sc.nextInt();
		for(;;) {
			count++;
			if(check) {
				if( targetNum > userNum) {
					System.out.println("up");
					userNum = sc.nextInt();
				}else if(targetNum < userNum) {
					System.out.println("down");
					userNum = sc.nextInt();
				}else if(targetNum == userNum){
					System.out.println("정답!!"+count+"번만에 맟춤");
					check = false;
				}
			}else {
				return;
			}
		}
	
	}

}

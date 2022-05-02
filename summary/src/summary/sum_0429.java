package summary;

import java.util.Scanner;

public class sum_0429{
	public static void main(String[] args) {
/*

1.아래의 메모리 그림을 그리시오.
 2차원 배열int[][] arr = new int[3][3]
 
 ai파일 참고

2. 아래를 프로그래밍 하시오.(화폐 매수)

돈을 입력하세요
12900
오만원 : 0장
만원 : 1장
오천원 : 0장
천원 : 2장
오백원 : 1개
백원 : 4개
계속 Y :: 중단 N

3. 가위바위보 게임 

아래를 프로그래밍 하시오.
==============================================
가위 바위 보를 입력하세요.
가위
나는:가위 당신은:가위
비겼습니다
계속 Y :: 중단 N
y
가위 바위 보를 입력하세요.
보
나는:가위 당신은:보
제가 졌습니다.
계속 Y :: 중단 N
n
안녕히 가세요

4. 아래를 프로그래밍 하시오.

다음 코드와 같이 과목과 점수가 짝을 이루도록 2개의 배열을 작성하라.

String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
int score[]  = {95, 88, 76, 62, 55};
그리고 다음 예시와 같이 과목 이름을 입력받아 점수를 출력하는 프로그램을 작성하라. "그만"을 입력받으면 종료한다. (Java는 인덱스 0에 있으므로 score[0]을 출력)

과목 이름 >> Jaba
없는 과목입니다.
과목 이름 >> Java
Java의 점수는 95
과목 이름 >> 안드로이드
안드로이드의 점수는 55
과목 이름 >> 그만

5. 업앤다운 UP&Down 숫자맞추기 게임

컴퓨터가 1~100 숫자(정수 범위) 중 하나를 랜덤으로 정합니다. (이를 알려주지 않습니다.)
사용자는 이 숫자를 맞추어야 합니다.
입력한 숫자보다 정답이 크면 → "UP" 출력,
입력한 숫자보다 정답이 작으면 → "DOWN" 출력.
정답을 맞추면 → "정답"을 출력하고, 지금까지 숫자를 입력한 횟수를 알려줍니다.

(예시)
컴퓨터가 1~100 중 랜덤 숫자 하나를 정합니다.
이 숫자를 맞춰주세요.
1~100 숫자 입력:50
DOWN
1~100 숫자 입력:25
UP
1~100 숫자 입력:38
DOWN
1~100 숫자 입력:32
UP
1~100 숫자 입력:35
UP
1~100 숫자 입력:37
DOWN
1~100 숫자 입력:36
정답입니다! 7회 만에 맞췄어요.

*/
//2번문제
		Scanner sc = new Scanner(System.in);
		String yn = "Y";
		
		for(;;) {
			if(yn.equals("Y") || yn.equals("y") ) {
			
				System.out.println("금액을 입력하시오.");
				int price = sc.nextInt();
				
				CalMoney mon = new CalMoney(price);
				
				mon.showMoney();
				
				System.out.println("계속:Y :: 종료: N");
				
				yn = sc.next();
			 }else if(yn.equals("N") || yn.equals("n") ) {
				 System.out.println("프로그램이 종료됩니다.");
				 return;
			 }else {
				 System.out.println("잘못입력 하셨습니다. Y나 N 중 하나를 입력해주세요.");
				 yn = sc.next();
			 }
		 }
		
		
//3번문제
	
//		for(;;) {
//			System.out.println("가위 바위 보 선택");
//			
//				
//				String[] Random = {"가위","바위","보"};
//				String me = sc.next();
//				String com =Random[(int)(Math.random()*3)];
//				
//				
//					if(me.equals("가위")){
//							
//							switch(com) {
//								case ("가위"): 
//									System.out.println("com은 "+ com);
//									System.out.println("나는"+ me);
//									System.out.println("비겼습니다.");
//								break;
//								
//								case ("바위"): 
//									System.out.println("com은 "+ com);
//									System.out.println("나는"+ me);
//									System.out.println("졌습니다.");
//								break;
//								
//								case ("보"): 
//									System.out.println("com은 "+ com);
//									System.out.println("나는"+ me);
//									System.out.println("이겼습니다.");
//								break;
//							}
//					}
//					
//					else if(me.equals("바위")) {
//						switch(com) {
//							case ("가위"): 
//								System.out.println("com은 "+ com);
//								System.out.println("나는"+ me);
//								System.out.println("이겼습니다.");
//							break;
//							
//							case ("바위"): 
//								System.out.println("com은 "+ com);
//								System.out.println("나는"+ me);
//								System.out.println("비겼습니다.");
//							break;
//							
//							case ("보"): 
//								System.out.println("com은 "+ com);
//								System.out.println("나는"+ me);
//								System.out.println("졌겼습니다.");
//							break;
//						}
//					}
//					
//					else if(me.equals("보")) {
//						switch(com) {
//							case ("가위"): 
//								System.out.println("com은 "+ com);
//								System.out.println("나는"+ me);
//								System.out.println("졌습니다.");
//							break;
//							
//							case ("바위"): 
//								System.out.println("com은 "+ com);
//							System.out.println("나는"+ me);
//								System.out.println("이겼습니다.");
//							break;
//							
//							case ("보"): 
//								System.out.println("com은 "+ com);
//							System.out.println("나는"+ me);
//								System.out.println("비겼습니다.");
//							break;
//						}
//			
//					}
//					
//					else {
//						System.out.println("잘못 입력하셨습니다. 가위, 바위, 보  중 하나를 입력하세요");			
//					}
//			}
		
		
//4번문제
//			String[] course = new String[5];
//			int[] score = new int[5];
//			
//			course[0] = "Java";
//			course[1] = "C++";
//			course[2] = "HTML5";
//			course[3] = "컴퓨터구조";
//			course[4] = "안드로이드";
//			
//			score[0] = 95;
//			score[1] = 88;
//			score[2] = 76;
//			score[3] = 62;
//			score[4] = 55;
//	
//		
//			System.out.print("과목 이름 입력: ");
//			String courseName = sc.next();
//			int scoreNum = 0;
//	
//			for(;;) {
//				boolean check = false;
//			
//				for(int i =0; i<course.length; i++) {
//				
//					if(courseName.equals(course[i])) {
//						scoreNum = score[i];
//						check = true;
//					}
//				}
//				
//				if(check) {
//					System.out.println("과목이름: " + courseName);
//					System.out.println(courseName + "의 점수는 " + scoreNum);
//					System.out.println("과목 이름 입력: ");
//					courseName = sc.next();
//				}else {
//					System.out.println("다시입력");
//					courseName = sc.next();
//				}
//				
//				if(courseName.equals("그만")) {
//					return;
//				}
//			}
		
//5번문제
//		int targetNum = (int)(Math.random()*100+1);
//		int count = 0;
//		boolean check =true;
//		
//		System.out.println("1~100 사이 숫자 입력");
//		int userNum = sc.nextInt();
//		for(;;) {
//			count++;
//			if(check) {
//				if( targetNum > userNum) {
//					System.out.println("up");
//					userNum = sc.nextInt();
//				}else if(targetNum < userNum) {
//					System.out.println("down");
//					userNum = sc.nextInt();
//				}else if(targetNum == userNum){
//					System.out.println("정답!!"+count+"번만에 맟춤");
//					check = false;
//				}
//			}else {
//				return;
//			}
//		}

	}
	
}

class CalMoney{
	 int won1;
	 int won2;
	 int won3;
	 int won4;
	 int won5;
	
	int price;
	
CalMoney(int price){this.price = price;}
	
	int[] getMoney(){
		won1 = price/50000;
		won2 = (price%50000)/10000;
		won3 = (price%10000)/5000;
		won4 = (price%5000)/1000;
		won5 = (price%1000)/500;
		
		int[] countArr = {won1, won2, won3, won4, won5};
		return countArr;
	}
	
	void showMoney(){
		System.out.println("오만원: "+ getMoney()[0] +"장");
		System.out.println("일만원: "+ getMoney()[1] +"장");
		System.out.println("오천원: "+ getMoney()[2] +"장");
		System.out.println("일천원: "+ getMoney()[3] +"장");
		System.out.println("오백원: "+ getMoney()[4] +"장");
	}
}
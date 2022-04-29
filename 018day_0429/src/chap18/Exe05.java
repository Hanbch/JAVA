package chap18;
/*"다음 코드와 같이 과목과 점수가 짝을 이루도록 2개의 배열을 작성하라.

String course[] = {""Java"", ""C++"", ""HTML5"", ""컴퓨터구조"", ""안드로이드""};
int score[]  = {95, 88, 76, 62, 55};
그리고 다음 예시와 같이 과목 이름을 입력받아 점수를 출력하는 프로그램을 작성하라. ""그만""을 입력받으면 종료한다. (Java는 인덱스 0에 있으므로 score[0]을 출력)

과목 이름 >> Jaba
없는 과목입니다.
과목 이름 >> Java
Java의 점수는 95
과목 이름 >> 안드로이드
안드로이드의 점수는 55
과목 이름 >> 그만"
*/


import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		
		String[] course = new String[5];
		int[] score = new int[5];
		
		course[0] = "Java";
		course[1] = "C++";
		course[2] = "HTML5";
		course[3] = "컴퓨터구조";
		course[4] = "안드로이드";
		
		score[0] = 95;
		score[1] = 88;
		score[2] = 76;
		score[3] = 62;
		score[4] = 55;
		
		Scanner sc = new Scanner(System.in);
		
			System.out.print("과목 이름 입력: ");
			String courseName = sc.next();
			int scoreNum = 0;
	
			for(;;) {
				boolean check = false;
			
				for(int i =0; i<course.length; i++) {
				
					if(courseName.equals(course[i])) {
						scoreNum = score[i];
						check = true;
					}
				}
				
				if(check) {
					System.out.println("과목이름: " + courseName);
					System.out.println(courseName + "의 점수는 " + scoreNum);
					System.out.println("과목 이름 입력: ");
					courseName = sc.next();
				}else {
					System.out.println("다시입력");
					courseName = sc.next();
				}
				
				if(courseName.equals("그만")) {
					return;
				}
			}
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
	}

}

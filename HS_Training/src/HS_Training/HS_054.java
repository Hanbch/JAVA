// 54.
/*"다음 코드와 같이 과목과 점수가 짝을 이루도록 2개의 배열을 작성하라.

String course[] = {""Java"", ""C++"", ""HTML5"", ""컴퓨터구조"", ""안드로이드""};
int score[]  = {95, 88, 76, 62, 55};
그리고 다음 예시와 같이 과목 이름을 입력받아 점수를 출력하는 프로그램을 
작성하라. ""그만""을 입력받으면 종료한다.
 (Java는 인덱스 0에 있으므로 score[0]을 출력)

과목 이름 >> Jaba
없는 과목입니다.
과목 이름 >> Java
Java의 점수는 95
과목 이름 >> 안드로이드
안드로이드의 점수는 55
과목 이름 >> 그만"

*/

package HS_Training;

import java.util.Scanner;

class ShowInfo{
	private String[] courseArr = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
	private  int[] scoreArr = {95, 100, 80, 70, 50};
	private String course;
	private String check;
	
	
	
	
	ShowInfo(String course) {this.course = course;}
	
	public void printInfo(){
		Scanner sc = new Scanner(System.in);
		for(;;) {
			boolean YN = false;
			
			for(int i=0; i<scoreArr.length; i++) {
				
				if(course.equals(courseArr[i])) {
					System.out.println("과목이름: " + course);
					System.out.println(course + "의 점수는: " + scoreArr[i]);
					YN=true;
					
				}
	
			}
			if(YN == false) {
				System.out.println("잘못입력 다시 입력");
				course =sc.next();
				continue;
			}	
			
			System.out.println("계속Y :: 그만N");
			check =sc.next();
			
			if(check.equals("N") || check.equals("n")) {
				System.out.println("프로그램 종료");
				return;
			}
			System.out.println("과목명 입력");
			course =sc.next();
		}	
		
		
	}
	
	
	
}

public class HS_054 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("과목명 입력");
			String course = sc.next();
			ShowInfo hb = new ShowInfo(course);
			
			hb.printInfo();
			
			
		
		
		
		
	}
}
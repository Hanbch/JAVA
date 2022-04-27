package chap16;

import java.util.Scanner;

class Grade{
	private int kor;
	private int math;
	private int eng;
	
	public Grade() {}
	public Grade(int kor, int math, int eng) {
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	public int getTotal() {
		return kor+math+eng;
	}
	
	public double getAvg() {
		return getTotal()/3.0;
	}
	
	public String getGrade() {
		double avg = getAvg();
		String grade;
		if( avg >= 90 ) {
			grade = "수";
		}else if(avg >= 80 ) {
			grade = "우";
		}else if(avg >= 70 ) {
			grade = "미";
		}else if(avg >= 60 ) {
			grade = "양";
		}else {
			grade = "가";
		}
		return grade;
	}
	
	
	
}

public class Example02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하시오.");
		String name = sc.next();
		
		System.out.println("국어성적을 입력해주세요.");
		int kor = sc.nextInt();
		
		System.out.println("수학성적을 입력해주세요.");
		int math = sc.nextInt();
		
		System.out.println("영어성적을 입력해주세요.");
		int eng = sc.nextInt();
		
		Grade grade = new Grade(kor, math, eng);
		
		System.out.println(name+ "학생의"+ '\n' +"성적은 총점:" + grade.getTotal() + " " + "평균: " + grade.getAvg() + "\n" + grade.getGrade() + "입니다.");
		
	}
	
}
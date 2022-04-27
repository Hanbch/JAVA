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
			grade = "��";
		}else if(avg >= 80 ) {
			grade = "��";
		}else if(avg >= 70 ) {
			grade = "��";
		}else if(avg >= 60 ) {
			grade = "��";
		}else {
			grade = "��";
		}
		return grade;
	}
	
	
	
}

public class Example02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��Ͻÿ�.");
		String name = sc.next();
		
		System.out.println("������� �Է����ּ���.");
		int kor = sc.nextInt();
		
		System.out.println("���м����� �Է����ּ���.");
		int math = sc.nextInt();
		
		System.out.println("������� �Է����ּ���.");
		int eng = sc.nextInt();
		
		Grade grade = new Grade(kor, math, eng);
		
		System.out.println(name+ "�л���"+ '\n' +"������ ����:" + grade.getTotal() + " " + "���: " + grade.getAvg() + "\n" + grade.getGrade() + "�Դϴ�.");
		
	}
	
}
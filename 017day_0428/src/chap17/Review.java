package chap17;

import java.util.Scanner;

class Circle{
	private int rad;
	
	public static double getCirArea02(int rad){
		return rad*rad*Math.PI;
	}
	
	public void getCirArea(){
		Scanner sc = new Scanner(System.in);
		String yn = "Y";
		
//		for(;;) {
//			if(yn.equals("Y") || yn.equals("y")) {
//				System.out.println("�������� �Է����ּ���.");
//				int rad = sc.nextInt();
//				System.out.println("������: " + rad);
//				System.out.println("���̴�: " + Circle.getCirArea02(rad));
//				System.out.println("��� Y :: �ߴ� N");
//				yn = sc.next();
//			}else if( yn.equals("N") || yn.equals("n")){
//				System.out.println("���α׷��� ����Ǿ����ϴ�.");
//				return;
//			}else {
//				System.out.println("�߸��� ���� �Է��߽��ϴ�. Y(yes) �� N(no) �� �ϳ��� �Է��Ͻÿ�. " );
//				yn = sc.next();
//			}
//		}
		
		for(;;) {
			if(yn.equals("Y") || yn.equals("y")) {
				System.out.println("�������� �Է����ּ���.");
				rad = sc.nextInt();
				System.out.println("������: " + rad );
				System.out.println("���̴�: " + getCirArea02(rad) );
				System.out.println("��� Y :: �ߴ� N");
				yn = sc.next();
			}else if(yn.equals("N") || yn.equals("n")) {
				System.out.println("���α׷� �����մϴ�.");
				return;
			}else {
				System.out.println("�߸��� ���� �Է��߽��ϴ�. Y(yes) �� N(no) �� �ϳ��� �Է��Ͻÿ�. " );
				yn = sc.next();
			}
		}
		
	}
}

class Rectangle{
	int width, height;
	
	public Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public static int getRecArea(int width, int height){
		return width*height;
	}
}

class Grade{
	
	public static String getGrade(int kor, int math, int eng) {
		int total = kor+math+eng;
		double avg = total/3.0;
		 String grade;
		 
		 if(avg >= 90) {
			 grade = "�� �Դϴ�.";
		 }else if(avg >= 80) {
			 grade = "�� �Դϴ�.";
		 }else if(avg >= 70) {
			 grade = "�� �Դϴ�.";
		 }else if(avg >= 60) {
			 grade = "�� �Դϴ�.";
		 }else {
			 grade = "�� �Դϴ�.";
		 }
		 System.out.println("����: "+total);
		 System.out.println("���: "+avg);
		 System.out.println("����: "+grade);
		 return grade;
		
	}
}

public class Review {

	public static void main(String[] args) {
		//"Rectangle Ŭ���� �ۼ� int �� �ΰ� �Է�  ���� ���� �Է� �ϼ���. ���̸� ���Ͻÿ�."
		System.out.println(Rectangle.getRecArea(100,20));
		
		/*�Ʒ��� ��ĳ�ʷ� �Է� �޾� Grade  Ŭ������ ����� ������� ���ÿ�.
		���� :80
		���� :70
		���� :80

		������ ����: 0000 ��� ----- 
		���Դϴ�."
		*/
		Grade.getGrade(90,100,80);
		
		//"int ���� �ϳ� �Է� �޾� ���� ���̸� ���ϴ� ���α׷��� ¥�ÿ�. 
		//�� Circle �� ��ü�� �����. "
		//double CirArea = Circle.getCirArea(10);	
		//System.out.println(CirArea);
		
		/*
		39�� Ŭ������ �̿��Ͽ� �Ʒ��� ���α׷��� �Ͻÿ�.
		=================================================
		������:90
		���̴�25446.900494077323
		��� Y :: �ߴ� N
		y
		������:80
		���̴�20106.192982974677
		��� Y :: �ߴ� N
		n
		���α׷��� ���� �Ǿ����ϴ�.
		*/
		Circle cir = new Circle();
		cir.getCirArea();
		
		
	}

}

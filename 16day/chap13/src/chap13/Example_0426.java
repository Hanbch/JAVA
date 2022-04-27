package chap13;

import java.util.Scanner;

class Circle{
	private static int rad;
	final static double PI = 3.14;
	
	public Circle(int rad) {
		this.rad = rad;
	}
	
	public static double getCirArea(int rad) {
		
		return rad*rad*PI;
	}
	
}

class Rectangle{
	
	public static double getRec(int width,int height) {
		return width*height;
	}
}

public class Example_0426 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������� �Է��Ͻÿ�.");
		int rad = sc.nextInt();
		
		System.out.println(Circle.getCirArea(rad));
	
		System.out.println("������ �Է��Ͻÿ�.");
		int width = sc.nextInt();
		
		System.out.println("���̸��� �Է��Ͻÿ�.");
		int height = sc.nextInt();
		
		System.out.println(Rectangle.getRec(width,height));
		
	}
	
}
package chap06;

public class Review {
	
	public static double getCirArea(int radius) {
		final double PI = 3.14;
		return PI*radius*radius;
	}
	
	public static int getRecArea(int width, int height) {
		
		int recArea = width*height;
		return recArea;
	}
	
	public static void StarTower(int num) {
		for(int i=0; i<num; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
		
		System.out.print('\n');
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		//�������� �޾Ƽ� ���� ���̸� �����ϴ� �Լ��� ����ÿ�."
		int radius = 10;
		
		double rst = getCirArea(radius);
		System.out.println(rst);
		
		//���� ���θ� �޾Ƽ� �簢���� ���̸� �����ϴ� �Լ��� ����ÿ�.
		int width = 10;
		int height = 20;
		
		System.out.println(getRecArea(width, height));
		
		//"�Ʒ��� �Լ��� ¥�ÿ�. 5 �̸� 5�� ��ž 6�̸� 6�� ��ž
		//*
		//**
		//***
		//****
		//*****
		int num = 5;
		StarTower(num);
	
		
	}

}
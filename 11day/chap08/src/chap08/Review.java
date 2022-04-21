package chap08;

class Human{
	int eye;
	
	public void setEye(int num) {
		this.eye = num;
	}
}

class Grade{
	int kor;
	int math;
	int eng;
	
	void initSub (int kor, int math, int eng) {
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		
	}
	
	public int getTotal(){
		return kor + math + eng;
		
	}
	public double getAvr() {
		return  getTotal() /3.0;
	}
	
	String getGrade() {
		String grade;
		double avg = getAvr();
		
		if( avg >= 90) {
			grade ="��";
		}else if (avg >=80 ) {
			grade ="��";
		}else if (avg >=70 ) {
			grade ="��";
		}else if (avg >=60 ) {
			grade ="��";
		}else {
			grade ="��";
		}
		return grade;
	}
	
}

public class Review {
	
	public static int adding(int num) {
		int sum = 0;
		for (int i=1; i<=num; i++) {
			sum += i;
		}
		return sum;
		
	}
	
	public static void makeGooGooDan(int dan) {
		for(int i=1; i<dan; i++) {
			System.out.println(dan + "x"+ i + "=" + dan*i);
		}
	}
	
	public static void printStar(int num) {
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-i; j++) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
	}
	
	
	
	public static void main(String[] args) {
		// �ϳ��� ������  �޾Ƽ� �ش� 1 ���� �ش����� ������ ���� ���� �ϴ� �Լ�
		int rst = adding(10);
		System.out.println(rst);
		
		//�ϳ��� ������  �޾Ƽ� �ش� ������ ������ ���
		int dan = 9;
		makeGooGooDan(dan);
		
		//"�Ʒ��� �Լ��� ¥�ÿ�. 5 �̸� 5�� ��ž 6�̸� 6�� ��ž
		//*
		//**
		//***
		//****
		//*****
		int num =5;
		printStar(num);
		
		//"Human eye   ���� ���� ��  set  �Լ� ����� set   �Լ���  2�� ����ְ� eye  ��� �Ͻÿ�"
		
		Human hm = new Human();
		hm.setEye(2);
		System.out.println(hm.eye);
		
		Grade gr = new Grade();
		
		gr.initSub(90, 70, 80);
		
		System.out.println(gr.getTotal());
		System.out.println(gr.getAvr());
		System.out.println(gr.getGrade());
		
		
	}

}
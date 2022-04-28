package chap17;

import java.util.Arrays;
import java.util.Scanner;

class Rectang{
	private int width;
	private int height;
	
	Rectang(int width, int height){
		this.width = width;
		this.height = height;
	}
	Rectang(int[] arr){
		this.width = arr[0];
		this.height = arr[1];
	}
	
	int getRecArea(){
		return width*height;
	}
	
}

public class Exe02 {
	
	static int sumAllArea(Rectang[] rec) {
		int sumAll = 0;
		
		for(int i =0; i<rec.length; i++) {
			sumAll += rec[i].getRecArea();
		}
		
		return sumAll;
	}
	
	public static void main(String[] args ) {
		//"Rectangle �� �迭�� 3�� ����

		// �ش� ��ü�� �ε��� ������� ���� ���� ���� - 
		// �̹����� �ݵ�� scanner �� �Է� ������
		
		// �ش� �迭�� �ִ� Rectangle �� �ѳ����� ���� ���Ͻÿ�."
		
		Rectang[] rec = new Rectang[3];
		
		rec[0] = new Rectang(5,10);
		rec[1] = new Rectang(5,10);
		rec[2] = new Rectang(5,10);
		
		System.out.println(sumAllArea(rec));
		System.out.println();
		
		
		//"1. int �迭 5�� ����
		//2. ���� ��� 0 1 2 3 4 �Է�
		//3. �迭 ���� ��� ���"
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++ ) {
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		//"Rectangle �� �迭�� 3�� ����

		//�ش� ��ü�� �ε��� ������� ���� ���� ���� - 
		//�̹����� �ݵ�� scanner �� �Է� ������
		
		//�ش� �迭�� �ִ� Rectangle �� �ѳ����� ���� ���Ͻÿ�."
		Scanner sc = new Scanner(System.in);
		Rectang[] rec2 = new Rectang[3];
		
		System.out.println("ù��°�� �����Ǳ��̸� �Է��Ͻÿ�.");
		int width1 = sc.nextInt();
		
		System.out.println("ù��°�� ���̸� �Է��Ͻÿ�.");
		int height1 = sc.nextInt();
		
		rec2[0] = new Rectang(width1,height1);
		
		System.out.println("�ι�°�� �����Ǳ��̸� �Է��Ͻÿ�.");
		int width2 = sc.nextInt();
		System.out.println("�ι�°�� ���̸� �Է��Ͻÿ�.");
		int height2 = sc.nextInt();
		rec2[1] = new Rectang(width2, height2);
		
		System.out.println("����°�� �����Ǳ��̸� �Է��Ͻÿ�.");
		int width3 = sc.nextInt();
		System.out.println("����°�� ���̸� �Է��Ͻÿ�.");
		int height3 = sc.nextInt();
		rec2[2] = new Rectang(width3,height3);
		
		System.out.println("������ ��:" + sumAllArea(rec2));
		
		
		//�ζ� ��ȣ6���� ��� -�ߺ�����
		
		//"���� �Է��ϼ���
		//12900
		//������ : 0��
		//���� : 1��
		//��õ�� : 0��
		//õ�� : 2��
		//����� : 1��
		//��� : 4��
		//��� Y :: �ߴ� N"
		String yn = "Y";
		
		for(;;) {
			if(yn.equals("Y") || yn.equals("y") ) {
			
				System.out.println("�ݾ��� �Է��Ͻÿ�.");
				int price = sc.nextInt();
				
				CalMoney mon = new CalMoney(price);
				
				mon.showMoney();
				
				System.out.println("���:Y :: ����: N");
				
				yn = sc.next();
			 }else if(yn.equals("N") || yn.equals("n") ) {
				 System.out.println("���α׷��� ����˴ϴ�.");
				 return;
			 }else {
				 System.out.println("�߸��Է� �ϼ̽��ϴ�. Y�� N �� �ϳ��� �Է����ּ���.");
				 yn = sc.next();
			 }
		 }
	
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
		System.out.println("������: "+ getMoney()[0] +"��");
		System.out.println("�ϸ���: "+ getMoney()[1] +"��");
		System.out.println("��õ��: "+ getMoney()[2] +"��");
		System.out.println("��õ��: "+ getMoney()[3] +"��");
		System.out.println("�����: "+ getMoney()[4] +"��");
	}
}

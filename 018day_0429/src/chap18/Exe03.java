package chap18;
//���� ������ 10�� �Է� �޾� �迭�� �����ϰ� 
//�հ� ����� ���Ͽ���.

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("�����Է�");
			arr[i] = (int)(Math.random()*10)+1;
	}
		int sum =0;
		
		for(int num:arr) {
			sum += num;
		}
		System.out.println("��: "+ sum);
		
		double avr = (double)sum/arr.length;
		System.out.println("���: "+ avr);
	}

}

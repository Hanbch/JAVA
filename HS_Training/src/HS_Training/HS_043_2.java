// 49."���� �Է��ϼ���
//12900
//������ : 0��
//���� : 1��
//��õ�� : 0��
//õ�� : 2��
//����� : 1��
//��� : 4��
//��� Y :: �ߴ� N"

package HS_Training;

import java.util.Scanner;

class CalcMoney01{
	
	CalcMoney01(){};
	
	void getMoney(){
		Scanner sc = new Scanner(System.in);
		String check = "Y";
		
		while(check.equals("Y") || check.equals("y")) {
			System.out.println("�ݾ��� �Է�");
			int[] won = new int[6];
			int price = sc.nextInt();
			
			
			won[0] = price/50000;
			won[1]  = (price%50000)/10000;
			won[2]  = (price%10000)/5000;
			won[3]  = (price%5000)/1000;
			won[4]  = (price%1000)/500;
			won[5]  = (price%500)/100;
			
			
			
			System.out.println("������: "+ won[0]);		
			System.out.println("�ϸ���: "+ won[1]);		
			System.out.println("��õ��: "+ won[2]);		
			System.out.println("��õ��: "+ won[3]);		
			System.out.println("�����: "+ won[4]);		
			System.out.println("���: "+ won[5]);		
			System.out.println("���: Y :: �ߴ�: N");
			check = sc.next();
		}
		System.out.println("���α׷� ����");
	}
}

public class HS_043_2 {
	public static void main(String[] args) {
		CalcMoney01 m1 = new CalcMoney01();
		
		m1.getMoney();
		
	}
}
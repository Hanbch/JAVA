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

class CalcMoney{
	
	CalcMoney(){};
	
	void getMoney(){
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("�ݾ��� �Է�");
		int[] won = {50000,10000,5000,1000,500,100,50,10};
		int[] count = new int[8];
		int price = sc.nextInt();
		
		for(int i=0; i< won.length; i++) {
			count[i] = price/won[i];
			price = price%won[i];
		}
			
		for(int e:count) {
			System.out.println(e);
		}
			
			
			
			
	}
}

public class HS_043 {
	public static void main(String[] args) {
		CalcMoney m1 = new CalcMoney();
		
		m1.getMoney();
		
	}
}
package chap18;
//���� ������ 10�� �Է� �޾� �迭�� �����ϰ� 
//�迭�� �ִ� ���� �߿��� 3�� ����� ����ϴ� ���α׷��� �ۼ��϶�.

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("�����Է�");
			arr[i] = sc.nextInt();
	}
		
		for(int i =0; i <arr.length; i++) {
			if(arr[i]%3 == 0) {
				System.out.println(arr[i]);
			}
		}
		
		
	}

}

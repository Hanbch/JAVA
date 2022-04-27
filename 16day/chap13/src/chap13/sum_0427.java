package chap13;

import java.util.Scanner;

public class sum_0427 {
	public static void main(String[] args) {
		/*
		 *  1.String Ŭ�������� concat �޼��带 �����Ͻÿ�.
		 *   - concat�� ���ڿ��� �����ִ� ������Ѵ�.
		 *  
			2.str.substring(2, 4); substring ������ ���Ͽ� �����Ͻÿ�.
			  - substring�޼���� ���ڿ����� ������ �κ� �����ϴ� ����̴�
			    ex) str.substring(2, 4) �� ��� str�̶�� ���ڿ��� index 2���� ó��4�������� ����
			
			3.st1.compareTo(st2);compareTo ������ ���Ͽ� �����Ͻÿ�.
			  - st1 �� st2�� ���ڿ��� ������ 0 ��ȯ �ٸ��� st1�� st2���� ������ �տ������� ���� �ڿ������� ��� ��ȯ 
			
			4.String.valueOf �� ���Ͽ� �����Ͻÿ�.
			  - String.valueOf() �� �޼���� ()�ȿ� ���� �ٸ�������Ÿ���� �����͸� ���ڿ��� String���� ��ȯ����
			
			5. �Ʒ��� ����������� ȣ��Ǵ� �Լ�(����)�� �Ἥ ǥ���� ������.
			String str = "age: " + 17;
			
			  - str = "age: ".concat(17);
			    -> "age: ".concat(String.valueOf(17));
			    -> "age: " + "17" 
			
			6.StringBuilder �� String �� ���̴�?
			  - StringBuilder�� immutable ��ü�� �ƴ϶� ���� ���Ҽ��ִ� �ݸ� 
			    String �� immutable ��ü�� ���� ������ �����̵ǰ� ���� ����ɽ� ���οü�� �����Ͽ� ���� �޸𸮿� �Ҵ��Ѵ�.
			
			7.�Ʒ��� ���α׷��� �Ͻÿ�.
			�Է� : abcde
			��� : edcba
			
			�Ʒ�����
			
			8.�Ʒ��� ���α׷��� �Ͻÿ�.
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
		 * 
		 * */
		
		//7�� ���� 
		StringBuilder sb = new StringBuilder("abcde");
		
		sb.reverse();
		
		System.out.println(sb);
		
		//8������
		
		Circle01.showResult();
	
	}
}

class Circle01{
	
	public static double getCirArea(int rad) {
		return rad*rad*Math.PI;
	}
	
	public static void showResult() {
		Scanner sc = new Scanner(System.in);
		String yn = "Y";
		
		for(;;) {
			if(yn.equals("Y")) {
				System.out.println("�������� �Է����ּ���.");
				int rad = sc.nextInt();
				System.out.println("������: " + rad);
				System.out.println("���̴�: " + Circle01.getCirArea(rad));
				System.out.println("��� Y :: �ߴ� N");
				yn = sc.next();
			}else if( yn.equals("N")){
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				return;
			}else {
				System.out.println("�߸��� ���� �Է��߽��ϴ�. Y(yes) �� N(no) �� �ϳ��� �Է��Ͻÿ�. " );
				yn = sc.next();
			}
		}
	}
	
}
		
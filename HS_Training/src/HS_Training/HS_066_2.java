package HS_Training;

import java.util.Scanner;

// 66.
/*
"ö�� �л��� ���� 3���� �ʵ�� �޼ҵ带 ���� 4���� Ŭ���� Add, Sub, Mul, Div�� �ۼ��Ϸ��� �Ѵ�

int Ÿ���� a, b �ʵ�: 2���� �ǿ�����
void setValue(int a, int b): �ǿ����� ���� ��ü ���� �����Ѵ�.
int calculate(): Ŭ������ ������ �´� ������ �����ϰ� ����� �����Ѵ�.
���� �����غ���, Add, Sub, Mul, Div Ŭ������ ����� �ʵ�� �޼ҵ尡 �����ϹǷ� 
���ο� �߻� Ŭ���� Calc�� �ۼ��ϰ� Calc�� ��ӹ޾� ����� �ǰڴٰ� �����ߴ�. 
�׸��� main() �޼ҵ忡�� ���� ���� ��ʿ� ���� 2���� ������ �����ڸ� �Է¹��� ��, 
Add, Sub, Mul, Div �߿��� �� ������ ó���� �� �ִ� 
��ü�� �����ϰ� setValue() �� calculate()�� ȣ���Ͽ� �� ��� ���� ȭ�鿡 ����ϸ� �ȴٰ� �����Ͽ���. 
ö��ó�� ���α׷��� �ۼ��϶�.

�� ������ �����ڸ� �Է��Ͻÿ� >> 5 7 +
12"
 */
abstract class Cal{
	int a,b;
	
	void setValue(int a,int b){
		this.a = a;
		this.b = b;
	}
	
	abstract double calculate();
}

class Ad extends Cal{
	double calculate() {
		return this.a + this.b;
	}
}

class Su extends Cal{
	double calculate() {
		return this.a - this.b;
	}
}

class Mu extends Cal{
	double calculate() {
		return this.a * this.b;
	}
}

class Di extends Cal{
	double calculate() {
		return this.a / this.b;
	}
}

public class HS_066_2 {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		char c = sc.next().charAt(0);;
		Cal cal;
		
	
		switch(c) {
		
			case '+':
				cal = new Ad();
				break;
				
			case '-':
				cal = new Su();
				break;
				
			case '/':
				cal = new Di();
				break;
				
			case '*':
				cal = new Mu();
				break;
				
			default :
				System.out.println("��ȣ�� �߸��Է��Ͽ����ϴ�.");
				return;
		
		}
		


		
		cal.setValue(a,b);
		System.out.println(cal.calculate());
		
	}

}

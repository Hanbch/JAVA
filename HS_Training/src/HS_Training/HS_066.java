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

abstract class Calc {
	int a,b;
	
	void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	abstract double calculate();
	
}

class Add extends Calc{
	
	double calculate() {
		return a + b;
	}
	
}

class Mul extends Calc{
	
	double calculate() {
		return a * b;
	}
	
}

class Sub extends Calc{
	
	double calculate() {
		return a - b;
	}
	
}

class Div extends Calc{
	
	double calculate() {
		return a / b;
	}
	
}

public class HS_066 {
	
	public static void main(String[] args) {
		Calc cal;
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		String c = sc.next();
		
		if(c.equals("+")) {
			cal = new Add(); 
		}else if(c.equals("-")) {
			cal = new Sub();
		}else if(c.equals("*")) {
			cal = new Mul();
		}else if(c.equals("/")) {
			cal = new Div(); 
		}else {
			return;
		}
		
		
		cal.setValue(a,b);
		System.out.println(cal.calculate());
		
		
		
		
		
		 
		
		
	}

}

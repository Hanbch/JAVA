package chap07;

public class factorial {
	public static int factorial(int num) {//����Լ��� �̿��� ���丮�� �Լ� ����
		if(num == 1)
			return 1;
		else
			return num*factorial(num - 1);// �Լ��ȿ��� �ڱ��ڽ�(�Լ�)�� ȣ���ϴ� �Լ��� ����Լ�����Ѵ�.
	}
	
	public static int factorial2(int num) {// for���� �̿��� ���丮�� �Լ� ����
		int sum =1;
		for(int i=1; i<=num; i++) {
			sum *= i;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		//���丮�� �Լ� ����� 
		
		int rst = factorial(5);
		int rst2 = factorial2(5);
		System.out.println(rst);
		System.out.println(rst2);
	}
	
	
}

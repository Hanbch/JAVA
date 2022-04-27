package chap10;

public class Factorial {
	public static int factorial(int num) {
		if(num == 1)
			return 1;
		else
			return num*factorial(num - 1);
	}
	
	public static int factorial2(int num) {
		int sum =1;
		for(int i=1; i<=num; i++) {
			sum *= i;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		int rst = factorial(5);
		int rst2 = factorial2(5);
		System.out.println(rst);
		System.out.println(rst2);
	}
	
	
}

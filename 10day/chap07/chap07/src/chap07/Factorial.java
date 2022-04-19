package chap07;

public class Factorial {
	public static int factorial(int num) {//占쏙옙占쏙옙獨占쏙옙占� 占싱울옙占쏙옙 占쏙옙占썰리占쏙옙 占쌉쇽옙 占쏙옙占쏙옙
		if(num == 1)
			return 1;
		else
			return num*factorial(num - 1);// 占쌉쇽옙占싫울옙占쏙옙 占쌘깍옙占쌘쏙옙(占쌉쇽옙)占쏙옙 호占쏙옙占싹댐옙 占쌉쇽옙占쏙옙 占쏙옙占쏙옙獨占쏙옙占쏙옙占싼댐옙.
	}
	
	public static int factorial2(int num) {// for占쏙옙占쏙옙 占싱울옙占쏙옙 占쏙옙占썰리占쏙옙 占쌉쇽옙 占쏙옙占쏙옙
		int sum =1;
		for(int i=1; i<=num; i++) {
			sum *= i;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		//占쏙옙占썰리占쏙옙 占쌉쇽옙 占쏙옙占쏙옙占� 
		
		int rst = factorial(5);
		int rst2 = factorial2(5);
		System.out.println(rst);
		System.out.println(rst2);
	}
	
	
}

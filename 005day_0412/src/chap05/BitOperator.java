package chap05;

public class BitOperator {

	public static void main(String[] args) {
		byte n1 = 5;
		byte n2 = 3;
		byte n3 = -1;
		
		byte r1 = (byte)(n1 & n2);
		byte r2 = (byte)(n1 | n2);
		byte r3 = (byte)(n1 ^ n2);
		byte r4 = (byte)(~n3);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		byte num;
		
		num = 2;
		System.out.println((byte)(num << 1) + " ");
		System.out.println((byte)(num << 2) + " ");
		System.out.println((byte)(num << 3) + " ");
		
		num = 8; 
		System.out.println((byte)(num >> 1) + " ");
		System.out.println((byte)(num >> 2) + " ");
		System.out.println((byte)(num >> 3) + " ");
		
		num = -8;
		System.out.println((byte)(num >> 1) + " ");
		System.out.println((byte)(num >> 2) + " ");
		System.out.println((byte)(num >> 3) + " ");
		
		

	}

}

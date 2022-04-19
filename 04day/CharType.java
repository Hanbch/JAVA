
public class CharType {
	public static void main(String[] args) {
		
		char ch1 = '헐';
		char ch2 = '확';
		char ch3 = 54736;
		char ch4 = 54869;
		char ch5 = 0xD5D0;
		char ch6 = 0xD655;
		
		System.out.println(ch1 + " "  + ch2);
		System.out.println(ch3 + " " + ch4);
		System.out.println(ch5 + " " + ch6);
		
		boolean b1 = true;
		boolean b2 = false;
		 int num1 = 10;
		 int num2 = 20;
	
		 System.out.println(num1 < num2);
		 System.out.println(num1 > num2);
		 
		 final int MAX_SIZE = 100;
		 final char CONST_CHAR = '상';
		 final int CONST_ASSIGNED;
		 
		 CONST_ASSIGNED = 12;
		 
		 System.out.println("상수1 : " + MAX_SIZE);
		 System.out.println("상수2 : " + CONST_CHAR);
		 System.out.println("상수3 : " + CONST_ASSIGNED);
		 
		 int n1 = 123;
		 int n2 = 0123;
		 int n3 = 0x123;
		 
		 System.out.println("n1: " + n1);
		 System.out.println("n2: " + n2);
		 System.out.println("n3: " + n3);
		 System.out.println("11 + 22 +33 = " + (11 + 22 + 33));
		 System.out.println("011 + 022 + 033 = " + (011+ 022 + 033));
		 System.out.println("0x011 + 0x22 + 0x33 = " + (0x11 + 0x22 + 0x33));
		 
		 System.out.println("AB" + '\b' + 'c');
		 System.out.println("AB" + '\t' + 'c');
		 System.out.println("AB" + '\n' + 'c');
		 System.out.println("AB" + '\r' + 'c');
		 
		 long a =9000000000000000000L;
		 float f = 300000000000000000000000000000000000000F;
		 double b =1.1;
		 
		 double c = a + b;
		 System.out.println(a);
		 System.out.println(c);
		 
		 System.out.println(3147483647L + 3147483648L);
		 
		 	int nu1 = 3;
			int nu2 = 4;

			double result = num1 / num2;
			
			System.out.println(result);
			
			int one = 1;
			double two = 2;
			
			//double rst = one/two;
			
			System.out.println(one+two);
			
			System.out.println('A');
			System.out.println("A" + "A");
			
	}
}

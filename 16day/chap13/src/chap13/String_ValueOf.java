package chap13;

public class String_ValueOf {
	public static void main(String[] args) {
		double num = 3.141559;
		
		String str = String.valueOf(num);
		System.out.println(str + num);
		
		String aaa="aaa";
		System.out.println(aaa.hashCode());
		aaa = "ccc";
		
		System.out.println(aaa.hashCode());
		
		
		
	}
	
}
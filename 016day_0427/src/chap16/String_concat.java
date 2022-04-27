package chap16;

public class String_concat {
	public static void main(String[] args) {
		String st1 = "Coffee";
		String st2 = "Bread";
		
		String st3 = st1.concat(st2);// st1 + st2
		System.out.println(st3);
		
		String st4 = "Fresh".concat(st3);
		System.out.println(st4);
		String abc = "abcdefg";
		
		System.out.println(abc.substring(2,4));//substring(x,y) index x부터 y번째까지 
		
	}
	
}
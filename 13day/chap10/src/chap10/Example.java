package chap10;
import packag.copy.Circle;


public class Example {
	
	public static void printString(String str) {
		System.out.print(str);
	}
	
	public static void main(String[] args) {
		String str1 = "Happy";
		String str2 = "Birthday";
		System.out.println(str1 + " " + str2);
		
		printString(str1);
		printString(" ");
		printString(str2);
		printString("\n");
		printString("End of program! \n");
		
		packag.Circle cir = new packag.Circle();
		Circle cir2 = new Circle();
		
	}

}

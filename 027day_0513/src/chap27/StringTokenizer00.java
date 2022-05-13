package chap27;

import java.math.BigDecimal;
import java.util.Random;
import java.util.StringTokenizer;

public class StringTokenizer00{

	public static void main(String[] args) {
		StringTokenizer st1 = new StringTokenizer("PM:08:45", ":");
		   System.out.println(st1);
		   while(st1.hasMoreTokens()) {
		      System.out.print(st1.nextToken() + ' ');
		   }
		   System.out.println();

		   StringTokenizer st2 = new StringTokenizer("12 + 36 - 8 / 2 = 44", "+-/= ");

		   while(st2.hasMoreTokens())
		      System.out.print(st2.nextToken() + ' ');
		   System.out.println();

	}

}

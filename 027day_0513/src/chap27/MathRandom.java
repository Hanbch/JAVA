package chap27;

import java.math.BigDecimal;
import java.util.Random;

public class MathRandom{

	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		Random rand = new Random();   
		   for(int i = 0; i < 7; i++)
		      System.out.println(rand.nextInt(1000));

		   long after_time = System.currentTimeMillis();
		   System.out.println( after_time - time);
	}

}

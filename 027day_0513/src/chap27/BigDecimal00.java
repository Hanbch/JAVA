package chap27;

import java.math.BigDecimal;

public class BigDecimal00{

	public static void main(String[] args) {
		
		BigDecimal d1 = new BigDecimal("1.6");
		BigDecimal d2 = new BigDecimal("0.1");
		System.out.println("���� ���: " + d1.add(d2));
		System.out.println("���� ���: " + d1.multiply(d2));

	}

}

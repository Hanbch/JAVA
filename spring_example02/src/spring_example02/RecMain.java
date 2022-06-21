package spring_example02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class RecMain {

	public static void main(String[] args) {
		String config = "classpath:recCTX.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);
		
		RecArea r1 = ctx.getBean("RecArea",RecArea.class);
		r1.setWidth(50);
		r1.setHeight(50);
		
		int area = r1.getRecArea();
		System.out.println(area);
	}

}

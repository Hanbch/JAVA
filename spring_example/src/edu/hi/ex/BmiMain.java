package edu.hi.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BmiMain {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		String config = "classpath:bmiCTX.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);
		//IOC 컨테이너,스프링
		
		
		MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);
		
		myInfo.getInfo();
		
		ctx.close();
		
		
		
		
	}

}

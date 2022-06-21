package edu.hi.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ExMain {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		String config = "classpath:cirCTX2.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);
		//IOC 컨테이너,스프링
		
		
		
		
		Cir2 cir = ctx.getBean("cir2",Cir2.class);
		
		System.out.println(cir.getArea());
		
		
		
		
	}

}

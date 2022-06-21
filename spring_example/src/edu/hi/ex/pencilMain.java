package edu.hi.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class pencilMain {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		String config = "classpath:pencilCTX.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);
		//IOC 컨테이너,스프링
		
		
		Pencil pencil = ctx.getBean("pencil",Pencil.class);
		pencil.use();
		
		
		
	}

}

package edu.hi.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ShapeMain {

	public static void main(String[] args) {
		System.out.println("Shape.Main Start");
		
		String config = "classpath:appCTX4.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);
		
		ShapeGetArea s1 = ctx.getBean("shapeGetArea",ShapeGetArea.class);
		System.out.println(s1);
	}

}

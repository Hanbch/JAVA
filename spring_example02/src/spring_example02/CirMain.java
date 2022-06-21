package spring_example02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CirMain {

	public static void main(String[] args) {
		
		String config = "classpath:cirCtx.xml"; 
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);
		
		CirArea cir = ctx.getBean("CirArea",CirArea.class);
		double area = cir.getArea();
		System.out.println(area);
		//IOC 컨테이너,스프링

	}

}

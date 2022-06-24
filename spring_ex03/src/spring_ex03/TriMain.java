package spring_ex03;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TriMain {

	public static void main(String[] args) {
		String config = "classpath:triCTX.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);
		
		Triangle tri = ctx.getBean("tri",Triangle.class);
		
		System.out.println(tri.getArea());
		
		ctx.close();

	}

}

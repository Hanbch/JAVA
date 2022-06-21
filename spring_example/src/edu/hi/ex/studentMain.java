package edu.hi.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class studentMain {

	public static void main(String[] args) {
		System.out.println("student main");
		
		String config = "classpath:studentCTX.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);
		//IOC 컨테이너,스프링
		
		StudentInfo stu = ctx.getBean("StudentInfo",StudentInfo.class);
		
		stu.getStudentInfo();
		ctx.close();
		
		
		
		
	}

}

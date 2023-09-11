package com.spring.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext4.xml");
		PersonInterface admin1=context.getBean("admin",PersonInterface.class);
		admin1.name();
		context.close();	
	}

}

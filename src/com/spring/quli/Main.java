package com.spring.quli;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext3.xml");
/*
		CompanyInterface comp=context.getBean("user",CompanyInterface.class);
		comp.start();
		context.close();
	*/
		
		MasterInterface mas=context.getBean("master",MasterInterface.class);
		mas.name();
		context.close();
		
		
	}

}

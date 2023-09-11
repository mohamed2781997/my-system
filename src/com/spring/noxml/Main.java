package com.spring.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		
		MasterInterface m=context.getBean("master",MasterInterface.class);
		m.name();
		m.getsport();
	
		
		Manager ma=context.getBean("manager",Manager.class);
		System.out.println("Email is "+ma.getEmail());
		System.out.println("Email is "+ma.getTeam());
		context.close();
		
	}
	

}

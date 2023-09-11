package com.spring.beeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.noxml.Manager;

public class Main {

	public static void main(String[] args) {

		
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		
		MasterInterface m=context.getBean("mymaster",MasterInterface.class);
		m.name();
		m.getsport();
	
		
	}
	
	  

}

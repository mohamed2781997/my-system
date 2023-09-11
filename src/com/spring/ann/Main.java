package com.spring.ann;

import javax.naming.Context;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.ConcurrencyFailureException;

public class Main {

	public static void main(String[] args) {

		
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		/*
		//component 
		MasterInterface ms=context.getBean("master",MasterInterface.class);
		ms.name();
		*/
		
		
		
		
		//component
		//SportInterface si=context.getBean("ts",SportInterface.class);
		//si.mysport();
		
	
				/*
				//contructor autowired
				MasterInterface mt=context.getBean("master",MasterInterface.class);
				mt.callsport();
			*/	
		
		
				//setter autowired
				MasterInterface mt=context.getBean("master",MasterInterface.class);
				mt.callsport();
				
				
				
		context.close();
	}
	

}

package com.spring.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	


	public static void main(String[] args) {

		
      //load spring configuration file عشان اتكلم معاه
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	
		//retrieve  bean from spring container
		Sport football=context.getBean("mysport",Sport.class);
		
		//second state 
		//Sport football=(Sport)context.getBean("mysport");
		
		//call method 
		
		football.print();
		
		//close context
		context.close();
		
		
	}

}

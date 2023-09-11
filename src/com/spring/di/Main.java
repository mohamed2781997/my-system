package com.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		
		
		//use java code to make properity 
		/*
				User use=new User();
				use.setEmail("mody.magdy999@gmail.com");
				use.setTeam("Cs");
				String s=use.getEmail();
				String y=use.getTeam();
		System.out.println("Email is "+s+" " +" Team is "+ y);
		*/
		
			
		/*
		 * شغل جافا عادى كونسنركتور 
		Person pers=new Person();
		User use=new User(pers);
		use.getPerson();
		*/
		
		
		
		
		
		/*//شغل جافا setter and getter
		Person pers=new Person();
		User use=new User();
		use.setP(pers);
		use.getPerson();
		*/
		
		
		
		//load spring configuration file عشان اتكلم معاه
		
				ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

				//retrieve  bean from spring container
				UserInterface use=context.getBean("user",UserInterface.class);
				//use.start();
				use.getPerson();
				
				System.out.println("ID : "+""+"("+use.getId()+")"+" "+"Name  :"+""+"("+use.getName()+")"+" "+"Email  :" +" "+"("+use.getEmail()+")"+" Team  :" + " "+"("+use.getTeam()+")");
				
			
				
				
				PersonalInterface pers=context.getBean("person",PersonalInterface.class);
				//call method 
				//pers.begain();
		
	
				//close context
				context.close();
	
	
	}

}
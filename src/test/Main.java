package test;

import java.net.ConnectException;

import javax.naming.Context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		
		/*
		// Ioc
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("testing.xml");
		InnterClass i=context.getBean("mypro",InnterClass.class);
		i.printname();

		PersonInterface ps=context.getBean("per",PersonInterface.class);
		ps.printperson();
*/
		
		
		
		/*
			//constructor injection
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("testing.xml");
		InnterClass in=context.getBean("kan",InnterClass.class);
		in.welper();
		*/
		
		
		
		/*setter injection
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("testing.xml");
		InnterClass inn=context.getBean("mywelcome",InnterClass.class);
		inn.welper();
		
		*/
		
		
		
		/*seter and getter properity
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("testing.xml");
		InnterClass inns=context.getBean("welcomes",InnterClass.class);
		System.out.println("Email :"+inns.getEmail()+" "+ "Name : "+ inns.getName());
		context.close();
		
		
		*/
		
		
		
	}

}

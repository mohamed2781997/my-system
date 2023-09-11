package com.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Admin implements PersonInterface {

	@Override
	public void name() {
		System.out.println("iam admin");

		
	}
	@PostConstruct
	public void init()
	{
		
		System.out.println("Start.................");
		
		
	}
	 
	@PreDestroy
	public void destroy()
	{
		
		System.out.println("ending.................");
		
		
	}
}

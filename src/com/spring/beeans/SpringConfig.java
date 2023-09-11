package com.spring.beeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
public class SpringConfig {
	
	
	
	@Bean
	public MasterInterface mymaster()   // == creat bean in xml with id(mymaster) and object 
	{
		return new Master(mysport());  // object with id 
							
		
		
		
		
	}
	@Bean
	public SporInterface mysport()   // == creat bean in xml with id (mysport)and object 
	
	{
		return new Sport();  		// object with id
		
	}
	
	
	
	
	}

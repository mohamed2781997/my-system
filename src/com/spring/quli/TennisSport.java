package com.spring.quli;

import org.springframework.stereotype.Component;

@Component("ts")
public class TennisSport implements SportInterface {

	
	
	
	@Override
	public void mysport() {
		System.out.println("Tennis ....");		
	}


	}



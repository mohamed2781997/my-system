package com.spring.ann;

import org.springframework.stereotype.Component;

@Component("ts")
public class TennisSport implements SportInterface {

	
	
	
	@Override
	public void mysport() {
		System.out.println("Tennis ....");		
	}


	}



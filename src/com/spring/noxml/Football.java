package com.spring.noxml;

import org.springframework.stereotype.Component;

@Component
public class Football  implements SporInterface{

	@Override
	public void mysport() {
		System.out.println("football");
		
		
	}

	
}

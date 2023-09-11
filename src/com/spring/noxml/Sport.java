package com.spring.noxml;

import org.springframework.stereotype.Component;

@Component
public class Sport  implements SporInterface{

	@Override
	public void mysport() {
System.out.println("my sport");		
	}

}

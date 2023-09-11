package com.spring.beeans;

import org.springframework.stereotype.Component;


public class Sport  implements SporInterface{

	@Override
	public void mysport() {
System.out.println("my sport");		
	}

}

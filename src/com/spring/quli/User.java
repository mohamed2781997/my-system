package com.spring.quli;

import org.springframework.stereotype.Component;

@Component()
public class User implements CompanyInterface {

	@Override
	public void start() {
		System.out.println("Iam User");
		
	}

}

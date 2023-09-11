package com.spring.quli;

import org.springframework.stereotype.Component;

@Component
public class Student implements CompanyInterface {

	@Override
	public void start() {
		System.out.println("Iam Student");
		
	}

}

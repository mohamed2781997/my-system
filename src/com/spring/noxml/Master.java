package com.spring.noxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Master implements MasterInterface {
@Autowired
@Qualifier("football")
	private SporInterface sport;
	
/*
	@Autowired
	public Master(SporInterface sport) {

		this.sport=sport;
		// TODO Auto-generated constructor stub
	}
*/

	@Override
	public void name() {

		
		System.out.println("iam hassan");
		
	}


	@Override
	public void getsport() {
			this.sport.mysport();
		
		
	}

	
	
	
	

}

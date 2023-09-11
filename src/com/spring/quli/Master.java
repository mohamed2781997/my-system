package com.spring.quli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("master")
public class Master implements MasterInterface {

	@Qualifier("client")
	@Autowired
	private CompanyInterface comany;
	
	
	
	
	
	
	@Override
	public void name() {

		this.comany.start();
		
		
	}


	@Override
	public void callsport() {
		// TODO Auto-generated method stub
		
	}

	
	

}

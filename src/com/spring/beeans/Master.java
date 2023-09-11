package com.spring.beeans;

public class Master implements MasterInterface {

	private SporInterface sport;
	

	public Master(SporInterface sport) {

		this.sport=sport;
		// TODO Auto-generated constructor stub
	}


	@Override
	public void name() {

		
		System.out.println("iam hassan");
		
	}


	@Override
	public void getsport() {
			this.sport.mysport();
		
		
	}

	
	
	
	

}

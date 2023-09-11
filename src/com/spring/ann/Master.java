package com.spring.ann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("master")
public class Master implements MasterInterface {

	
	//هنا اقدر اجيب داله من كلاس معموله ايمبلينت لانترفيس تانى من خلال داله هنا ف الكلاس ده معمولها اوفر رايد 
	private SportInterface sport;
	
	
	/*
	@Autowired attribute if not constructor and setter funtion
	private SportInterface sport;
	*/
	
	
	
	
	
	/*
	@Autowired   // constructor
	public Master(SportInterface sport) {
		this.sport=sport;
		// TODO Auto-generated constructor stub
	}

*/

	@Autowired   //setter
	public void setSport(SportInterface sport) {
		this.sport = sport;
	}

	
	

	@Override
	public void name() {

		System.out.println("I am Master ......");
		
	}


// دى الداله اللى قدرت استدعيها من خلال داله تانيه 

	@Override
	public void callsport() {
		this.sport.mysport();
		
		
	}

}

package com.spring.di;

public class User implements UserInterface{
	
	
	private PersonalInterface p;
	private String email;
	private String team;
	private int id;
	private String name;
	
	
	/*Constructor with constructor arg 
	 public User(PersonalInterface per) { 
		 this.p=per;
	 }
	*/
	@Override
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public void setP(PersonalInterface p) {   // delete set and put P is p small
		this.p = p;
	}
	
	
	
	public void doStart() { //function make before been start
		
		System.out.println("Start..........");
		
		
	}
	public void doEnd() {  //function make after close bean or container
	System.out.println("Ending.......");	
		
		
	}
	
	
	
	
	
	
	
	@Override
	public void start() {
		
	System.out.println("Iam User");	

	}
	@Override
	public void getPerson() {
		this.p.begain();
		
	}

}

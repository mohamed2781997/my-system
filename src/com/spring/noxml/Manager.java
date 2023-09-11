package com.spring.noxml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//الكلاس ده بديل الاكس ام ال
//<property name="email" value="${us.id}"></property>
//<property name="team" value="${us.name}"></property>

@Component
public class Manager {
	@Value("${us.email}")
	private String email;
	
	@Value("${us.team}")
	private String team;
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}

}

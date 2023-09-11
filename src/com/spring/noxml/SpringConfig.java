package com.spring.noxml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.spring.noxml") // دا بديل الاسكان اللى بيتعمل ف الاكس ام ال 
@PropertySource("classpath:data.properties") // بديل الاكس ام ال <context:property-placeholder location="data.properties"/> add value
public class SpringConfig {

	
}

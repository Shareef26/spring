package com.SpringBeginner.Config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
 
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.SpringBeginner")
public class JavaConfiguration implements WebMvcConfigurer 
{
	public JavaConfiguration() 
	{
		super();
	}
	
}
package com.kk.industrylevelproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class SpringbootIndustryLevelprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootIndustryLevelprojectApplication.class, args);
		System.out.println("tomcat started..");
	}

}

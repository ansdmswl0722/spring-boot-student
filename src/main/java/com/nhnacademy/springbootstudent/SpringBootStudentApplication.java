package com.nhnacademy.springbootstudent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

//@ConfigurationPropertiesScan
@SpringBootApplication
public class SpringBootStudentApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootStudentApplication.class, args);
		SpringApplication application = new SpringApplication(SpringBootStudentApplication.class);

		application.run(args);
	}
}

package com.boot.angular.angularwithboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"veni.com.*" , "com.boot.angular.angularwithboot.controller"})
 
public class AngularWithBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngularWithBootApplication.class, args);
	}

}

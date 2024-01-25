package com.javalearning.springbooth2ex;

import com.javalearning.controller.StudentController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Springbooth2exApplication {

	public static void main(String[] args) {

		SpringApplication.run(Springbooth2exApplication.class, args);
	}

}

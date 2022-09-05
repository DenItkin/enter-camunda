package com.sytoss.camunda_react_web;

import org.camunda.bpm.spring.boot.starter.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.*;

@SpringBootApplication
@EnableProcessApplication("enter-webapp")
public class CamundaReactWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamundaReactWebApplication.class, args);
	}

}

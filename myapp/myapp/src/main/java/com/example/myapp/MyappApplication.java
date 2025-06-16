package com.example.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class MyappApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(MyappApplication.class, args); //run method creates the container for you.

        //Dev obj = new Dev(); // not easy to manage lifecycle
		//Dev obj = null; gives null pointer exception
		//have to register the class in container using annotation.(Dependency injection)

		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}

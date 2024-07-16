package com.firstApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstAppApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context =  SpringApplication.run(FirstAppApplication.class, args);
		Dog dog = context.getBean(Dog.class);
		dog.sayHello();


	}

}

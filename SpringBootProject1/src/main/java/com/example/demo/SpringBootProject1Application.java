package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@Scope(value="prototype")
public class SpringBootProject1Application {
	
	//@Autowired   // Autowired here did not work
	//static Alien obj1;

	public static void main(String[] args) {
	    	SpringApplication.run(SpringBootProject1Application.class, args);
	    	System.out.println("Main Spring Page_1");

			/*
			 * ConfigurableApplicationContext
			 * context=SpringApplication.run(SpringBootProject1Application.class, args);
			 * 
			 * Alien obj1 = context.getBean(Alien.class); obj1.show();
			 */
	}

}

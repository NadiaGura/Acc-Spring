package com.example.demo;

//source: spring.io tutorial

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController   // annotation to tell Spring that code is an endpoint that shuld be available ot he Web
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")  // use hello() to answer requests that get sent to localhost
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) { //hello() to take a param name and then to combine it with the "World"
		return String.format("Hello %s!", name);
	}
}

package com.example.demoHello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoHelloApplication.class, args);
	}

	@GetMapping("/helloworld")
	public String helloworld() {
		return "Hello World!";
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "fname", defaultValue = "World") String firstname, @RequestParam(value = "lname", defaultValue = "World") String lastname) {
		return String.format("Hello %s %s!", firstname, lastname);
	}

}

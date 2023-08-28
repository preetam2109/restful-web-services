package com.preetam.restfulwebservicesv3;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldController {
 
	@GetMapping("/login")
	public String sayHelloWorldController() {
		return "Hello Preetam  ";
	}
	@GetMapping("/login-bean")
	public HelloWorldBean sayHelloWorldBean() {
		return new HelloWorldBean("Preetam","24"); 
	}
	@GetMapping("/login-bean/{name}")
	public HelloWorldBean sayHelloWorldBeanWithname(@PathVariable String name) {
		return new HelloWorldBean("Preetam "+ name, "24" ); 
	}
	

}

package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoGradleAppApplication {

	@GetMapping("/home")
	public String hello() {
		return "Hello Team.. we have successfully deployed our first Gradle app on Azure Cloud.. ";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoGradleAppApplication.class, args);
	}

}

package com.tcs.tcs_finalproject_Netra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TcsFinalprojectNetraApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcsFinalprojectNetraApplication.class, args);
	}

	
	@GetMapping("/")
	public String welcome () {
		return "<h1>Welcome to Netra's Final Project Application</h1>";
	}

	@GetMapping("/about")
	public String aboutUs() {
		return "<h1>At TCS, our values guide our decisions, shape our culture, and inspire us to achieve our shared vision."
				+ "The TCS Values are integral to the TCS Way.</h1>";
	}

}



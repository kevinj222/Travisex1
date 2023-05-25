package com.travis.travisexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TravisexampleApplication
{
	@GetMapping("/value")
	public String getvalue()
	{
		return "This program is running succesfully";
	}

	public static void main(String[] args) {
		SpringApplication.run(TravisexampleApplication.class, args);
	}

}

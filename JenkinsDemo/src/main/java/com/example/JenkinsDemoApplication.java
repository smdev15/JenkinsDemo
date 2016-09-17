package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {
	
	private String input;
	
	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = "Helloe World";
	}

	public String message() {
		String msg = getInput();
		return msg;
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}
}

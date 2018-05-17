package com.company.gifmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main point of entry for the GIF Manager application.
 * @author johnl
 */
@SpringBootApplication
public class Application {

	/**
	 * Main method for launching the GIF Manager application.
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

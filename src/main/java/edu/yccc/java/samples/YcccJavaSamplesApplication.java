package edu.yccc.java.samples;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class YcccJavaSamplesApplication {

	public static void main(String[] args) {
		//SpringApplication.run(YcccJavaSamplesApplication.class, args);
		new SpringApplicationBuilder(YcccJavaSamplesApplication.class).headless(false).run(args);
		new ApplicationWindow().runApplication();
	}
	/**
	 * create a UI
	 *  - text field to type message that will be sent across slack channel
	 *  - select slack channel
	 *  - "send message" button
	 *  
	 *  
	 */
}

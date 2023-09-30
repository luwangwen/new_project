package net.lww.new_project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewProjectApplication {

	public static final Logger LOGGER = LoggerFactory.getLogger("new_project");

	public static void main(String[] args) {
		SpringApplication.run(NewProjectApplication.class, args);
	}
}

package com.rcoem.devops_honor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DevopsHonorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsHonorApplication.class, args);
	}

}

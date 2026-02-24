package com.plantInventory.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing      //enable automatic @createdDate and @lastModifiedDate
public class PlantInventorySystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlantInventorySystemApplication.class, args);
	}

}

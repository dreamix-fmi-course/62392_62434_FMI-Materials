package com.dreamix.FMIMaterials;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Profile("local")
public class FmiMaterialsApplication{

	public static void main(String[] args) {

		SpringApplication.run(FmiMaterialsApplication.class, args);
	}

}

package com.example.vitthstore;

import com.example.vitthstore.shared.security.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class VitthstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(VitthstoreApplication.class, args);
	}

}

package br.com.mangatic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class MangaticApplication {

	public static void main(String[] args) {
		SpringApplication.run(MangaticApplication.class, args);
	}


}

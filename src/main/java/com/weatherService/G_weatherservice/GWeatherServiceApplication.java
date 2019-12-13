package com.weatherService.G_weatherservice;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class GWeatherServiceApplication {

	private String[] weahther = {"Sunny","Cloudy","Windy","rainy"};
	public static void main(String[] args) {
		SpringApplication.run(GWeatherServiceApplication.class, args);
	}

	@GetMapping("/weather")
	public String getWeather() {
		int rand = ThreadLocalRandom.current().nextInt(0, 3);
		return weahther[rand];
	}
}

package com.spring.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.spring.market.persistence.mapper.ProductMapper"})
public class MarketApplication { 

	public static void main(String[] args) {
		SpringApplication.run(MarketApplication.class, args);
	}

}

package co.com.personalsoft.market;

import org.mapstruct.MapperConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
@MapperConfig(implementationPackage = "co.com.personalsoft.market.persistence.mappers")
public class MarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketApplication.class, args);
	}

}

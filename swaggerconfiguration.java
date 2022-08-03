package Application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class swaggerconfiguration {

	@Bean
	public Docket swaggerconfig() {

		return new Docket(DocumentationType.SWAGGER_2).select().build()
				.apiInfo(new ApiInfo("Company api", "This includes details about employees and their department",
						"contact", "ph : 999999999", "Free to use", "mail-abc@gmail.com", "http://localhost:8020"));
	}
}

package Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan
@Configuration
@EnableAutoConfiguration 
@EntityScan
@EnableSwagger2
public class Industry2Application {

	public static void main(String[] args) {
		SpringApplication.run(Industry2Application.class, args);
	}

	
}

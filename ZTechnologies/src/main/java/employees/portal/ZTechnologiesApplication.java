
package employees.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan
@Configuration
@EnableAutoConfiguration
@EnableWebMvc
public class ZTechnologiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZTechnologiesApplication.class, args);

	}

}
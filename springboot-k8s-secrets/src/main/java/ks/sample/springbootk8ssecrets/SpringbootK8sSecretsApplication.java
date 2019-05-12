package ks.sample.springbootk8ssecrets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringbootK8sSecretsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootK8sSecretsApplication.class, args);
	}
	
	@Configuration
    public class DemoConfiguration {

        @Bean
        public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) { 
            return restTemplateBuilder.build();
        }
    }

}

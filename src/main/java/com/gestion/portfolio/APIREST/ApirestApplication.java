package com.gestion.portfolio.APIREST;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ApirestApplication implements CommandLineRunner{
    

	public static void main(String[] args) {
		SpringApplication.run(ApirestApplication.class, args);
	}
        
        @Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("https://adrianmartinez.netlify.app", "http://localhost:4200").allowedMethods("*");
			}
		};
	}

    @Override
    public void run(String... args) throws Exception {
    }

}

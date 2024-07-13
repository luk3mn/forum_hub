package com.luke.forumhub.infra.springdoc;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfigurations {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components()
                        .addSecuritySchemes("bearer-key",
                                new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")))
                .info(new Info()
                        .title("Forum Hub")
                        .description("Backend application built during the Alura Challenge ONE to create a comprehensive forum API designed for users to share issues and provide answers. This project was developed using Java and Spring Boot 3, leveraging the power of Flyway to manage MySQL database migrations seamlessly through ORM. The application supports robust user interactions, including posting queries and sharing solutions, ensuring efficient data handling and enhancing the overall user experience in the forum environment.")
                        .contact(new Contact()
                                .name("Lucas Renan")
                                .email("lucasnunes2030@gmail.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://lucasmaues.vercel.app/")));
    }
}

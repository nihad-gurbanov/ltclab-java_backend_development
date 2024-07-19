package com.ltc.student.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Student API")
                        .version("1.0")
                        .description("API documentation for the Student application"));
    }
}

//package com.ltc.student.config;
//
//import io.swagger.v3.oas.annotations.OpenAPIDefinition;
//import io.swagger.v3.oas.annotations.info.Info;
//
//@OpenAPIDefinition(
//        info = @Info(
//                title = "Student Management System",
//                version = "1.0",
//                description = "Student Management System API"
//        )
//)
//public class OpenApiConfig {
//}


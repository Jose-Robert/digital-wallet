package br.com.github.infrastructure.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Digital Wallet API")
                        .description("Microserviço de movimentações financeiras e API de Transferência entre Contas.")
                        .termsOfService("Terms of service")
                        .contact(new Contact()
                                .name("DEVELOPER IT")
                                .url("https://github.com/Jose-Robert")
                                .email("jrobert.dev@hotmail.com"))
                        .license(new License()
                                .name("License of API")
                                .url("API license URL"))
                        .version("1.0.0"));
    }
}
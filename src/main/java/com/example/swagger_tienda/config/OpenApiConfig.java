package com.example.swagger_tienda.config;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API de Tienda")
                        .version("1.0")
                        .description("Documentación de la API REST de la Tienda. Gestiona Productos, Categorías, Clientes, Pedidos, Detalle de Pedidos y Proveedores con Spring Boot, MySQL y Swagger.")
                        .contact(new Contact()
                                .name("Equipo de Desarrollo")
                                .email("soporte@ejemplo.com"))
                );
    }
}

package com.example.api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Esta es la clase principal del API Gateway.
 * Se encarga de iniciar la aplicación Spring Boot y 
 * habilita el cliente de descubrimiento.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayApplication {

	/**
     * Punto de entrada de la aplicación.
     * @param args Argumentos de línea de comandos (no utilizados).
     */
	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}

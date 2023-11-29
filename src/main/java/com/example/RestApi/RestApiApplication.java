package com.example.RestApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan("com.example.notes.model") // Додайте пакет, де знаходяться ваші entity-класи
@EnableJpaRepositories("com.example.notes.repository") // Додайте пакет, де знаходяться ваші репозиторії
@EnableTransactionManagement
public class RestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiApplication.class, args);
    }
}

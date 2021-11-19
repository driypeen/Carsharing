package com.driypeen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class CarsharingApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarsharingApplication.class, args);
    }
}

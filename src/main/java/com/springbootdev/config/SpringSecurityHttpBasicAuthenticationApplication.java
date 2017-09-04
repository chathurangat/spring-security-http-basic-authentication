package com.springbootdev.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.springbootdev.*")
public class SpringSecurityHttpBasicAuthenticationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityHttpBasicAuthenticationApplication.class, args);
    }
}

package com.example.demo.cserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CServerApplication.class, args);
    }
}

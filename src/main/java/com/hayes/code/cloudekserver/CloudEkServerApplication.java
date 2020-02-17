package com.hayes.code.cloudekserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudEkServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudEkServerApplication.class, args);
    }

}

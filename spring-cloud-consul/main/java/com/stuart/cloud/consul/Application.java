package com.stuart.cloud.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
@EnableConfigurationProperties
public class Application {

    public static void main(String[] args){

        SpringApplication.run(Application.class,args);

    }

}

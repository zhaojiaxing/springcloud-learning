package com.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by zjx on 2018/3/30.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigEurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigEurekaClientApplication.class,args);
    }
}

package com.feign.upload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by zjx on 2018/3/29.
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class FeignUploadApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignUploadApplication.class,args);
    }
}

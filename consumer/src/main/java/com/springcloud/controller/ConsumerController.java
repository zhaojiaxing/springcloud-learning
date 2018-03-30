package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zjx on 2018/3/29.
 */
@RestController
public class ConsumerController {

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String test(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("hello-client");
        String url = "http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/hello?name=2";
        System.out.println(serviceInstance.getHost());
        return restTemplate.getForObject(url,String.class);
    }
}

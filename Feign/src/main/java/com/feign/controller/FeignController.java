package com.feign.controller;

import com.feign.client.FeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zjx on 2018/3/29.
 */
@RestController
public class FeignController {
    @Autowired
    FeignClient feignClient;
    @GetMapping("/test")
    public String test(){
        return feignClient.hello("张三");
    }
}

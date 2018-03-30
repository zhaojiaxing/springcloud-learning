package com.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zjx on 2018/3/30.
 */
@RefreshScope
@RestController
public class EurekaController {
    @Value("${from}")
    private String from;

    @RequestMapping("/foo")
    public String from() {
        return this.from;
    }


}

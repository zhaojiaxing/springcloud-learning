package com.feign.client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zjx on 2018/3/29.
 */
@org.springframework.cloud.netflix.feign.FeignClient("hello-client")
public interface FeignClient {

    @GetMapping("/hello")
    String hello(@RequestParam("name") String name);
}

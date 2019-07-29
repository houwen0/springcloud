package com.stuart.cloud.consul;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus.Series;

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "测试";
    }

    @RequestMapping("/fallback")
    public String fallbackTest(){
        return "fallback test";
    }

    @RequestMapping("/myPath/hello1")
    public String myPath(String name){
        return "myPath "+name;
    }
}

package com.stuart.cloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("testConsulApp")
@Component
public interface TestService {

    @RequestMapping(value = "/test")
    String test();


}

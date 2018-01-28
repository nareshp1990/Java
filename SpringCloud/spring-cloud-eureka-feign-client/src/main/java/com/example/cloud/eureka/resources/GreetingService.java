package com.example.cloud.eureka.resources;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 26/12/17 7:02 PM
 */
@FeignClient(value = "spring-cloud-eureka-client")
public interface GreetingService {
    @RequestMapping(value = "/greeting",method = RequestMethod.GET)
    String greeting();
}

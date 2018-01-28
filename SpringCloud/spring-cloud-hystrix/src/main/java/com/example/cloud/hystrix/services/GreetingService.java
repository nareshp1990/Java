package com.example.cloud.hystrix.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 27/12/17 11:59 AM
 */
@Service
public class GreetingService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "defaultGreeting")
    public String getGreeting(String username) {
        return restTemplate
            .getForObject("http://localhost:9595/greeting/{username}",
                String.class, username);
    }

    private String defaultGreeting(String username) {
        return "Hello User!... from hystrix circuit";
    }
}

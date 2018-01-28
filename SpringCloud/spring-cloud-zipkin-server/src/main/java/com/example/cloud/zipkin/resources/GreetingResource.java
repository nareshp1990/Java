package com.example.cloud.zipkin.resources;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 29/12/17 11:36 PM
 */
@RestController
@Slf4j
public class GreetingResource {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{username}")
    public String getGreeting(@PathVariable String username) {
        log.info("###### Inside zipkin-server ######");
        return restTemplate
            .getForObject("http://localhost:9595/greeting/{username}",
                String.class, username);
    }
}

package com.example.cloud.hystrix;

import com.example.cloud.hystrix.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 27/12/17 12:03 PM
 */
@RestController
public class GreetingResource {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/get-greeting/{username}")
    public String getGreeting(@PathVariable("username") String username) {
        return greetingService.getGreeting(username);
    }
}

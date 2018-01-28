package com.example.cloud.hystrix.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 27/12/17 11:55 AM
 */
public interface GreetingResource {
    @GetMapping("/greeting/{username}")
    String greeting(@PathVariable("username") String username);
}

package com.example.cloud.hystrix.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 27/12/17 11:56 AM
 */
@RestController
public class GreetingResourceImpl implements GreetingResource {

    @Override
    public String greeting(@PathVariable String username) {
        return String.format("Hello %s!\n", username);
    }
}

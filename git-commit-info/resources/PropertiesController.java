package com.example.jackson.views.resources;

import com.example.jackson.views.git.config.GitProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 30/12/17 3:09 PM
 */
@RestController
@Slf4j
public class PropertiesController {

    private final GitProperties gitProperties;

    @Autowired
    PropertiesController(
        GitProperties gitProperties) {
        this.gitProperties = gitProperties;
    }

    @RequestMapping(value = "/version", method = RequestMethod.GET)
    GitProperties getVersion() {
        return gitProperties;
    }

}

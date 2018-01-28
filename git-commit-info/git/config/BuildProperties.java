package com.example.jackson.views.git.config;

import javax.annotation.PostConstruct;
import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 30/12/17 3:01 PM
 */
@Component
@Data
@ToString
@Slf4j
public class BuildProperties {

    private final String time;
    private final String userEmail;
    private final String userName;

    @Autowired
    public BuildProperties(@Value("${git.build.time}") String time,
        @Value("${git.build.user.email}") String userEmail,
        @Value("${git.build.user.name}") String userName) {
        this.time = time;
        this.userEmail = userEmail;
        this.userName = userName;
    }

    @PostConstruct
    public void writeGitCommitInformationToLog() {
        log.info("Application was built by using the Git commit: {}", this);
    }
}

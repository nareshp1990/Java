package com.example.jackson.views.git.config;

import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 30/12/17 3:02 PM
 */
@Component
@Data
@ToString
public class CommitProperties {

    private final String describe;
    private final String describeShort;
    private final String fullMessage;
    private final String id;
    private final String idAbbrev;
    private final String shortMessage;
    private final String time;
    private final String userEmail;
    private final String userName;

    @Autowired
    public CommitProperties(@Value("${git.commit.id.describe}") String describe,
        @Value("${git.commit.id.describe-short}") String describeShort,
        @Value("${git.commit.message.full}") String fullMessage,
        @Value("${git.commit.id}") String id,
        @Value("${git.commit.id.abbrev}") String idAbbrev,
        @Value("${git.commit.message.short}") String shortMessage,
        @Value("${git.commit.time}") String time,
        @Value("${git.commit.user.email}") String userEmail,
        @Value("${git.commit.user.name}") String userName) {
        this.describe = describe;
        this.describeShort = describeShort;
        this.fullMessage = fullMessage;
        this.id = id;
        this.idAbbrev = idAbbrev;
        this.shortMessage = shortMessage;
        this.time = time;
        this.userEmail = userEmail;
        this.userName = userName;
    }

}

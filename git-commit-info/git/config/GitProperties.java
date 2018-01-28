package com.example.jackson.views.git.config;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 30/12/17 3:03 PM
 */
@Component
@Data
@ToString
public class GitProperties {

    private final BuildProperties build;
    private final CommitProperties commit;
    private final boolean dirty;
    private final String remoteOriginUrl;
    private final String tags;
    private String branch;

    @Autowired
    public GitProperties(@Value("${git.branch}") String branch,
        BuildProperties build,
        CommitProperties commit,
        @Value("${git.dirty}") boolean dirty,
        @Value("${git.remote.origin.url}") String remoteOriginUrl,
        @Value("${git.tags}") String tags) {
        this.branch = branch;
        this.build = build;
        this.commit = commit;
        this.dirty = dirty;
        this.remoteOriginUrl = remoteOriginUrl;
        this.tags = tags;
    }

}

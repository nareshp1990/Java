package com.example.spring.data.rest.repositories;

import com.example.spring.data.rest.models.Note;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 30/12/17 10:22 AM
 */
@RepositoryRestResource(itemResourceRel = "notes",path = "notes")
public interface NoteRepository extends JpaRepository<Note,Long> {
    List<Note> findByTitle(@Param("title") String title);
    List<Note> findByTitleAndContent(@Param("title") String title,@Param("content") String content);
}

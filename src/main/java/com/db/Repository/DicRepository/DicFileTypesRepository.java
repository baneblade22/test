package com.db.Repository.DicRepository;

import com.db.Tables.Dictionary.DicFileTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource (path = "dicFileTypes")
public interface DicFileTypesRepository extends JpaRepository<DicFileTypes, Long> {

    List<DicFileTypes> findByTerm (@Param("term") String term);

}

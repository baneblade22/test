package com.db.Repository.DicRepository;

import com.db.Tables.Dictionary.DicStage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource (path = "dicStage")
public interface DicStageRepository extends JpaRepository<DicStage, Long>{

    List<DicStage> findByTerm(@Param("term") String term);

}

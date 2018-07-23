package com.db.Repository;

import com.db.Tables.ProcessingStage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "processingStage")
public interface ProcessingStageRepository extends JpaRepository<ProcessingStage, Long>{
    List<ProcessingStage> findByName(@Param("name")String name);
}

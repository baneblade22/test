package com.db.Repository;

import com.db.Tables.ProcessingStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource (path = "processingStatus")
public interface ProcessingStatusRepository extends JpaRepository<ProcessingStatus, Long>{
    List<ProcessingStatus> findByName(@Param("name")String name);
}

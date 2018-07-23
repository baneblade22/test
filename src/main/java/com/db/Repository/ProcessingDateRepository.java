package com.db.Repository;

import com.db.Tables.ProcessingData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource (path = "processingDate")
public interface ProcessingDateRepository extends JpaRepository<ProcessingData, Long>{
}

package com.db.Repository;

import com.db.Tables.AnalysisResults;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource (path = "analysisResults")
public interface AnalysisResultsRepository extends JpaRepository<AnalysisResults, Long> {

}

package com.db.Repository;

import com.db.Tables.AnalysisReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.sql.Date;
import java.util.List;

@RepositoryRestResource(path = "analysisReport")
public interface AnalysisReportRepository extends JpaRepository<AnalysisReport, Long>{
    List<AnalysisReport> findBySampleFastqId(@Param("fastqId") Long fastqId);
    List<AnalysisReport> findByDateCreate(@Param("date")Date date);

}

package com.db.Repository;

import com.db.Tables.Source;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "source")
public interface SourceRepository extends JpaRepository<Source, Long>{
    List<Source> findByExtId(@Param("extId") Long extId);
    List<Source> findByFullName(@Param("fullName") String fullName);
    List<Source> findByJournal(@Param("journal")String journal);
    List<Source> findByPubYear(@Param("year")Integer year);
}

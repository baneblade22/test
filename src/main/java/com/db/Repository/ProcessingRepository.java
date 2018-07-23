package com.db.Repository;

import com.db.Tables.Processing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.sql.Date;
import java.util.List;

@RepositoryRestResource(path = "processing")
public interface ProcessingRepository extends JpaRepository<Processing, Long>{
    List<Processing> findByDate(@Param("date")Date date);

}

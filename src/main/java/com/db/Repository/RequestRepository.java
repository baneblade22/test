package com.db.Repository;

import com.db.Tables.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.sql.Date;
import java.util.List;

@RepositoryRestResource (path = "request")
public interface RequestRepository extends JpaRepository<Request, Long>{
    List<Request> findByDateOfAcquiring(@Param("date")Date date);
    List<Request> findByGenotype(@Param("genotype")String genotype);
}

package com.db.Repository;

import com.db.Tables.Sample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource (path = "sample")
public interface SampleRepository extends JpaRepository<Sample, Long>{

}

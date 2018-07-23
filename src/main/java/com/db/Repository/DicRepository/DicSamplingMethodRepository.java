package com.db.Repository.DicRepository;

import com.db.Tables.Dictionary.DicSamplingMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource (path = "dicSamplingMethod")
public interface DicSamplingMethodRepository extends JpaRepository<DicSamplingMethod, Long>{

    List<DicSamplingMethod> findByTerm(@Param("term")String term);

}

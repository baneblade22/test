package com.db.Repository.DicRepository;

import com.db.Tables.Dictionary.DicPlatform;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource (path = "dicPlatform")
public interface DicPlatformRepository extends JpaRepository <DicPlatform, Long>{

    List <DicPlatform> findByTerm(@Param("term")String term);
}

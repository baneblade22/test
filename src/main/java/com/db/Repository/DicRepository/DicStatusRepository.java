package com.db.Repository.DicRepository;

import com.db.Tables.Dictionary.DicStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource (path = "dicStatus")
public interface DicStatusRepository extends JpaRepository <DicStatus, Long>{

    List<DicStatus> findByTerm(@Param("term")String term);
    List<DicStatus> findByTermRus(@Param("termRus") String termRus);

}

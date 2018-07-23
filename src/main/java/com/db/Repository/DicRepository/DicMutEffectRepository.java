package com.db.Repository.DicRepository;

import com.db.Tables.Dictionary.DicMutEffect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
@RepositoryRestResource (path = "dicMutEffect")
public interface DicMutEffectRepository extends JpaRepository<DicMutEffect, Long>{

    List<DicMutEffect> findByTerm(@Param("term")String term);
    List<DicMutEffect> findByFullName(@Param("fullName")String fullName);
    List<DicMutEffect> findByShortName(@Param("shortName")String shortName);
    List<DicMutEffect> findByNameRus(@Param("nameRus") String nameRus);
    List<DicMutEffect> findByFullNameRus(@Param("fullNameRus") String fullNameRus);
    List<DicMutEffect> findByShortNameRus(@Param("shortNameRus") String shortNameRus);


}

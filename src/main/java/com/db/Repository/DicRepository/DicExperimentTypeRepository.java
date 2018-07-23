package com.db.Repository.DicRepository;

import com.db.Tables.Dictionary.DicExperimentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource (path = "dicExperimentType")
public interface DicExperimentTypeRepository extends JpaRepository<DicExperimentType, Long>{

    List<DicExperimentType> findByTerm(@Param("term")String term);
    List<DicExperimentType> findByFullName(@Param("fullName")String fullName);
    List<DicExperimentType> findByShortName(@Param("shortName")String shortName);
    List<DicExperimentType> findByNameRus(@Param("nameRus") String nameRus);
    List<DicExperimentType> findByFullNameRus(@Param("fullNameRus") String fullNameRus);
    List<DicExperimentType> findByShortNameRus(@Param("shortNameRus") String shortNameRus);

}

package com.db.Repository.DicRepository;

import com.db.Tables.Dictionary.DicReadUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource (path = "dicReadUnit")
public interface DicReadUnitRepository extends JpaRepository<DicReadUnit, Long>{

    List<DicReadUnit> findByTerm(@Param("term")String term);
    List<DicReadUnit> findByFullName(@Param("fullName")String fullName);
    List<DicReadUnit> findByShortName(@Param("shortName")String shortName);
    List<DicReadUnit> findByNameRus(@Param("nameRus") String nameRus);
    List<DicReadUnit> findByFullNameRus(@Param("fullNameRus") String fullNameRus);
    List<DicReadUnit> findByShortNameRus(@Param("shortNameRus") String shortNameRus);
}

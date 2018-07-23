package com.db.Repository.DicRepository;

import com.db.Tables.Dictionary.DicZygocity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource (path = "dicZigocity")
public interface DicZygocityRepository extends JpaRepository<DicZygocity, Long>{

    List<DicZygocity> findByTerm(@Param("term")String term);
    List<DicZygocity> findByFullName(@Param("fullName")String fullName);
    List<DicZygocity> findByShortName(@Param("shortName")String shortName);
    List<DicZygocity> findByNameRus(@Param("nameRus") String nameRus);
    List<DicZygocity> findByFullNameRus(@Param("fullNameRus") String fullNameRus);
    List<DicZygocity> findByShortNameRus(@Param("shortNameRus") String shortNameRus);

}

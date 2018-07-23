package com.db.Repository.DicRepository;

import com.db.Tables.Dictionary.DicMutType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource (path = "dicMutType")
public interface DicMutTypeRepository extends JpaRepository<DicMutType, Long> {

    List<DicMutType> findByTerm(@Param("term")String term);
    List<DicMutType> findByFullName(@Param("fullName")String fullName);
    List<DicMutType> findByShortName(@Param("shortName")String shortName);
    List<DicMutType> findByNameRus(@Param("nameRus") String nameRus);
    List<DicMutType> findByFullNameRus(@Param("fullNameRus") String fullNameRus);
    List<DicMutType> findByShortNameRus(@Param("shortNameRus") String shortNameRus);

}

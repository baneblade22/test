package com.db.Repository.DicRepository;

import com.db.Tables.Dictionary.DicTraitName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
@RepositoryRestResource(path ="dicTraitName")
public interface DicTraitNameRepository extends JpaRepository<DicTraitName, Long> {

    List<DicTraitName> findByTerm(@Param("term")String term);
    List<DicTraitName> findByFullName(@Param("fullName")String fullName);
    List<DicTraitName> findByShortName(@Param("shortName")String shortName);
    List<DicTraitName> findByNameRus(@Param("nameRus") String nameRus);
    List<DicTraitName> findByFullNameRus(@Param("fullNameRus") String fullNameRus);
    List<DicTraitName> findByShortNameRus(@Param("shortNameRus") String shortNameRus);

}

package com.db.Repository.DicRepository;

import com.db.Tables.Dictionary.DicChromosome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource (path = "dicChromosome")
public interface DicChromosomeRepository extends JpaRepository <DicChromosome , Long> {

    List<DicChromosome> findByTerm(@Param("term")String term);
    List<DicChromosome> findByFullName(@Param("fullName")String fullName);
    List<DicChromosome> findByShortName(@Param("shortName")String shortName);
    List<DicChromosome> findByNameRus(@Param("nameRus") String nameRus);
    List<DicChromosome> findByFullNameRus(@Param("fullNameRus") String fullNameRus);
    List<DicChromosome> findByShortNameRus(@Param("shortNameRus") String shortNameRus);


}
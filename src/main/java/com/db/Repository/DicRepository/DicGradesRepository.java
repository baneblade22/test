package com.db.Repository.DicRepository;

import com.db.Tables.Dictionary.DicGrades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource (path = "dicGrades")
public interface DicGradesRepository extends JpaRepository<DicGrades, Long>{

    List<DicGrades> findByTerm (@Param("term") String term);
}

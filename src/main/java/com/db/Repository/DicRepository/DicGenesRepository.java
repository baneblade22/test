package com.db.Repository.DicRepository;

import com.db.Tables.Dictionary.DicGenes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource (path = "dicGenes")
public interface DicGenesRepository extends JpaRepository<DicGenes, Long>{

    List<DicGenes> findByFilledId(@Param("filledId")long filledId);
    List<DicGenes> findBySymbol(@Param("symbol")String symbol);
    List<DicGenes> findByLocustag(@Param("locustaq")String locustaq);
    List<DicGenes> findByChromosome(@Param("chromosome") String chromosome);
    List<DicGenes> findByTypeOfGene(@Param("typeOfGene") String typeOfGene);


}

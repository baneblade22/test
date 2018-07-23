package com.db.Repository;

import com.db.Tables.CultivarCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.sql.Date;
import java.util.List;

@RepositoryRestResource (path = "cultivarCard")
public interface CultivarCardRepository extends JpaRepository<CultivarCard, Long>{
    List<CultivarCard> findByName(@Param("name")String name);
    List<CultivarCard> findByCreatorName(@Param("creatorName")String creatorName);
    List<CultivarCard> findByDateOfCreation(@Param("date")Date date);
}

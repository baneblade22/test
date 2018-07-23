package com.db.Repository;

import com.db.Tables.Characteristics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.sql.Date;
import java.util.List;

@RepositoryRestResource (path = "characteristics")
public interface CharacteristicsRepository extends JpaRepository<Characteristics, Long> {
    List<Characteristics> findByDate(@Param("date")Date date);

}

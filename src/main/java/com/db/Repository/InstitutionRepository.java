package com.db.Repository;

import com.db.Tables.Institution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@CrossOrigin
@RepositoryRestResource(path = "institution")
public interface InstitutionRepository extends JpaRepository<Institution, Long>{

    List<Institution> findByName(@Param("name") String name);
    List<Institution> findByShortName(@Param("shortName") String shortName);
    List<Institution> findByZipCode(@Param("zipCode")String zipCode);
    List<Institution> findByCity(@Param("city")String city);
    List<Institution> findByHouseNum(@Param("houseNum") String house);

}

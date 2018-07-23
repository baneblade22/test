package com.db.Repository.DicRepository;

import com.db.Tables.Dictionary.DicStoragePlace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource (path = "dicStoragePlace")
public interface DicStoragePlaceRepository extends JpaRepository<DicStoragePlace,Long>{

    List<DicStoragePlace> findByLocker(@Param("locker")String locker);
    List<DicStoragePlace> findByShelf(@Param("shelf")String shelf);
    List<DicStoragePlace> findByCell(@Param("cell")String cell);

}

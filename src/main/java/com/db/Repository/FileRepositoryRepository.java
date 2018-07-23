package com.db.Repository;

import com.db.Tables.FileRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource (path = "fileRepository")
public interface FileRepositoryRepository extends JpaRepository<FileRepository, Long>{
    List<FileRepository> findByFileName(@Param("fileName")String fileName);

}

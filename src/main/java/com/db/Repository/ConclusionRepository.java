package com.db.Repository;

import com.db.Tables.Conclusion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource (path = "conclusion")
public interface ConclusionRepository extends JpaRepository<Conclusion, Long>{

}

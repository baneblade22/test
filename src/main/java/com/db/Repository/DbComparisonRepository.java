package com.db.Repository;

import com.db.Tables.DbComparison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "dbComparison")
public interface DbComparisonRepository extends JpaRepository<DbComparison, Long>{

}

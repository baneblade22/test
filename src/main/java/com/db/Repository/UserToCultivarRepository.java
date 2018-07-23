package com.db.Repository;

import com.db.Tables.UserToCultivar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "userToCultivar")
public interface UserToCultivarRepository extends JpaRepository<UserToCultivar, Long>{
}

package com.db.Repository.UserTablesRepository;

import com.db.Tables.UserTables.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "account")
public interface AccountRepository extends JpaRepository<Account, Long> {

    List <Account> findByLogin(@Param("login")String login);

}

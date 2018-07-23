package com.db.Repository;

import com.db.Tables.Mutation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "mutation")
public interface MutationRepository extends JpaRepository <Mutation, Long>{
    List<Mutation> findBySbSyntax(@Param("sbSyntax") String sbSyntax);
    List<Mutation> findBySbCount(@Param("sbCount")Long sbCount);
}

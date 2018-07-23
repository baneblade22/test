package com.db.Repository;

import com.db.Tables.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource (path = "department")
public interface DepartmentRepository extends JpaRepository<Department, Long>{
    List<Department> findByDeptNum(@Param("deptNum") Integer num);
    List<Department> findByDeptName(@Param("name")String name);
    List<Department> findByTelNumber(@Param("phoneNumber")String phoneNumber);
}

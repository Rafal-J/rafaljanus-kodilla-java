package com.kodilla.patterns2.facade.employees.manytomany.dao;

import com.kodilla.patterns2.facade.employees.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    @Query
    List<Employee> employeeWithCertainLastname(@Param("LASTNAME") String lastname);

    @Query
    List<Employee> employeeWithNameLike(@Param("NAMELIKE") String namelike);

    @Query(nativeQuery = true)
    void deleteFromJoinTable();
}

package com.kodilla.patterns2.facade.employees.manytomany.dao;

import com.kodilla.patterns2.facade.employees.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    @Query(nativeQuery = true)
    List<Company> firstThreeLettersOfName(@Param("THREELETTERS") String threeLetters);

    @Query
    List<Company> companyWithNameLike(@Param("NAMELIKE") String nameLike);
}
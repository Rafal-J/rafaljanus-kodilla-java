package com.kodilla.patterns2.facade.employees;

import com.kodilla.patterns2.facade.employees.manytomany.Employee;
import com.kodilla.patterns2.facade.employees.manytomany.dao.CompanyDao;
import com.kodilla.patterns2.facade.employees.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeSearchFacadeTest {
    @Autowired
    private EmployeeSearchFacade employeeSearchFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testFindEntitiesWithNameLike() {
        List<String> employeeNamesLike = employeeSearchFacade.findNameLike("Employee", "s");
        Assert.assertTrue(employeeNamesLike.size() == 3);

        List<String> companyNamesLike = employeeSearchFacade.findNameLike("Company", "s");
        Assert.assertTrue(companyNamesLike.size() == 2);

        employeeDao.deleteAll();
        companyDao.deleteAll();
    }


}
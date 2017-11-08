package com.kodilla.patterns2.facade.employees;

import com.kodilla.patterns2.facade.employees.manytomany.Company;
import com.kodilla.patterns2.facade.employees.manytomany.Employee;
import com.kodilla.patterns2.facade.employees.manytomany.dao.CompanyDao;
import com.kodilla.patterns2.facade.employees.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeSearchFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    private Company softwareMachine;
    private Company dataMaesters;
    private Company greyMatter;

    private Employee johnSmith;
    private Employee stephanieClarckson;
    private Employee lindaKovalsky;

    public EmployeeSearchFacade() {
        johnSmith = new Employee("John", "Smith");
        stephanieClarckson = new Employee("Stephanie", "Clarckson");
        lindaKovalsky = new Employee("Linda", "Kovalsky");

        softwareMachine = new Company("Software Machine");
        dataMaesters = new Company("Data Maesters");
        greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);
    }

    public List<String> findNameLike(String type, String nameLike) {
        if (type.equals("Employee")) {
            List<String> employeesNames = findEmployeeWithNameLike("%" + nameLike + "%").stream()
                    .map(c -> c.getLastname())
                    .collect(Collectors.toList());
            return employeesNames;
        }

        List<String> companiesNames = findCompanyWithNameLike(nameLike).stream()
                .map(c -> c.getName())
                .collect(Collectors.toList());
        return companiesNames;
        }

    public List<Employee> findEmployeeWithNameLike(String nameLike) {
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        List<Employee> employeesLike = employeeDao.employeeWithNameLike("%s%");



        return employeesLike;
    }

    public List<Company> findCompanyWithNameLike(String nameLike) {
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        List<Company> companiesLike = companyDao.companyWithNameLike("%s%");

        return companiesLike;
    }
}

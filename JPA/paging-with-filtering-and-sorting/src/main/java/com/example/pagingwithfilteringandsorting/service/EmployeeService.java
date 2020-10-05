package com.example.pagingwithfilteringandsorting.service;

import com.example.pagingwithfilteringandsorting.model.Employee;
import com.example.pagingwithfilteringandsorting.model.EmployeePage;
import com.example.pagingwithfilteringandsorting.model.EmployeeSearchCriteria;
import com.example.pagingwithfilteringandsorting.repository.EmployeeCriteriaRepository;
import com.example.pagingwithfilteringandsorting.repository.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeCriteriaRepository employeeCriteriaRepository;

    public EmployeeService(EmployeeRepository employeeRepository, EmployeeCriteriaRepository employeeCriteriaRepository) {
        this.employeeRepository = employeeRepository;
        this.employeeCriteriaRepository = employeeCriteriaRepository;
    }

    public Page<Employee> getEmployees(EmployeePage employeePage, EmployeeSearchCriteria employeeSearchCriteria) {
        return employeeCriteriaRepository.findAllWithFilters(employeePage, employeeSearchCriteria);
    }

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);

    }
}

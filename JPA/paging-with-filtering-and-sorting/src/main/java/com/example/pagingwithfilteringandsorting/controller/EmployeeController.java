package com.example.pagingwithfilteringandsorting.controller;

import com.example.pagingwithfilteringandsorting.model.Employee;
import com.example.pagingwithfilteringandsorting.model.EmployeePage;
import com.example.pagingwithfilteringandsorting.model.EmployeeSearchCriteria;
import com.example.pagingwithfilteringandsorting.service.EmployeeService;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpCookie;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public ResponseEntity<Page<Employee>> getEmployees(EmployeePage employeePage, EmployeeSearchCriteria employeeSearchCriteria) {
        return new ResponseEntity<>(employeeService.getEmployees(employeePage, employeeSearchCriteria), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<>(employeeService.addEmployee(employee), HttpStatus.OK);
    }
}

package com.example.pagingwithfilteringandsorting.repository;

import com.example.pagingwithfilteringandsorting.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}

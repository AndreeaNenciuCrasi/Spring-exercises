package com.example.onetomanyunidirectionalrelationship.repository;

import com.example.onetomanyunidirectionalrelationship.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}

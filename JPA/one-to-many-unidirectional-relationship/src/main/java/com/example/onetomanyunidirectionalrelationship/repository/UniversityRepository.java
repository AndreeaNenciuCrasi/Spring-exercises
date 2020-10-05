package com.example.onetomanyunidirectionalrelationship.repository;

import com.example.onetomanyunidirectionalrelationship.model.University;
import org.springframework.data.repository.CrudRepository;

public interface UniversityRepository extends CrudRepository<University, Long> {
}

package com.example.manytomanybidirectionalrelationship.repository;

import com.example.manytomanybidirectionalrelationship.model.Viewer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewerRepository extends CrudRepository<Viewer, Long> {
}

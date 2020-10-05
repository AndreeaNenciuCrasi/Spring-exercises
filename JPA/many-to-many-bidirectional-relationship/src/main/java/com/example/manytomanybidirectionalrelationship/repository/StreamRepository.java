package com.example.manytomanybidirectionalrelationship.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.manytomanybidirectionalrelationship.model.Stream;


@Repository
public interface StreamRepository extends CrudRepository<Stream, Long> {
}

package com.example.onetoonebidirectionalrelationship.repository;

import com.example.onetoonebidirectionalrelationship.model.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}

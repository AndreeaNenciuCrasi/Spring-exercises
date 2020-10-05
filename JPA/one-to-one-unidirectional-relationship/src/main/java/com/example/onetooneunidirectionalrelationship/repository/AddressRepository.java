package com.example.onetooneunidirectionalrelationship.repository;


import com.example.onetooneunidirectionalrelationship.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {
}

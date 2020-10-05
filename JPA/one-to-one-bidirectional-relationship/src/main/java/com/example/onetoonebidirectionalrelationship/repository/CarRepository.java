package com.example.onetoonebidirectionalrelationship.repository;

import com.example.onetoonebidirectionalrelationship.model.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
}

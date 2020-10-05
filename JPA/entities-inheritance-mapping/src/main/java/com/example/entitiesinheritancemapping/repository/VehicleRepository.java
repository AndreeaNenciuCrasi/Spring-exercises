package com.example.entitiesinheritancemapping.repository;

import com.example.entitiesinheritancemapping.model.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface VehicleRepository extends CrudRepository<Vehicle, Long> {
}

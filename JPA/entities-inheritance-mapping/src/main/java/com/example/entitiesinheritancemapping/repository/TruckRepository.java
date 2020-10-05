package com.example.entitiesinheritancemapping.repository;


import com.example.entitiesinheritancemapping.model.Truck;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckRepository extends VehicleRepository {
}

package com.example.entitiesinheritancemapping.repository;


import com.example.entitiesinheritancemapping.model.Tank;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@Repository
public interface TankRepository extends VehicleRepository {
}

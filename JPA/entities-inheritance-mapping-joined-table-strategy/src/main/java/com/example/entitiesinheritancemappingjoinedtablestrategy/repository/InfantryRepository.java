package com.example.entitiesinheritancemappingjoinedtablestrategy.repository;


import com.example.entitiesinheritancemappingjoinedtablestrategy.model.Infantry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface InfantryRepository extends CrudRepository<Infantry, Long> {
}

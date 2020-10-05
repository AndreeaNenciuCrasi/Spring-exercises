package com.example.dbinitialization.repository;

import com.example.dbinitialization.model.TBL_EMPLOYEES;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TBL_EMPLOYEESRepository extends CrudRepository<TBL_EMPLOYEES, Long> {
}

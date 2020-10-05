package com.example.onetomanybidirectionalrelationship.repository;

import com.example.onetomanybidirectionalrelationship.model.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
}

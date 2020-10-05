package com.example.onetomanybidirectionalrelationship.repository;

import com.example.onetomanybidirectionalrelationship.model.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart, Long> {
}

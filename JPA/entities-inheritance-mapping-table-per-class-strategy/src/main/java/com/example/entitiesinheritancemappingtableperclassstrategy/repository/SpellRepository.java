package com.example.entitiesinheritancemappingtableperclassstrategy.repository;

import com.example.entitiesinheritancemappingtableperclassstrategy.model.Spell;
import org.springframework.context.annotation.Primary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public interface SpellRepository extends CrudRepository<Spell, Long> {
}

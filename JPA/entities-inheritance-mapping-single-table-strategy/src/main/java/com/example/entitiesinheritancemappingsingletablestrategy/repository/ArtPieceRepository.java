package com.example.entitiesinheritancemappingsingletablestrategy.repository;

import com.example.entitiesinheritancemappingsingletablestrategy.model.ArtPiece;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ArtPieceRepository extends CrudRepository<ArtPiece, Long> {
}

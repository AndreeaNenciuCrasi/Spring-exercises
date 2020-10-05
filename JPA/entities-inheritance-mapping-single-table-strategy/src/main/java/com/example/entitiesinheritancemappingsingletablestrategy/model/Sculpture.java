package com.example.entitiesinheritancemappingsingletablestrategy.model;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="SCULPTURE")
public class Sculpture extends ArtPiece{

    @Enumerated(value = EnumType.STRING)
    private Material material;
    private Double weight;

    public Sculpture() {
    }

    public Sculpture(String author, Material material, Double weight) {
        super(author);
        this.material = material;
        this.weight = weight;
    }
}

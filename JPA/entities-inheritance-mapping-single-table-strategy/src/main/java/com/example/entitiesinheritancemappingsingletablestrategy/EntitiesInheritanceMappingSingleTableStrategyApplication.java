package com.example.entitiesinheritancemappingsingletablestrategy;

import com.example.entitiesinheritancemappingsingletablestrategy.model.*;
import com.example.entitiesinheritancemappingsingletablestrategy.repository.ArtPieceRepository;
import com.example.entitiesinheritancemappingsingletablestrategy.repository.PaintingRepository;
import com.example.entitiesinheritancemappingsingletablestrategy.repository.SculptureRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EntitiesInheritanceMappingSingleTableStrategyApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(EntitiesInheritanceMappingSingleTableStrategyApplication.class, args);
        ArtPieceRepository paintingRepository =
                configurableApplicationContext.getBean(PaintingRepository.class);
        ArtPieceRepository sculptureRepository =
                configurableApplicationContext.getBean(SculptureRepository.class);

        ArtPiece sculpture = new Sculpture("John Doe", Material.WOOD, 200.2);
        ArtPiece painting = new Painting("Tom Smith", PaintingTechnique.OIL, 25.5, 44.9);

        sculptureRepository.save(sculpture);
        paintingRepository.save(painting);
    }

}

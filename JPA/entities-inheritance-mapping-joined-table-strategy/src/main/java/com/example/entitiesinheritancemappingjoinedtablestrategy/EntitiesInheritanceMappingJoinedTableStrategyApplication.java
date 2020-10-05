package com.example.entitiesinheritancemappingjoinedtablestrategy;

import com.example.entitiesinheritancemappingjoinedtablestrategy.model.Archer;
import com.example.entitiesinheritancemappingjoinedtablestrategy.model.Infantry;
import com.example.entitiesinheritancemappingjoinedtablestrategy.model.InfantryType;
import com.example.entitiesinheritancemappingjoinedtablestrategy.model.Knight;
import com.example.entitiesinheritancemappingjoinedtablestrategy.repository.ArcherRepository;
import com.example.entitiesinheritancemappingjoinedtablestrategy.repository.InfantryRepository;
import com.example.entitiesinheritancemappingjoinedtablestrategy.repository.KnightRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EntitiesInheritanceMappingJoinedTableStrategyApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(EntitiesInheritanceMappingJoinedTableStrategyApplication.class, args);
        InfantryRepository archerRepository = configurableApplicationContext.getBean(ArcherRepository.class);
        InfantryRepository knightRepository = configurableApplicationContext.getBean(KnightRepository.class);

        Infantry archer = new Archer(InfantryType.LIGHT, 300, 500, 100, 1000);
        Infantry knight = new Knight(InfantryType.HEAVY, 280, 1000, 300, true);

        archerRepository.save(archer);
        knightRepository.save(knight);
    }

}

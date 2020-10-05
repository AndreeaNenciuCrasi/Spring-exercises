package com.example.entitiesinheritancemappingtableperclassstrategy;

import com.example.entitiesinheritancemappingtableperclassstrategy.model.FireSpell;
import com.example.entitiesinheritancemappingtableperclassstrategy.model.FrostSpell;
import com.example.entitiesinheritancemappingtableperclassstrategy.model.Spell;
import com.example.entitiesinheritancemappingtableperclassstrategy.repository.FireSpellRepository;
import com.example.entitiesinheritancemappingtableperclassstrategy.repository.FrostSpellRepository;
import com.example.entitiesinheritancemappingtableperclassstrategy.repository.SpellRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EntitiesInheritanceMappingTablePerClassStrategyApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext =
        SpringApplication.run(EntitiesInheritanceMappingTablePerClassStrategyApplication.class, args);
        SpellRepository spellRepository = configurableApplicationContext.getBean(SpellRepository.class);
        SpellRepository frostSpellRepository = configurableApplicationContext.getBean(FrostSpellRepository.class);
        SpellRepository fireSpellRepository = configurableApplicationContext.getBean(FireSpellRepository.class);

        Spell arcaneSpark = new Spell("Arcane Spark", 50, 60);
        Spell fireBall = new FireSpell("FireBall", 100, 100, 100, 2000);
        Spell meteorShower = new FireSpell("Meteor Shower", 400, 300, 300, 3000);
        Spell frostBolt = new FrostSpell("Frost Bolt", 80, 80, true, 300);
        spellRepository.save(arcaneSpark);
        fireSpellRepository.save(fireBall);
        fireSpellRepository.save(meteorShower);
        frostSpellRepository.save(frostBolt);
    }

}

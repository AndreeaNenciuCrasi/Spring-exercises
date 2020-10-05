package com.example.entitiesinheritancemapping;

import com.example.entitiesinheritancemapping.model.Tank;
import com.example.entitiesinheritancemapping.model.Truck;
import com.example.entitiesinheritancemapping.repository.TankRepository;
import com.example.entitiesinheritancemapping.repository.TruckRepository;
import com.example.entitiesinheritancemapping.repository.VehicleRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EntitiesInheritanceMappingApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(EntitiesInheritanceMappingApplication.class, args);

        VehicleRepository tankRepository = configurableApplicationContext.getBean(TankRepository.class);
        VehicleRepository truckRepository = configurableApplicationContext.getBean(TruckRepository.class);

        Tank myTank = new Tank("T-150", 5, 500);
        Truck myTruck = new Truck("200M", 2, 36, true);

        tankRepository.save(myTank);
        truckRepository.save(myTruck);
    }

}

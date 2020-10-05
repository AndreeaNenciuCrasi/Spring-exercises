package com.example.onetoonebidirectionalrelationship;

import com.example.onetoonebidirectionalrelationship.model.Car;
import com.example.onetoonebidirectionalrelationship.model.Owner;
import com.example.onetoonebidirectionalrelationship.repository.CarRepository;
import com.example.onetoonebidirectionalrelationship.repository.OwnerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class OneToOneBidirectionalRelationshipApplication {

    private static final Logger log = LoggerFactory.getLogger(OneToOneBidirectionalRelationshipApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(OneToOneBidirectionalRelationshipApplication.class, args);

        CarRepository carRepository = configurableApplicationContext.getBean(CarRepository.class);
        OwnerRepository ownerRepository = configurableApplicationContext.getBean(OwnerRepository.class);

        Car car = new Car("m200");
        carRepository.save(car);
        Owner owner = new Owner("John Doe");
        owner.setCar(car);
        ownerRepository.save(owner);

        Optional<Car> optionalCar = carRepository.findById(1L);
        Optional<Owner> optionalOwner = ownerRepository.findById(2L);

        if (optionalCar.isPresent() && optionalOwner.isPresent()) {
            log.info(optionalCar.get() + " is owned by: " + optionalCar.get().getOwner());
            log.info(optionalOwner.get() + " has a car: " + optionalOwner.get().getCar());
        }

    }

}

package com.example.onetooneunidirectionalrelationship;

import com.example.onetooneunidirectionalrelationship.model.Address;
import com.example.onetooneunidirectionalrelationship.model.User;
import com.example.onetooneunidirectionalrelationship.repository.AddressRepository;
import com.example.onetooneunidirectionalrelationship.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OneToOneUnidirectionalRelationshipApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(OneToOneUnidirectionalRelationshipApplication.class, args);

        AddressRepository addressRepository = configurableApplicationContext.getBean(AddressRepository.class);
        UserRepository userRepository = configurableApplicationContext.getBean(UserRepository.class);

        Address address = new Address("Home st.");
        addressRepository.save(address);

        User user = new User("John Doe", address);
        userRepository.save(user);
    }

}

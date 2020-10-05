package com.example.dbinitialization;

import com.example.dbinitialization.model.TBL_EMPLOYEES;
import com.example.dbinitialization.repository.TBL_EMPLOYEESRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DbInitializationApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(DbInitializationApplication.class, args);
        TBL_EMPLOYEESRepository employeeRepository = configurableApplicationContext.getBean(TBL_EMPLOYEESRepository.class);

        TBL_EMPLOYEES employee = new TBL_EMPLOYEES("Chris", "Anderson", "chris@yahoo.com", 35);
        employeeRepository.save(employee);
    }

}

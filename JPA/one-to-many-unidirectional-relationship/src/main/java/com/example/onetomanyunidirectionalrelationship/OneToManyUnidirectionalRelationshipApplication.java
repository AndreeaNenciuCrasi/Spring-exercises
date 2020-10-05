package com.example.onetomanyunidirectionalrelationship;

import com.example.onetomanyunidirectionalrelationship.model.Student;
import com.example.onetomanyunidirectionalrelationship.model.University;
import com.example.onetomanyunidirectionalrelationship.repository.StudentRepository;
import com.example.onetomanyunidirectionalrelationship.repository.UniversityRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class OneToManyUnidirectionalRelationshipApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(OneToManyUnidirectionalRelationshipApplication.class, args);
        UniversityRepository universityRepository = configurableApplicationContext.getBean(UniversityRepository.class);
        StudentRepository studentRepository = configurableApplicationContext.getBean(StudentRepository.class);

        Student firstStudent = new Student("1111");
        Student secondStudent = new Student("1112");
        List<Student> students = Arrays.asList(firstStudent, secondStudent);
        University university = new University("UoC", students);
        universityRepository.save(university);
    }

}

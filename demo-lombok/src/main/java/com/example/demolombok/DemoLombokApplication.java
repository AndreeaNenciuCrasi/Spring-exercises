package com.example.demolombok;

import com.example.demolombok.model.Student;
import com.example.demolombok.model.Teacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;


@SpringBootApplication
public class DemoLombokApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoLombokApplication.class, args);
        Student student = new Student("john", "john@codecool.com", LocalDate.of(1987, 2, 12));
        printStudent(student);

        Student buildedStudent = Student.builder().email("new@codecool.com").birthDate(LocalDate.of(1999, 3, 19))
                .build();
        printStudent(buildedStudent);

        Teacher peter = Teacher.builder()
                .name("Peter")
                .student(student)
                .student(buildedStudent)
                .build();
        System.out.println(peter);

        System.out.println(Teacher.builder().name("Olive").student(buildedStudent).build());

    }

    private static void printStudent(Student student) {
        System.out.println(student);
    }

}

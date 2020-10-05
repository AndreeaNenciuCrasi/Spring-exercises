package com.example.pagingandsortingrepository.controller;

import com.example.pagingandsortingrepository.model.Student;
import com.example.pagingandsortingrepository.model.StudentPage;
import com.example.pagingandsortingrepository.service.StudentService;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<Page<Student>> getStudents(StudentPage studentPage){
        return new ResponseEntity<>(studentService.getStudents(studentPage), HttpStatus.OK);
    }

    @PostMapping
    public  ResponseEntity<Student> addStudent(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.addStudent(student), HttpStatus.OK);
    }
}

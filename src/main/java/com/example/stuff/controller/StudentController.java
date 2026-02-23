package com.example.stuff.controller;

import com.example.stuff.entity.Student;
import com.example.stuff.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/age/{age}")
    public List<Student> getStudentsWithAgeGreaterThan(@PathVariable int age) {
        return studentService.getAllStudentsWithAgeGreaterThan(age);
    }
}

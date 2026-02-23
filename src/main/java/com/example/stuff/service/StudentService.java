package com.example.stuff.service;

import com.example.stuff.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudentsWithAgeGreaterThan(int age);
}

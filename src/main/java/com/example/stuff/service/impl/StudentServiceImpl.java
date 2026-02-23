package com.example.stuff.service.impl;

import com.example.stuff.entity.Student;
import com.example.stuff.repository.StudentRepository;
import com.example.stuff.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudentsWithAgeGreaterThan(int age) {
        return studentRepository.findByAgeGreaterThan(age);
    }
}

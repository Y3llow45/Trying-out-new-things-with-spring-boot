package com.example.stuff.repository;

import com.example.stuff.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    public Student findByFirstName(String firstName);
    public List<Student> findByAgeGreaterThan(Integer age);
}

package com.example.stuff;

import com.example.stuff.entity.Student;
import com.example.stuff.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StuffApplication {

	public static void main(String[] args) {

		SpringApplication.run(StuffApplication.class, args);
	}

	/*@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return args -> {
			Student student = new Student("John2", "Doe2", "asd2@gmail.com", 12);
			studentRepository.save(student);

		};
	}*/
}

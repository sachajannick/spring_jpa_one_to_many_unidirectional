package com.example.jpaonetomanyunidirectional;

import com.example.jpaonetomanyunidirectional.model.Student;
import com.example.jpaonetomanyunidirectional.model.University;
import com.example.jpaonetomanyunidirectional.repository.StudentRepository;
import com.example.jpaonetomanyunidirectional.repository.UniversityRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class JpaOneToManyUnidirectionalApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(JpaOneToManyUnidirectionalApplication.class, args);

		UniversityRepository universityRepository  = configurableApplicationContext
				.getBean(UniversityRepository.class);
		StudentRepository studentRepository = configurableApplicationContext
				.getBean(StudentRepository.class);

		Student firstStudent = new Student("1111");
		Student secondStudent = new Student("1112");
		Student thirdStudent = new Student("1113");
		studentRepository.save(thirdStudent);

		List<Student> students = Arrays.asList(firstStudent, secondStudent);

		University university = new University("UoC", students);

		universityRepository.save(university);
		universityRepository.delete(university);
	}
}

package com.example.jpaonetomanyunidirectional.repository;

import com.example.jpaonetomanyunidirectional.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
}

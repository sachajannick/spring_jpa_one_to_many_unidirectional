package com.example.jpaonetomanyunidirectional.repository;

import com.example.jpaonetomanyunidirectional.model.University;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository extends CrudRepository<University, Long> {
}

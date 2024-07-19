package com.todos.todos.repos;

import com.todos.todos.model.entities.PatientRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends CrudRepository<PatientRecord, Integer> {
}

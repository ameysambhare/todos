package com.todos.todos.repos;

import com.todos.todos.model.entities.AppointmentRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends CrudRepository<AppointmentRecord, Integer> {
}

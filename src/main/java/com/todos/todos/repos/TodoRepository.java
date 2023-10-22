package com.todos.todos.repos;

import com.todos.todos.model.entities.TodoTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<TodoTable, Integer> {
}

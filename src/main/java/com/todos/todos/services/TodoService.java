package com.todos.todos.services;

import com.todos.todos.model.request.TodoRequest;
import com.todos.todos.model.response.TodoResponse;

import java.util.List;

public interface TodoService {
    void save(TodoRequest request);
    List<TodoResponse> getAllTodos();
    TodoResponse getATodo(int id);
    void delete(int id);
    void update(TodoRequest request);
}

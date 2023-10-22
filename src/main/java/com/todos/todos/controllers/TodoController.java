package com.todos.todos.controllers;

import com.todos.todos.model.request.TodoRequest;
import com.todos.todos.model.response.TodoResponse;
import com.todos.todos.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
@CrossOrigin("*")
public class TodoController {
    @Autowired
    TodoService todoServiceTable;

    @GetMapping
    public List<TodoResponse> getTodos() {
        return todoServiceTable.getAllTodos();
    }

    @GetMapping("/{id}")
    public TodoResponse getATodo(@PathVariable ("id") Integer id) {
        return todoServiceTable.getATodo(id);
    }

    @PostMapping
    public void addATodo(@RequestBody TodoRequest todoRequest) {
        todoServiceTable.save(todoRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteATodo(@PathVariable ("id") Integer id) {
        todoServiceTable.delete(id);
    }

    @PatchMapping
    public void updateStatus (@RequestBody TodoRequest todoRequest){
        todoServiceTable.update(todoRequest);
    }


}

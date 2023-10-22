package com.todos.todos.services;

import com.todos.todos.model.entities.TodoTable;
import com.todos.todos.model.request.TodoRequest;
import com.todos.todos.model.response.TodoResponse;
import com.todos.todos.repos.TodoRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Data
public class TodoServiceDatabase implements TodoService{
    @Autowired
    TodoRepository todoRepository;

    @Override
    public void save(TodoRequest request) {
        TodoTable todoTable = new TodoTable();
        todoTable.setTodoValue(request.getTodoDescription());
        todoTable.setStatus(request.getCompletionStatus());
        todoRepository.save(todoTable);
    }

    @Override
    public List<TodoResponse> getAllTodos() {
        Iterable<TodoTable> todoTables = todoRepository.findAll();
        List<TodoResponse> todoResponseList = new ArrayList<>();
        todoTables.forEach(todoTable -> {
            TodoResponse todoResponse = new TodoResponse();
            todoResponse.setTodoValue(todoTable.getTodoValue());
            todoResponse.setId(todoTable.getId());
            todoResponse.setCompletionStatus(todoTable.getStatus());
            todoResponseList.add(todoResponse);
        });
        return todoResponseList;
    }

    @Override
    public TodoResponse getATodo(int id) {
        Optional<TodoTable> optionalRecord =  todoRepository.findById(id);
        if(optionalRecord.isPresent()) {
            TodoResponse todoResponse =  new TodoResponse();
            todoResponse.setTodoValue(optionalRecord.get().getTodoValue());
            todoResponse.setId(optionalRecord.get().getId());
            todoResponse.setCompletionStatus(optionalRecord.get().getStatus());
            return todoResponse;
        }
        throw new RuntimeException("Record not found. Please check ");
    }

    @Override
    public void delete(int id) {
        todoRepository.deleteById(id);
    }

    @Override
    public void update(TodoRequest request) {
        Optional<TodoTable> optionalRecord =  todoRepository.findById(Integer.parseInt(request.getId()));
        if(optionalRecord.isPresent()) {
            TodoTable todoTable = optionalRecord.get();
            todoTable.setTodoValue(request.getTodoDescription());
            todoTable.setStatus(request.getCompletionStatus());
            todoRepository.save(todoTable);
        } else {
            throw new RuntimeException ("record not found for the given request");
        }
    }
}

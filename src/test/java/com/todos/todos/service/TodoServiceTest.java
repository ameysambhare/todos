package com.todos.todos.service;

import com.todos.todos.model.entities.TodoTable;
import com.todos.todos.model.request.TodoRequest;
import com.todos.todos.repos.TodoRepository;
import com.todos.todos.services.TodoService;
import com.todos.todos.services.TodoServiceDatabase;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
public class TodoServiceTest {
    @InjectMocks
    TodoServiceDatabase todoService;
    @Mock
    TodoRepository todoRepository;
    @Test
    public void testUpdate() {
        TodoTable todoTable = new TodoTable();
        todoTable.setStatus("pending");
        todoTable.setTodoValue("test");
        todoTable.setId(2);
        when(todoRepository.findById(any())).thenReturn(null);
        TodoRequest todoRequest = new TodoRequest();
        assertThrows(RuntimeException.class , ()->{
            todoService.update(todoRequest);
        });
    }
}

package com.todos.todos.controllers;

import com.todos.todos.model.response.TodoResponse;
import com.todos.todos.services.TodoService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TodoControllerTest {
    @Mock
    TodoService todoService;
    @InjectMocks
    TodoController todoController;
    @Test
    public void testGetTodos() {
        TodoResponse todoResponse =  new TodoResponse();
        todoResponse.setTodoValue("testValue");
        todoResponse.setCompletionStatus("pending");
        List<TodoResponse> todoResponseList = new ArrayList<>();
        todoResponseList.add(todoResponse);
        Mockito.when(todoService.getAllTodos()).thenReturn(todoResponseList);
        List<TodoResponse> response = todoController.getTodos();
        assertEquals(1, response.size());
        assertEquals("testValue", response.get(0).getTodoValue());
    }
}

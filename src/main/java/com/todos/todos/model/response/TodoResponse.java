package com.todos.todos.model.response;

import lombok.Data;

@Data
public class TodoResponse {
    private Integer id;
    private String completionStatus;
    private String todoValue;
}

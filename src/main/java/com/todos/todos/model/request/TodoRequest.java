package com.todos.todos.model.request;

import lombok.Data;

@Data
public class TodoRequest {
    private String todoDescription;
    private String completionStatus;
    private String id;
}

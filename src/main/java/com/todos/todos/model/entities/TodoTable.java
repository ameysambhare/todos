package com.todos.todos.model.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "todos")
@Data
public class TodoTable {
    @Id
    @Column(name = "todo_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "todo_desc")
    private String todoValue;

    @Column(name = "status")
    private String status;
}

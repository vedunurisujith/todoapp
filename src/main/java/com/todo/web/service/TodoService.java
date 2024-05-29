package com.todo.web.service;

import com.todo.web.model.Todo;

import java.util.List;

public interface TodoService {

    List<Todo> retrieveTodos();

    void addTodos(Todo todo);
}

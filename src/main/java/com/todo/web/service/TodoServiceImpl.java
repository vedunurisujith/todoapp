package com.todo.web.service;

import com.todo.web.model.Todo;
import com.todo.web.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService{
    @Autowired
    private TodoRepository todoRepository;


    @Override
    public List<Todo> retrieveTodos() {
        System.out.println(todoRepository.findAll().get(0));
        return todoRepository.findAll();


    }

    /**
     *
     * @param todo
     */
    @Override
    public void addTodos(Todo todo) {
    todoRepository.save(todo);
    }

}

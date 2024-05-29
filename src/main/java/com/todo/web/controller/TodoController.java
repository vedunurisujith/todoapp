package com.todo.web.controller;

import com.todo.web.model.Todo;
import com.todo.web.service.TodoService;
import com.todo.web.service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/getAll")
    public List<Todo> getTodos(){

        return todoService.retrieveTodos();
    }

    /**
     *
     * this endpoint takes todo
     *
     * @param todo
     */
    @PostMapping("/add")
    public void addTodos(@RequestBody Todo todo){
        //authentications
        // validations (todos)
        //certifications

         todoService.addTodos(todo);
    }



}

package com.example.business;

import com.example.api.TodoService;

import java.util.ArrayList;
import java.util.List;

public class TodoBusinessImp {
    private TodoService todoService;

    public TodoBusinessImp(TodoService todoService) {
        this.todoService = todoService;
    }

    public List<String> retrieveTodosRelatedToSpring(String user) {
        List<String> filteredTodos = new ArrayList<String>();
        List<String> todos = todoService.retrieveTodos((user);

        for (String todo : todos) {
            if (todo.contains("Spring")) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
}

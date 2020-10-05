package com.example.business;

import com.example.api.TodoService;
import com.example.api.TodoServiceStub;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TodoBusinessImpStubTest {

    @Test
    public void test() {
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImp todoBusinessImp = new TodoBusinessImp(todoServiceStub);
        List<String> filteredTodos = todoBusinessImp.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(2, filteredTodos.size());
    }
}

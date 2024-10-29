package com.first_spring_boot_seungwan_project.firstWebApp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>(); // 객체마다 가지는 것이 아니라 하나만 두려고 한다.
    private static int todoCount = 0;
    static {
        todos.add(new Todo(++todoCount, "seungwan", "learn aws", LocalDate.now().plusYears(1),false));
        todos.add(new Todo(++todoCount, "seungwan", "learn devops", LocalDate.now().plusYears(2),false));
        todos.add(new Todo(++todoCount, "seungwan", "learn frontend", LocalDate.now().plusYears(3),false));
    }

    public List<Todo> findBUsername(String username) {
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
        Todo todo = new Todo(++todoCount, username, description, targetDate, done);
        todos.add(todo);
    }


}

package com.first_spring_boot_seungwan_project.firstWebApp.todo;

import jakarta.validation.Valid;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        super();
        this.todoService = todoService;
    }

    // /list-todos 로 사용자가 접근함
    @RequestMapping("/list-todos")
    public String listAllTodos(ModelMap model) {
        List<Todo> todos = todoService.findBUsername("seungwan");
        model.addAttribute("todos", todos);

        return "listTodos";
    }

    @RequestMapping(value = "add-todo", method = RequestMethod.GET)
    public String showNewTodoPage(ModelMap model) {
        String username = (String) model.get("name");
        Todo todo = new Todo(0, username, "", LocalDate.now().plusYears(1),false);
        model.put("todo", todo);
        return "todo";
    }

    @RequestMapping(value = "add-todo", method = RequestMethod.POST)
    public String addNewTodoPage(ModelMap model,@Valid Todo todo, BindingResult result ) {
        if (result.hasErrors()) {
            return "todo";
        }

        todoService.addTodo((String) model.get("name"), todo.getDescription(), LocalDate.now().plusYears(1), false);
        return "redirect:/list-todos"; // 해당 페이지 URL로 리다이렉트 시켜줌
    }
}

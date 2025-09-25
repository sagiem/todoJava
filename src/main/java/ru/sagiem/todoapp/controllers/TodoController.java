package ru.sagiem.todoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

    @GetMapping
    public String index(Model model) {
        model.addAttribute("data","Hello");
        return "index";
    }

}

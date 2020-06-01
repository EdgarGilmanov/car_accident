package ru.job4j.police.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.job4j.police.repository.AccidentHibernate;

@Controller
public class IndexControl {
    private AccidentHibernate store;

    public IndexControl(AccidentHibernate store) {
        this.store = store;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("user", SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        model.addAttribute("accidents", store.getAll());
        return "index";
    }

    @GetMapping("/newAccident")
    public String createAccident() {
        return "accidentEdit";
    }
}
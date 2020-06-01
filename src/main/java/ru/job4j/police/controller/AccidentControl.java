package ru.job4j.police.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.job4j.police.model.Accident;
import ru.job4j.police.repository.AccidentMem;

@Controller
@ControllerAdvice
public class AccidentControl {
    @Autowired
    AccidentMem store;

    @ModelAttribute(value = "accident")
    public Accident accident() {
        return new Accident();
    }

    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public String registration(@ModelAttribute("accident") Accident accident, Model model) {
        store.save(accident);
        model.addAttribute("accidents", store.getAll());
        return "index";
    }
}

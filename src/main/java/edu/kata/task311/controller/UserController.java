package edu.kata.task311.controller;

import edu.kata.task311.entity.User;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public interface UserController {

    @GetMapping("/create")
    String create(ModelMap modelMap);

    @GetMapping("/update/{id}")
    String pageUpdate(ModelMap modelMap, @PathVariable("id") Long id);

    @PostMapping("/create")
    String create(@ModelAttribute("user") User user);

    @PostMapping("/update")
    String update(@ModelAttribute("user") User user);

    @PostMapping("/remove/{id}")
    String remove(@PathVariable Long id);
}

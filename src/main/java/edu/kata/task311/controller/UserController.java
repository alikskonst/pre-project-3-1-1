package edu.kata.task311.controller;

import edu.kata.task311.entity.User;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

public interface UserController {

    @GetMapping("/create")
    String pageCreate(ModelMap modelMap);

    @GetMapping("/update/{id}")
    String pageUpdate(ModelMap modelMap, @PathVariable("id") Long id);

    @PostMapping("/save")
    String save(@ModelAttribute("user") User user);

    @DeleteMapping("/remove/{id}")
//    @RequestMapping(value = "/remove/{id}", method = RequestMethod.DELETE)
    String remove(@PathVariable Long id);
}

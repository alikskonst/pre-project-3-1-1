package edu.kata.task311.controller.impl;

import edu.kata.task311.controller.IndexController;
import edu.kata.task311.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping
public class IndexControllerImpl implements IndexController {

    private final UserService userService;

    @Override
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("userList", userService.findAll());
        return "index";
    }
}

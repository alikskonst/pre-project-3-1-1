package edu.kata.task311.controller.impl;

import edu.kata.task311.controller.UserController;
import edu.kata.task311.entity.User;
import edu.kata.task311.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("/users")
public class UserControllerImpl implements UserController {

    private final UserService userService;

    //------------------------------------------------------------------------------------------------------------------

    @Override
    public String pageCreate(ModelMap modelMap) {
        modelMap.addAttribute("user", new User());
        return "user_manage";
    }

    @Override
    public String pageUpdate(ModelMap modelMap, Long id) {
        modelMap.addAttribute("user", userService.findOne(id));
        return "user_manage";
    }

    @Override
    public String save(User user) {
        userService.save(user);
        return "redirect:/";
    }

    @Override
    public String remove(Long id) {
        userService.remove(id);
        return "redirect:/";
    }
}

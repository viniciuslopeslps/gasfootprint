package br.com.controller;

import br.com.model.User;
import br.com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/save")
    public String save(User user) {
        User save = userService.save(user);
        return "redirect:/login";
    }

    @RequestMapping("/edit")
    public String edit(Model model, String email) {
        User user = new User();
        if (email != null) {
            user = userService.findOne(email);
        }
        model.addAttribute("user", user);
        return "/user/edit";
    }
}

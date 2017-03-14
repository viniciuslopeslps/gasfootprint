package br.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tree")
public class TreeController {
    @RequestMapping("/list")
    public String list() {
        return "/tree/list";
    }

    @RequestMapping("/edit")
    public String edit() {
        return "/tree/edit";
    }
}

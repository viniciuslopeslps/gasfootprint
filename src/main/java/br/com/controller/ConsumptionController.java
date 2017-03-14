package br.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/consumption")
public class ConsumptionController {

    @RequestMapping("/list")
    public String list() {
        return "/consumption/list";
    }

    @RequestMapping("/edit")
    public String edit() {
        return "/consumption/edit";
    }
}

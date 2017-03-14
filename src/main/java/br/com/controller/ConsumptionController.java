package br.com.controller;

import br.com.model.ConsumptionType;
import br.com.service.ConsumptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/consumption")
public class ConsumptionController {

    @RequestMapping("/list")
    public String list() {
        return "/consumption/list";
    }

    @RequestMapping("/edit")
    public String edit(Model model) {
        model.addAttribute("consumptions", ConsumptionType.values());
        return "/consumption/edit";
    }
}

package br.com.controller;

import br.com.service.ConsumptionService;
import br.com.service.HomeService;
import br.com.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;
    @Autowired
    private ConsumptionService consumptionService;
    @Autowired
    private TreeService treeService;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("treeToConsumption", homeService.treeToConsumption());
        model.addAttribute("consumptionInKg", homeService.consumptionInKg());
        model.addAttribute("mainConsumptions", consumptionService.mainConsumptions());
        model.addAttribute("mainTrees", treeService.mainTrees());
        model.addAttribute("totalTrees", homeService.totalTrees());
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "/base/login";
    }
}

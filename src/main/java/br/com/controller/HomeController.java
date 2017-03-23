package br.com.controller;

import br.com.model.User;
import br.com.service.ConsumptionService;
import br.com.service.HomeService;
import br.com.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    //todo:mostrar os consulmos apenas para usuarios que tem permissao
    @Autowired
    private HomeService homeService;
    @Autowired
    private ConsumptionService consumptionService;
    @Autowired
    private TreeService treeService;

    @RequestMapping("/")
    public String index(Model model, @AuthenticationPrincipal User user) {
        model.addAttribute("treeToConsumption", homeService.treeToConsumption(user));
        model.addAttribute("consumptionInKg", homeService.consumptionInKg(user));
        model.addAttribute("mainConsumptions", consumptionService.mainConsumptions(user));
        model.addAttribute("mainTrees", treeService.mainTrees(user));
        model.addAttribute("totalTrees", homeService.totalTrees(user));
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "/base/login";
    }
}

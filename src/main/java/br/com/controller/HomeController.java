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

//cada litro de gasolina produz 2,44 Kg de CO2.  -->
//o valor médio de captura é 190 quilos de CO2 por árvore -->

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("needed", homeService.treeToConsumption());
        model.addAttribute("mainConsumptions", consumptionService.mainConsumptions());
        model.addAttribute("mainTrees", treeService.mainTrees());
        return "index";
    }

}

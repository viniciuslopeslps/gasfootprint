package br.com.controller;

import br.com.model.Consumption;
import br.com.model.ConsumptionType;
import br.com.model.User;
import br.com.service.ConsumptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/consumption")
public class ConsumptionController {

    @Autowired
    ConsumptionService consumptionService;

    @RequestMapping("/list")
    public String list(Model model, @AuthenticationPrincipal User user) {
        model.addAttribute("consumptions", consumptionService.findAllByUser(user));
        return "/consumption/list";
    }

    @RequestMapping("/edit")
    public String edit(Model model, Long id, @AuthenticationPrincipal User user) {
        Consumption consumption = new Consumption();
        if (id != null) {
            consumption = consumptionService.findOneByUser(id, user);
        }
        model.addAttribute("consumption", consumption);
        model.addAttribute("types", ConsumptionType.values());
        return "/consumption/edit";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Consumption consumption, @AuthenticationPrincipal User user) {
        consumptionService.save(consumption, user);
        return "redirect:/consumption/list";
    }

    @RequestMapping(value = "/delete")
    public String delete(Long id) {
        consumptionService.delete(id);
        return "redirect:/consumption/list";
    }
}

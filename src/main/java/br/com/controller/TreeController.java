package br.com.controller;

import br.com.model.Tree;
import br.com.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/tree")
public class TreeController {
    @Autowired
    private TreeService treeService;

    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("trees", treeService.findAll());
        return "/tree/list";
    }

    @RequestMapping("/edit")
    public String edit(Model model, Long id) {
        Tree tree = new Tree();
        if (id != null) {
            tree = treeService.findOne(id);
        }
        model.addAttribute("tree", tree);
        return "/tree/edit";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Tree tree) {
        treeService.save(tree);
        return "redirect:/tree/list";
    }

}

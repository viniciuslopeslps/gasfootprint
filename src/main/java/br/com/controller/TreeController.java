package br.com.controller;

import br.com.model.Tree;
import br.com.model.User;
import br.com.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
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
    public String list(Model model, @AuthenticationPrincipal User user) {
        model.addAttribute("trees", treeService.findAllByUser(user));
        return "/tree/list";
    }

    @RequestMapping("/edit")
    public String edit(Model model, Long id, @AuthenticationPrincipal User user) {
        Tree tree = new Tree();
        if (id != null) {
            tree = treeService.findOneByUser(id, user);
        }
        model.addAttribute("tree", tree);
        return "/tree/edit";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Tree tree, @AuthenticationPrincipal User user) {
        treeService.save(tree, user);
        return "redirect:/tree/list";
    }

    @RequestMapping(value = "/delete")
    public String delete(Long id) {
        treeService.delete(id);
        return "redirect:/tree/list";
    }

}

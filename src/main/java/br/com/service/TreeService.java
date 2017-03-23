package br.com.service;

import br.com.dao.TreeDAO;
import br.com.model.Tree;
import br.com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TreeService {
    @Autowired
    private TreeDAO treeDAO;

    public List<Tree> findAllByUser(User user) {
        return treeDAO.findAllByUser(user.getEmail());
    }

    public Tree findOneByUser(Long id, User user) {
        return treeDAO.findOneByUser(id, user.getEmail());
    }

    public Tree save(Tree tree, User user) {
        tree.setUser(user);
        return treeDAO.save(tree);
    }

    public void delete(Long id) {
        treeDAO.delete(id);
    }

    public List<Tree> mainTrees(User user) {
        if (user == null) {
            return new ArrayList<>();
        }
        return treeDAO.findRecentTrees(user.getEmail()).stream().limit(5).collect(Collectors.toList());
    }
}

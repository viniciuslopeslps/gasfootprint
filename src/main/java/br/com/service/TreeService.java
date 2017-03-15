package br.com.service;

import br.com.dao.TreeDAO;
import br.com.model.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeService {
    @Autowired
    private TreeDAO treeDAO;

    public List<Tree> findAll() {
        return treeDAO.findAll();
    }

    public Tree findOne(Long id) {
        return treeDAO.findOne(id);
    }

    public Tree save(Tree tree) {
        return treeDAO.save(tree);
    }

    public void delete(Long id) {
        treeDAO.delete(id);
    }
}

package br.com.service;

import br.com.dao.TreeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TreeService {
    @Autowired
    private TreeDAO treeDAO;

}

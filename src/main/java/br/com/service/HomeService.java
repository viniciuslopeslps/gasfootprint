package br.com.service;

import br.com.model.Consumption;
import br.com.model.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {
    @Autowired
    private ConsumptionService consumptionService;
    @Autowired
    private TreeService treeService;


    public double treeToConsumption() {
        List<Tree> trees = treeService.findAll();
        Double totalTrees = trees.stream().mapToDouble(Tree::getQuantity).sum();
        Double consumptionInKg = consumptionInKg();
        return consumptionInKg / totalTrees;
    }

    private double consumptionInKg() {
        List<Consumption> consumptions = consumptionService.findAll();
        int total = consumptions.stream().mapToInt(Consumption::getQuantity).sum();
        return total * 2.44;
    }
}

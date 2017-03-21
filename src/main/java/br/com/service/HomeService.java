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

    //cada litro de gasolina produz 2,44 Kg de CO2.
    //o valor médio de captura é 190 quilos de CO2 por árvore

    public double treeToConsumption() {
        List<Tree> trees = treeService.findAll();
        Double totalTrees = trees.stream().mapToDouble(Tree::getQuantity).sum();
        return totalTrees * 190.0;
    }

    public double consumptionInKg() {
        List<Consumption> consumptions = consumptionService.findAll();
        int total = consumptions.stream().mapToInt(Consumption::getQuantity).sum();
        return total * 2.44;
    }

    public long totalTrees() {
        Double media = consumptionInKg() / 190.0;
        if (media < 0) {
            return 0;
        }
        return Math.round(media);
    }
}

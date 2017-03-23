package br.com.service;

import br.com.model.Consumption;
import br.com.model.Tree;
import br.com.model.User;
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

    public double treeToConsumption(User user) {
        if (user == null) {
            return 0.0;
        }
        List<Tree> trees = treeService.findAllByUser(user);
        Double totalTrees = trees.stream().mapToDouble(Tree::getQuantity).sum();
        return totalTrees * 190.0;
    }

    public double consumptionInKg(User user) {
        if (user == null) {
            return 0.0;
        }
        List<Consumption> consumptions = consumptionService.findAllByUser(user);
        int total = consumptions.stream().mapToInt(Consumption::getQuantity).sum();
        return total * 2.44;
    }

    public long totalTrees(User user) {
        if (user == null) {
            return 0L;
        }
        Double media = consumptionInKg(user) / 190.0;
        if (media < 0) {
            return 0;
        }
        return Math.round(media);
    }
}

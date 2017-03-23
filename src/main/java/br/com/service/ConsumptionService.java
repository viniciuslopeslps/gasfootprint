package br.com.service;

import br.com.dao.ConsumptionDAO;
import br.com.model.Consumption;
import br.com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConsumptionService {

    @Autowired
    private ConsumptionDAO consumptionDAO;

    public Consumption save(Consumption consumption, User user) {
        consumption.setUser(user);
        return consumptionDAO.save(consumption);
    }

    public List<Consumption> findAllByUser(User user) {
        return consumptionDAO.findAllByUser(user.getEmail());
    }

    public ConsumptionDAO getConsumptionDAO() {
        return consumptionDAO;
    }

    public void setConsumptionDAO(ConsumptionDAO consumptionDAO) {
        this.consumptionDAO = consumptionDAO;
    }

    public Consumption findOneByUser(Long id, User user) {
        return consumptionDAO.findOneByUser(id, user.getEmail());
    }

    public void delete(Long id) {
        consumptionDAO.delete(id);
    }

    public List<Consumption> mainConsumptions(User user) {
        if (user == null) {
            return new ArrayList<>();
        }
        return consumptionDAO.findRecentConsumptions(user.getEmail()).stream().limit(5).collect(Collectors.toList());
    }
}

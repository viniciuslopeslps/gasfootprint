package br.com.service;

import br.com.dao.ConsumptionDAO;
import br.com.model.Consumption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumptionService {

    @Autowired
    private ConsumptionDAO consumptionDAO;

    public Consumption save(Consumption consumption) {
        return consumptionDAO.save(consumption);
    }

    public List<Consumption> findAll() {
        return consumptionDAO.findAll();
    }

    public ConsumptionDAO getConsumptionDAO() {
        return consumptionDAO;
    }

    public void setConsumptionDAO(ConsumptionDAO consumptionDAO) {
        this.consumptionDAO = consumptionDAO;
    }

    public Consumption findOne(Long id) {
        return consumptionDAO.findOne(id);
    }

    public void delete(Long id) {
        consumptionDAO.delete(id);
    }
}

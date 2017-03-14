package br.com.service;

import br.com.dao.ConsumptionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumptionService {
    @Autowired
    private ConsumptionDAO consumptionDAO;

}

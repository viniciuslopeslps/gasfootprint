package br.com.dao;

import br.com.model.Consumption;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsumptionDAO extends JpaRepository<Consumption, Long> {
}

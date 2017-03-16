package br.com.dao;

import br.com.model.Consumption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ConsumptionDAO extends JpaRepository<Consumption, Long> {

    @Query("from Consumption c order by c.createdAt")
    List<Consumption> findRecentConsumptions();
}

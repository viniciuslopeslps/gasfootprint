package br.com.dao;

import br.com.model.Consumption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsumptionDAO extends JpaRepository<Consumption, Long> {

    @Query("from Consumption c  where c.user.email=?1 order by c.createdAt")
    List<Consumption> findRecentConsumptions(String email);

    @Query("from Consumption c where c.id=?1 and c.user.email=?2")
    Consumption findOneByUser(Long id, String email);

    @Query("from Consumption c where c.user.email=?1")
    List<Consumption> findAllByUser(String email);
}

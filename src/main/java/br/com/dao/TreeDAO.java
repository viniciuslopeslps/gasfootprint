package br.com.dao;


import br.com.model.Tree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TreeDAO extends JpaRepository<Tree, Long> {

    @Query("from Tree t order by t.createdAt")
    List<Tree> findRecentTrees();
}

package br.com.dao;


import br.com.model.Tree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TreeDAO extends JpaRepository<Tree, Long> {

    @Query("from Tree t order by t.createdAt")
    List<Tree> findRecentTrees();
}

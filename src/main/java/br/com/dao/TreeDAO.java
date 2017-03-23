package br.com.dao;


import br.com.model.Tree;
import br.com.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TreeDAO extends JpaRepository<Tree, Long> {

    @Query("from Tree t where t.user.email=?1 order by t.createdAt")
    List<Tree> findRecentTrees(String email);

    @Query("from Tree t where t.user.email=?1")
    List<Tree> findAllByUser(String user);

    @Query("from Tree t where t.id=?1 and t.user.email=?2")
    Tree findOneByUser(Long id, String email);
}

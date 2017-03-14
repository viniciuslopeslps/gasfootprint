package br.com.dao;


import br.com.model.Tree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreeDAO extends JpaRepository<Tree, Long> {

}

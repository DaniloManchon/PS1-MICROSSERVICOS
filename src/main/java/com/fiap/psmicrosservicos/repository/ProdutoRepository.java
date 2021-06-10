package com.fiap.psmicrosservicos.repository;


import com.fiap.psmicrosservicos.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long>{

}

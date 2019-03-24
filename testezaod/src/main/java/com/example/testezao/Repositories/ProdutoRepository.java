package com.example.testezao.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.testezao.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}

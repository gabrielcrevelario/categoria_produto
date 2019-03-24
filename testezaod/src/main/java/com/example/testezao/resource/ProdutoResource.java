package com.example.testezao.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.testezao.Repositories.ProdutoRepository;
import com.example.testezao.model.Produto;

@RestController
@RequestMapping(value ="/produtos")
public class ProdutoResource {

	@Autowired
	private ProdutoRepository produtoRepository;
	@RequestMapping(method = RequestMethod.POST)
	public void createProduto(@RequestBody Produto produto) {
		 produtoRepository.save(produto);
	}
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Produto>> getAll() {
		 return ResponseEntity.ok(produtoRepository.findAll());
	}
}

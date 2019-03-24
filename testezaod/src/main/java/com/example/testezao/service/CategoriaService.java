package com.example.testezao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testezao.Repositories.CategoriaRepository;
import com.example.testezao.model.Categoria;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public List<Categoria> getById(int id) {
		return categoriaRepository.getCategoriaporId(id);
	}
}

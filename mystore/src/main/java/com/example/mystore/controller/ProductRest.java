package com.example.mystore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mystore.daos.ProdutoDAO;
import com.example.mystore.model.Produtos;

@RestController()
public class ProductRest {
	
	@Autowired
	private ProdutoDAO repository;
	
	@RequestMapping("/product/by-id/{id}")
	public Produtos detailsJSON(@PathVariable("id") long id) {
		return repository.findDetails(id);
	}
	
	@RequestMapping("/product/list")
	public List<Produtos> detailsListJson(){
		return repository.findAtributesProducts();
	}
}

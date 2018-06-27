package com.example.mystore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.mystore.daos.ProdutoDAO;
import com.example.mystore.model.Produtos;

@Controller
public class HomeController {

	@Autowired
	private ProdutoDAO repository;
	
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView("index");
		List<Produtos> products = repository.findAtributesProducts();
		view.addObject("produtos", products);
		return view;
	}
	
	@PostMapping("/search")
	public ModelAndView search(String filter) {
		ModelAndView view = new ModelAndView("index");
		List<Produtos> produtoSearch = repository.findProduct(filter);
		view.addObject("produtos", produtoSearch);
		return view;
	}
}

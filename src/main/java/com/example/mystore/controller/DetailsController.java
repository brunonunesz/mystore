package com.example.mystore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.mystore.daos.ProdutoDAO;
import com.example.mystore.model.Produtos;

@Controller("/details")
public class DetailsController {
	
	@Autowired
	private ProdutoDAO repository;

	@GetMapping("/{id}")
	public ModelAndView details(@PathVariable("id") long id) {
		ModelAndView view = new ModelAndView("details");
		Produtos detail = repository.findDetails(id);
		view.addObject("detail", detail);
		
		return view;
	}
	
	@GetMapping("/products/{id}")
	@ResponseBody
	public Produtos detailsJSON(@PathVariable("id") long id) {
		return repository.findDetails(id);
	}
}

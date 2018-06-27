package com.example.mystore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.mystore.daos.ProdutoDAO;

@Controller
public class HomeController {

	@Autowired
	private ProdutoDAO repository;
	
	@GetMapping("/")
	public ModelAndView index() {
		repository.findAtributesProducts();
		return new ModelAndView("home");
	}
}

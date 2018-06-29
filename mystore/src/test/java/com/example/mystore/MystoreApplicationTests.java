package com.example.mystore;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.example.mystore.daos.ProdutoDAO;
import com.example.mystore.model.Produtos;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MystoreApplicationTests {

	@Autowired
	private ProdutoDAO repository;
	
	@Test
	public void contextLoads() {
		List<Produtos> products = repository.findAtributesProducts();
		assertEquals(true, products.size() > 5);
		
	}
	
	@Test
	public void restServiceProduct() {
		
		Produtos produtos = new RestTemplate().getForObject("http://localhost:8080/product/by-id/8796093054974", Produtos.class);
		assertEquals("hybris London, UK", produtos.getName());
	}

}

package com.example.mystore.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.mystore.model.Produtos;

@Repository
public class ProdutoDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	public void findAtributesProducts() {
		
		List<Produtos> list = entityManager.createNativeQuery("select p.P_BASEPRODUCT, p.P_VENUE, p.P_DATE from PRODUCTS p", Produtos.class).getResultList();
		
		System.out.println(list.toString());
	}
}

package com.example.mystore.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.example.mystore.model.Produtos;

@Repository
public class ProdutoDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Produtos> findAtributesProducts() {
		
		List<Produtos> list = entityManager.createNativeQuery("select p.P_BASEPRODUCT, p.P_VENUE, p.P_DATE from PRODUCTS p", Produtos.class).getResultList();
		
		return list;
	}

	public List<Produtos> findProduct(String filter) {
		
		Query query = entityManager.createNativeQuery("select p.P_BASEPRODUCT, p.P_VENUE, p.P_DATE from PRODUCTS p where p.P_VENUE = :venue", Produtos.class);
		List<Produtos> list = query.setParameter("venue", filter).getResultList();
		
		
		
		return list;
		
	}

	public Produtos findDetails(long id) {
		Query query = entityManager.createNativeQuery("select p.P_BASEPRODUCT, p.P_VENUE, p.P_DATE from PRODUCTS p where p.P_BASEPRODUCT = :id", Produtos.class);
		Produtos produto = (Produtos) query.setParameter("id", id).getSingleResult();
		
		return produto;
	}
}

package com.example.mystore.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Products")
@Table(name="PRODUCTS")
public class Produtos {

	@Id
	@GeneratedValue
	@Column(name = "P_BASEPRODUCT")
	private long id;
	@Column(name = "P_VENUE")
	private String name;
	@Column(name = "P_DATE")
	private Calendar date;
	
	

	public Produtos(long id, String name, Calendar date) {
		this.id = id;
		this.name = name;
		this.date = date;
	}
	
	public Produtos() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return name + " " + id + " " + date + "\n";
	}
}

package com.example.mystore;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class MystoreApplication {
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/mystore");
		ds.setUsername("root");
		ds.setPassword("1234");
		
		return ds;
		
	}

	public static void main(String[] args) {
		SpringApplication.run(MystoreApplication.class, args);
	}
}

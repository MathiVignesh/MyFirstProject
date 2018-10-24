package com.niit.dao;

import java.util.List;

import com.niit.Model.Product;

public interface Productdao {
	Product saveProduct(Product product);
	Product getProduct(int id);
	void updateProduct(Product product);
	List<Product> getAllProducts();
}


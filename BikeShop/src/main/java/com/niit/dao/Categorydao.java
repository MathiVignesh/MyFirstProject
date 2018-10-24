package com.niit.dao;

import java.util.List;

import com.niit.Model.Category;

public interface Categorydao {


		Category saveCategory(Category category);
		Category getCategory(int id);
		void updateCategory(Category category);
		List<Category> getAllCategories();
	}



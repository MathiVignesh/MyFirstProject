package com.niit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Model.Category;
import com.niit.Model.Product;
@Repository
@Transactional

public class Categorydaoimp implements Categorydao {
	@Autowired
	private SessionFactory sessionFactory;
	public Category saveCategory(Category category) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		 System.out.println("Id before"+category.getCategoryid());
		 session.save(category);
		 System.out.println("Id after"+category.getCategoryid());
		return category;
	}

	public Category getCategory(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
  Category category=(Category)session.get(Category.class,id);
		return category;
	}

	public void updateCategory(Category category) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.update(category);
	}

	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Category");
		List<Category> categories=query.list();
		return categories;
	} 
	
}

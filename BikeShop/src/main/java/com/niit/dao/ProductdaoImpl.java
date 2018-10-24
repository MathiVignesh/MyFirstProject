package com.niit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Model.Product;
@Repository
@Transactional
public class ProductdaoImpl implements Productdao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Product saveProduct(Product product)
	{
		Session session=sessionFactory.getCurrentSession();
		 System.out.println("Id before"+product.getProductid());
		 session.save(product);
		 System.out.println("Id after"+product.getProductid());
		 return product;
}
	public Product getProduct(int id)
	{
		Session session=sessionFactory.getCurrentSession();
		Product product=(Product)session.get(Product.class,id);
		return product;
	}
public void updateProduct(Product product)
{
	Session session=sessionFactory.getCurrentSession();
	session.update(product);
}
public void deleteProduct(int id)
{
	Session session=sessionFactory.getCurrentSession();
	Product product=(Product)session.get(Product.class,id);
	if(product!=null)
		session.delete(product);
}
public List<Product> getAllProducts()
{
	Session session=sessionFactory.getCurrentSession();
	Query query=session.createQuery("from Product");
	List<Product> products=query.list();
	return products;
}
}



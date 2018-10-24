package com.niit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Model.Product;
import com.niit.Model.User;


	@Repository
	@Transactional
	public class Userdaoimp implements Userdao {

		@Autowired
		private SessionFactory sessionFactory;

		public User saveUser(User user) {
			Session session=sessionFactory.getCurrentSession();
			 System.out.println("Id before"+user.getId());
			 session.save(user);
			 System.out.println("Id after"+user.getId());
			 return user;
	}	
		

		public User getUser(int id) {
			// TODO Auto-generated method stub
			Session session=sessionFactory.getCurrentSession();
			User user=(User)session.get(User.class,id);
			
			return user;
		}

		public void updateUser(User user) {
			// TODO Auto-generated method stub
			Session session=sessionFactory.getCurrentSession();
			session.update(user);
			
		}

		public List<User> getAllUsers() {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from User");
			List<User> users=query.list();
			return users;
		}
	}
		
		
		
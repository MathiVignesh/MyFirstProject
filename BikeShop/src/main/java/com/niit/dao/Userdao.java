package com.niit.dao;

import java.util.List;

import javax.persistence.Entity;

import com.niit.Model.User;


public interface Userdao {
	User saveUser(User user);
	User getUser(int id);
	void updateUser(User user);
	List<User> getAllUsers();
}

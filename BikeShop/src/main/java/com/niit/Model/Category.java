package com.niit.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {
@Id

private String categoryname;
private String categoryid;
private String categorytype;
public String getCategoryname() {
	return categoryname;
}
public void setCategoryname(String categoryname) {
	this.categoryname = categoryname;
}
public String getCategoryid() {
	return categoryid;
}
public void setCategoryid(String categoryid) {
	this.categoryid = categoryid;
}
public String getCategorytype() {
	return categorytype;
}
public void setCategorytype(String categorytype) {
	this.categorytype = categorytype;
}
}


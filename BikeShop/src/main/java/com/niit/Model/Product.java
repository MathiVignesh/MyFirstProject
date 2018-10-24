package com.niit.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
private String productid;
private String productname;
private String quantity;
private String quanlity;
private String productdescription;
public String getProductid() {
	return productid;
}
public void setProductid(String productid) {
	this.productid = productid;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
public String getQuanlity() {
	return quanlity;
}
public void setQuanlity(String quanlity) {
	this.quanlity = quanlity;
}
public String getProductdescription() {
	return productdescription;
}
public void setProductdescription(String productdescription) {
	this.productdescription = productdescription;
}

}

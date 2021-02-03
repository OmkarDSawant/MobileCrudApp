package com.crud.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mdetails") // Database table name
public class Mobile {
	
	@Id
	@Column(name = "id") //Column name inside table.
	private int id;
	
	@Column(name = "bname")
	private String bname;
	
	@Column(name = "mname")
	private String mname;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "qty")
	private int qty;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
}

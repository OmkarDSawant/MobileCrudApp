package com.crud.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "addm") // Database table name
public class Addm {
	
	@Id
	@Column(name = "a_id") //Column name inside table.
	private int a_id;
	
	@Column(name = "a_bname")
	private String a_bname;
	
	@Column(name = "a_mname")
	private String a_mname;
	
	@Column(name = "a_price")
	private int a_price;
	
	@Column(name = "a_qty")
	private int a_qty;

	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public String getA_bname() {
		return a_bname;
	}

	public void setA_bname(String a_bname) {
		this.a_bname = a_bname;
	}

	public String getA_mname() {
		return a_mname;
	}

	public void setA_mname(String a_mname) {
		this.a_mname = a_mname;
	}

	public int getA_price() {
		return a_price;
	}

	public void setA_price(int a_price) {
		this.a_price = a_price;
	}

	public int getA_qty() {
		return a_qty;
	}

	public void setA_qty(int a_qty) {
		this.a_qty = a_qty;
	}

		
}

package com.crud.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sold") // Database table name
public class Sold {
	
	@Id
	@Column(name = "s_id") //Column name inside table.
	private int s_id;
	
	@Column(name = "s_bname")
	private String s_bname;
	
	@Column(name = "s_mname")
	private String s_mname;
	
	@Column(name = "s_price")
	private int s_price;
	
	@Column(name = "s_qty")
	private int s_qty;

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_bname() {
		return s_bname;
	}

	public void setS_bname(String s_bname) {
		this.s_bname = s_bname;
	}

	public String getS_mname() {
		return s_mname;
	}

	public void setS_mname(String s_mname) {
		this.s_mname = s_mname;
	}

	public int getS_price() {
		return s_price;
	}

	public void setS_price(int s_price) {
		this.s_price = s_price;
	}

	public int getS_qty() {
		return s_qty;
	}

	public void setS_qty(int s_qty) {
		this.s_qty = s_qty;
	}	
	
}

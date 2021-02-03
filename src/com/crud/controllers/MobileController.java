package com.crud.controllers;

import java.io.IOException;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.crud.dao.Mobile;
import com.crud.db.HibernateDatabaseConnection;

@Controller
public class MobileController {
	
	@RequestMapping("/chart")
	public String getChart(){
		return "views/saleadd.jsp";
	}
	
	@RequestMapping("/add_mobile")
	public String getAddMobileForm(HttpServletRequest req,HttpServletResponse res) throws IOException{
		
		String username = (String)req.getSession().getAttribute("username");
		
		if(username == null){
			res.sendRedirect("login");
			//return "views/login.jsp"; This should not be used as it is not redirecting but merely loading the page  
		}
		return "views/mobile_add_form.jsp";
	}
	
	@RequestMapping("/add_mobile_action")
	public void addStudent(HttpServletResponse res,
			@ModelAttribute("mobile") Mobile md) throws IOException{
		
		System.out.println(md.getBname());
		
		Session session = null;
		session = HibernateDatabaseConnection.getSessionFactory().openSession();
		
		Transaction t = session.beginTransaction(); //VIMP
		session.save(md);
		t.commit(); //VIMP
		
		res.sendRedirect("dashboard");
	}
	
	@RequestMapping("/edit_mobile_action")
	public void editStudent(HttpServletResponse res,
			@ModelAttribute("mobile") Mobile md) throws IOException{
		
		System.out.println(md.getBname());
		
		Session session = null;
		session = HibernateDatabaseConnection.getSessionFactory().openSession();
		
		Transaction t = session.beginTransaction(); //VIMP
		session.saveOrUpdate(md);
		t.commit(); //VIMP
		
		res.sendRedirect("dashboard");
	}
	
	@RequestMapping("/delete")
	public void deleteRecord(HttpServletResponse res, @RequestParam("id") int id) throws IOException{
		
		Session session = null;
		session = HibernateDatabaseConnection.getSessionFactory().openSession();
		
		Transaction t = session.beginTransaction(); //VIMP
		
		Mobile m = new Mobile();
		m.setId(id);
		session.delete(m); //DELETE FROM mdetails WHERE id = the id we have passed in obj.
		
		t.commit(); //VIMP
		
		res.sendRedirect("dashboard");
	}
	@RequestMapping("/edit")
	public String getEditForm(HttpServletResponse res,Model m, @RequestParam("id") int id) throws IOException{		
		
		Session session = null;
		session = HibernateDatabaseConnection.getSessionFactory().openSession();
		Query query2 = session.createQuery("FROM Mobile WHERE id = :id");
		query2.setParameter("id", id);
		
		Mobile m_obj = (Mobile)query2.getSingleResult();
		
		m.addAttribute("mobile", m_obj);
		
		return "views/edit_student.jsp";
	}
}

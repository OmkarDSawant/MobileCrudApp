package com.crud.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crud.dao.Register;
import com.crud.db.HibernateDatabaseConnection;

@Controller
public class RegisterController {
	
	@RequestMapping("/reguser")
	public String regUser(){	
		return "views/register.jsp";
	}
	
	@RequestMapping("/add_user_action")
	public void addUser(HttpServletResponse res,
			@ModelAttribute("register") Register re) throws IOException{
		
			Session session1 = null;
			session1 = HibernateDatabaseConnection.getSessionFactory().openSession();
		
			Transaction t = session1.beginTransaction(); //VIMP
			session1.save(re);
			t.commit(); //VIMP
		
			res.sendRedirect("dashboard");
	}

}

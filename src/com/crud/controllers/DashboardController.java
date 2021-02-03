package com.crud.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crud.dao.Mobile;
import com.crud.db.HibernateDatabaseConnection;

@Controller
public class DashboardController {
	
	@RequestMapping("/dashboard")
	public String loadDashboard(Model m,
			HttpServletRequest req,
			HttpServletResponse res) throws IOException{
		
		String username = (String)req.getSession().getAttribute("username");
		
		if(username == null){
			res.sendRedirect("login");
			//return "views/login.jsp"; This should not be used as it is not redirecting but merely loading the page  
		}
		
		Session session = null; //import from hibernate
		session = HibernateDatabaseConnection.getSessionFactory().openSession(); //HibernateDatabaseConnection from the class we created
		Query query2 = session.createQuery("FROM Mobile"); //POJO class name
		List mobiles = query2.list();
		
		m.addAttribute("mobile_list", mobiles); //variable name and list name
		
		System.out.println(mobiles);
		
		return "views/dashboard.jsp";
	}
	
	
}

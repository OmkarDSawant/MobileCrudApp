package com.crud.controllers;
import java.io.IOException;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.crud.dao.Register;
import com.crud.db.HibernateDatabaseConnection;

@Controller
public class AuthController {

	@RequestMapping("/login")
	public String getLoginForm(){
		return "views/login.jsp"; //As we are maintaining a separate folder for all forms
	}
	
	//@RequestMapping("/login_action")
	@RequestMapping(value="/login_action", method = RequestMethod.POST)//Other way
	public void checkCreds(
			@RequestParam("username") String unm,
			@RequestParam("password") String pwd,
			HttpServletRequest req,
			HttpServletResponse res)
			throws IOException{
		
		try{
			Session session = null;
			session = HibernateDatabaseConnection.getSessionFactory().openSession();
			Query query2 = session.createQuery("FROM Register WHERE username = :username");
			query2.setParameter("username", unm);
			Register reg_obj = (Register)query2.getSingleResult();

			if(reg_obj.getPassword().equals(pwd)){
				
				req.getSession().setAttribute("username",unm); //Creating Session
				
				res.sendRedirect("dashboard");
			}else{
				res.sendRedirect("login");
			}
		} catch(Exception e){
			res.sendRedirect("login");
		}
		
		
	}
	
	@RequestMapping("/logout")
	public void logoutUser(HttpServletRequest req,HttpServletResponse res) throws IOException{
		
		req.getSession().invalidate();
		res.sendRedirect("login");
	}
}

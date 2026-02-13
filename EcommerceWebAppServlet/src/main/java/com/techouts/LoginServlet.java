package com.techouts;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import jakarta.servlet.annotation.WebServlet;


public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password =  request.getParameter("password");
		response.getWriter().println(email);
		response.getWriter().println(password);
		
		try(
			Session session = HibernateUtil.getFactory().openSession()){
			response.getWriter().println("Connection Successful");
			Transaction transaction = session.beginTransaction();
			
			Query<UserDetails> q = session.createQuery("from UserDetails where email = :email",UserDetails.class);
			q.setParameter("email", email);
			UserDetails user = q.uniqueResult();
			if(user != null) 
			{
				Query<UserDetails> q1 = session.createQuery("from UserDetails where password = :password",UserDetails.class);
				q1.setParameter("password", password);
				UserDetails passwordTrue = q1.uniqueResult();
				if(passwordTrue != null) 
					response.sendRedirect("AutoDelay.jsp");
				else 
					response.sendRedirect("PasswordFailure.jsp");
				
			}
			else
			response.sendRedirect("EmailFailure.jsp");

			
			
		}
	}

}

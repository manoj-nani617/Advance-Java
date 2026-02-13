package com.techouts;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.annotation.WebServlet;

/**
 * Servlet implementation class RegisterServlet
 */

public class RegisterServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		try(Session session = HibernateUtil.getFactory().openSession()) {
			
			Transaction transaction = session.beginTransaction();
			UserDetails ud = new UserDetails();
			ud.setUsername(username);
			ud.setEmail(email);
			ud.setPassword(password);
			try {
				session.persist(ud);
				transaction.commit();
				response.sendRedirect("AutoDelay.jsp");
			}
			catch(Exception e) {
//				request.setAttribute("error", true);
//				RequestDispatcher rd = request.getRequestDispatcher("Register.jsp");
//				rd.forward(request, response);
				response.sendRedirect("RegisterFailure.jsp");
			}
			
		}
	}

}

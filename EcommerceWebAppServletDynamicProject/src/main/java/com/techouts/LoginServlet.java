



package com.techouts;

import jakarta.persistence.metamodel.SetAttribute;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import org.hibernate.Session;

import com.techouts.entity.User;
import com.techouts.helper.Factory;



@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(Session session = Factory.getFactory().openSession()){
//			Receiving the Product Details
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
//			Page Sessions
			HttpSession httpSession = request.getSession();
			String url = (String)httpSession.getAttribute("url");
			Integer productId = (Integer) httpSession.getAttribute("productId");
			
//			Evaluate Weather the User Exist, If Not Redirect to the Login Page
			User user = session.createQuery("from User where email =  :validEmail and password = :validPassword",User.class)
					.setParameter("validEmail", email)
					.setParameter("validPassword", password)
					.uniqueResult();
			if(user != null) {
					httpSession.setAttribute("user", user);
					

					if(url != null && productId != null) {
					httpSession.removeAttribute("url");
					httpSession.removeAttribute("productId");
					
					response.sendRedirect(url+"?id="+productId);
					}
					else if(url != null) {
						httpSession.removeAttribute(url);
						response.sendRedirect(url);
					}
					else {
						response.sendRedirect("HomePageServlet");
					}
				}
			else {
				request.setAttribute("message", "Email or Password Invalid");
				request.getRequestDispatcher("Login.jsp").forward(request, response);
				
			}
		}
	}
}

	

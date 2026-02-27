package com.techouts;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.techouts.entity.User;
import com.techouts.helper.Factory;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(Session session = Factory.getFactory().openSession()){
			String username = request.getParameter("username");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			String cofirmPassword = request.getParameter("confirmPassword");
			String phoneNumber = request.getParameter("phonenumber");
//			Page Sessions
			HttpSession httpSession = request.getSession();
			String url = (String)httpSession.getAttribute("url");
			Integer productId = (Integer) httpSession.getAttribute("productId");
			
			User user = session.createQuery("from User where email =  :validEmail",User.class).setParameter("validEmail", email).uniqueResult();
			System.out.println(user);
			if(user == null) {
				if(password.equals(cofirmPassword)) {
					Transaction transaction = session.beginTransaction();
					User u = new User();
					u.setEmail(email);
					u.setPassword(password);
					u.setUserName(username);
					u.setPhoneNumber(phoneNumber);
					u.setCart(null);
					session.persist(u);
					transaction.commit();
					
					
					HttpSession sessions = request.getSession();
					sessions.setAttribute("user", u);
					
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
					request.setAttribute("message", "Password Invalid");
					request.getRequestDispatcher("Register.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("message", "Email Already Exist");
				request.getRequestDispatcher("Register.jsp").forward(request, response);
				
			}
		}
	}

}

package com.techouts;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/IncrementProductsServlet")
public class IncrementProductsServlet extends HttpServlet{
public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
	
		try(Session session = HibernateUtil.getFactory().openSession()) {
			 session.beginTransaction();
			int productId = (Integer)request.getAttribute("productId");
			AddToCart ac = session.find(AddToCart.class, productId);
			
			int value = ac.getProductCount();
			ac.setProductCount(value+1);
			session.persist(ac);
			session.getTransaction().commit();
			response.sendRedirect("AddToCart.jsp");
			
		}
		
		
	}
}

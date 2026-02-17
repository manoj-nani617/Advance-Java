package com.techouts;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RemoveCartServlet")
public class RemoveCartServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int productId = Integer.parseInt(request.getParameter("productId"));
		try(Session session = HibernateUtil.getFactory().openSession()){
			Transaction transaction = session.beginTransaction();
			AddToCart ad = session.find(AddToCart.class, productId);
			int val = ad.getProductCount()-1;
			if(val <= 0) {
				AddToCart ad1 = session.find(AddToCart.class, productId);
				session.remove(ad);
			}
			else ad.setProductCount(val);
			transaction.commit();
			response.sendRedirect("AddToCart.jsp");
			
		}
		
		
		
	}
	
	
	

}

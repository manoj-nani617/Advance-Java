package com.techouts;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class AddToCartServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		int productId = Integer.parseInt(request.getParameter("productId"));
		String productName = request.getParameter("productName");
		int productPrice = Integer.parseInt(request.getParameter("productPrice"));
		String imageurl = request.getParameter("imageurl");
		
//		response.getWriter().println(productId);
//		response.getWriter().println(productName);
//		response.getWriter().println(productPrice);
//		response.getWriter().println(imageurl);
		
		try(Session session = HibernateUtil.getFactory().openSession()) {
			Transaction transaction = session.beginTransaction();
			Query<AddToCart> q = session.createQuery("from AddToCart where productId = :id",AddToCart.class);
			q.setParameter("id",productId);
			AddToCart unique = q.uniqueResult();
			if(unique != null) {
				
				request.setAttribute("productId", productId);
				RequestDispatcher rd = request.getRequestDispatcher("/IncrementProductsServlet");
				rd.forward(request, response);
			}
			else {
				AddToCart ac = new AddToCart();
				ac.setProductId(productId);
				ac.setProductName(productName);
				ac.setProductPrice(productPrice);
				ac.setImageurl(imageurl);
				int value = ac.getProductCount()+1;
				ac.setProductCount(value);
				session.persist(ac);
				transaction.commit();
				response.sendRedirect("CartPage.jsp");
				
			}
			
			
		}
		response.getWriter().println("Execution is completed");
		
		
	}
}

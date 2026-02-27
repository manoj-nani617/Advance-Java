package com.techouts;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.techouts.entity.Cart;
import com.techouts.entity.Products;
import com.techouts.entity.User;
import com.techouts.helper.Factory;

/**
 * Servlet implementation class AddToCartServlet
 */
@WebServlet("/AddToCartServlet")
public class AddToCartServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Getting the product Id
		String idString = request.getParameter("id");
		
//		Check Product is Null 
		if(idString  != null) {
			int id = Integer.parseInt(idString);
			 
			SessionFactory factory = Factory.getFactory();
			try(Session session = factory.openSession()) {
				Transaction transaction = session.beginTransaction();
				
//				Fetching the product
				Products p = session.find(Products.class, id);
				if(p != null) {
					HttpSession sessionProduct = request.getSession();
					
//					Check User Logged In If Not Redirect to The Login Page
					User u = (User) sessionProduct.getAttribute("user");
					if(u == null ) {
						sessionProduct.setAttribute("url", "AddToCartServlet");
						sessionProduct.setAttribute("productId", id);
						response.sendRedirect("Login.jsp");
						return;
					}
					
//					Check Already Product is present or not
					Cart existingCart = session.createQuery(
						    "from Cart where user.userId = :uid and product.productId = :pid", Cart.class)
						    .setParameter("pid", id).setParameter("uid", u.getUserId())
						    .uniqueResult();

//					If Product is present Add the Count
					if(existingCart != null) {
						existingCart.setProductCount(existingCart.getProductCount()+1);
						transaction.commit();
						request.setAttribute("product", p);
						request.getRequestDispatcher("productDescriptionPage.jsp").forward(request, response);
					}
					
//					If Cart is not there Create New product Cart
					else {
						Cart newCart = new Cart();
						newCart.setProductCount(1);
						newCart.setProduct(p);
						newCart.setUser(u);
						session.persist(newCart);
						transaction.commit();
						request.setAttribute("product", p);
						request.getRequestDispatcher("productDescriptionPage.jsp").forward(request, response);
						
					}
				}
				else {
					System.out.println("Product Not found");
					
				}

				
			}
			
			
			

		}
		
	}



}

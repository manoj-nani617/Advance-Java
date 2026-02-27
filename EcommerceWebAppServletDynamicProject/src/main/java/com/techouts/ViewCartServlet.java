package com.techouts;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.techouts.entity.Cart;
import com.techouts.entity.Products;
import com.techouts.entity.User;
import com.techouts.helper.Factory;

/**
 * Servlet implementation class ViewCartServlet
 */
@WebServlet("/ViewCartServlet")
public class ViewCartServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession httpSession = request.getSession();
		User user = (User) httpSession.getAttribute("user");
		if(user == null) {
			httpSession.setAttribute("url", "ViewCartServlet");
			response.sendRedirect("Login.jsp");
			return;
		}
		 try (Session session = Factory.getFactory().openSession()) {
			 	
		        List<Cart> cartItems = session.createQuery(
		                "from Cart where user.userId = :uid",  
		                Cart.class)
		                .setParameter("uid", user.getUserId())
		                .list();
		        
		        int total = 0;
				for(Cart c : cartItems) {
					Products p = c.getProduct();
					int quantity = c.getProductCount();
					int productPrice = Integer.parseInt(p.getProductPrice());
					total += quantity*productPrice;
				}
				httpSession.setAttribute("price", total);
				httpSession.setAttribute("cartItems", cartItems);
				response.sendRedirect("AddToCart.jsp");
		    }

			
		}

	}




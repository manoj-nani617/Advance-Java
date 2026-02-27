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

import com.techouts.entity.Cart;
import com.techouts.entity.User;
import com.techouts.helper.Factory;

/**
 * Servlet implementation class IncreaseServlet
 */
@WebServlet("/IncreaseServlet")
public class IncreaseServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idString = request.getParameter("id");
		if(idString != null) {
			int id = Integer.parseInt(idString);
			try(Session session = Factory.getFactory().openSession()) {
				HttpSession httpSession = request.getSession();
				User u = (User)httpSession.getAttribute("user");
				Cart c = session.createQuery("from Cart where product.productId = :pId and user.userId = :uId ",Cart.class)
						.setParameter("pId", id)
						.setParameter("uId", u.getUserId())
						.uniqueResult();
			 Transaction transaction = session.beginTransaction();
			 c.setProductCount(c.getProductCount()+1);
			 transaction.commit();
			 response.sendRedirect("ViewCartServlet");
			
			}
		}
	}

	

}

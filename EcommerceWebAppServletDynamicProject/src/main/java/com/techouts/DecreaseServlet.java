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
import com.techouts.entity.Products;
import com.techouts.entity.User;
import com.techouts.helper.Factory;
@WebServlet("/DecreaseServlet")
public class DecreaseServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idString = request.getParameter("id");
		if(idString != null) {
			int id = Integer.parseInt(idString);
			try(Session session = Factory.getFactory().openSession()){
				Transaction transaction = session.beginTransaction();
				HttpSession httpSession = request.getSession();
				User u = (User)httpSession.getAttribute("user");
				Cart c = session.createQuery("from Cart where product.productId = :pId and user.userId = :uId",Cart.class)
						.setParameter("pId", id)
						.setParameter("uId",u.getUserId())
						.uniqueResult();
				System.out.println(c);
				if(c.getProductCount() == 1) {
					session.remove(c);
					
				}
				else {
					System.out.println("It is enteriing into the decreasing count");
					c.setProductCount(c.getProductCount()-1);
				}
				transaction.commit();
				request.getRequestDispatcher("ViewCartServlet").forward(request, response);;
			}
		}
	}

}

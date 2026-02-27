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

import com.techouts.entity.OrderItems;
import com.techouts.entity.Orders;
import com.techouts.entity.Products;
import com.techouts.entity.User;
import com.techouts.helper.Factory;

/**
 * Servlet implementation class OrderServlet
 */
@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession httpSession = request.getSession();
			User user = (User) httpSession.getAttribute("user");
			
			if(user == null) {
				response.sendRedirect("Login.jsp");
				return;
			}
			else {
				try(Session session = Factory.getFactory().openSession()) {
					Orders order = new Orders();
					Products product = order.getProduct();
					List<Orders> orders = session.createQuery(
						    "select o from Orders o join fetch o.product where o.user = :user",
						    Orders.class)
						    .setParameter("user", user)
						    .list();
					request.setAttribute("orders", orders);
					request.getRequestDispatcher("/Orders.jsp").forward(request, response);
				}
			}
	}



}

package com.techouts;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.techouts.entity.Orders;
import com.techouts.helper.Factory;

/**
 * Servlet implementation class DeleteOrder
 */
@WebServlet("/DeleteOrder")
public class DeleteOrder extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idString = request.getParameter("id");
		System.out.println(idString);
		if(idString != null) {
			int id = Integer.parseInt(idString);
			try(Session session = Factory.getFactory().openSession()){
				Transaction transaction = session.beginTransaction();
				Orders order = session.find(Orders.class, id);
				session.remove(order);
				transaction.commit();
				response.sendRedirect("OrderServlet");
			}
		}
	}



}

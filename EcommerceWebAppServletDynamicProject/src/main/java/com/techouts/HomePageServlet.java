package com.techouts;

import jakarta.persistence.Query;
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
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techouts.entity.Products;
import com.techouts.helper.Factory;
/**
 * Servlet implementation class HomePageServlet
 */
@WebServlet("/HomePageServlet")
public class HomePageServlet extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SessionFactory factory = Factory.getFactory();
		try(Session session = factory.openSession()) {
			System.out.println("Connection Success");


			List<Products> products = session.createQuery("from Products",Products.class).list();
	
			request.setAttribute("products", products);
			request.getRequestDispatcher("/HomePage.jsp").forward(request, response);
			
			
			
		}
	}



}

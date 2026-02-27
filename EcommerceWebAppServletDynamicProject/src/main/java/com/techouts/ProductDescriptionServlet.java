package com.techouts;

import jakarta.persistence.Query;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techouts.entity.Products;
import com.techouts.helper.Factory;


@WebServlet("/ProductDescriptionServlet")
public class ProductDescriptionServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SessionFactory factory = Factory.getFactory();
		String idString = request.getParameter("id");
		
//		Check id is null or not
		if(idString != null) {
			int id = Integer.parseInt(idString);
			
//			Found the Product
			try(Session session = factory.openSession()) {
			Products p = session.find(Products.class,id);
			request.setAttribute("product", p);
			request.getRequestDispatcher("/productDescriptionPage.jsp").forward(request, response);
			}
			
		}
		else {
			System.out.println("Product Not Found");
		}
	}


}

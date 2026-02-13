//package com.techouts;
//
//import jakarta.servlet.RequestDispatcher;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * Servlet implementation class ServletForwardingJsp
// */
//@WebServlet("/ServletForwardingJsp")
//public class ServletForwardingJsp extends HttpServlet {
//	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setAttribute("username", "manoj");
//		request.setAttribute("password", "manojkasu");
//		RequestDispatcher rd = request.getRequestDispatcher("GettingRequestFromServlet.jsp");
//		rd.forward(request, response);
//
//
//	}
//
//}

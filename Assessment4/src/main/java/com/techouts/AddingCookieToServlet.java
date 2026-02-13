//package com.techouts;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.Cookie;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * Servlet implementation class AddingCookieToServlet
// */
//@WebServlet("/AddingCookieToServlet")
//public class AddingCookieToServlet extends HttpServlet {
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//			String username = (String)request.getParameter("username");
//			String password = (String)request.getParameter("password");
//			Cookie cs = new Cookie("username",username);
//			response.addCookie(cs);
//			response.sendRedirect("ReadingCookie.jsp");
//	}
//
//}

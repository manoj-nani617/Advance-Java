//package com.techouts;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
///**
// * Servlet implementation class ReadDataFromdoPost
// */
//@WebServlet("/ReadDataFromdoPost")
//public class ReadDataFromdoPost extends HttpServlet {
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String username = (String)request.getParameter("email");
//		String password = (String)request.getParameter("password");
//
//		PrintWriter out = response.getWriter();
//
//		response.getWriter().println("<html>");
//		response.getWriter().println("<head>");
//		response.getWriter().println("<title>Welcome</title>");
//		response.getWriter().println("<style>body {color : white;}</style>");
//		response.getWriter().println("</head>");
//		response.getWriter().println("<body bgcolor = 'black'>");
//
//		out.println("<p>Username: </p"+username);
//		out.println("<p>password: </p"+password);
//		response.getWriter().println("<p>Welcome to the Page</p>");
//		response.getWriter().println("</body>");
//		response.getWriter().println("</html>");
//	}
//
//}

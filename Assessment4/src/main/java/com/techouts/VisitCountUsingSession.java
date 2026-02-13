//package com.techouts;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
///**
// * Servlet implementation class VisitCountUsingSession
// */
//@WebServlet("/VisitCountUsingSession")
//public class VisitCountUsingSession extends HttpServlet {
//	public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException {
//		HttpSession session = request.getSession(true);
//		Integer count = (Integer) session.getAttribute("visitCount");
//
//		if(count == null)
//			count = 1;
//		else count++;
//		response.getWriter().println(count+" Increased");
//		PrintWriter out = response.getWriter();
//		session.setAttribute("visitCount", count);
////
////		out.println("<html>");
////        out.println("<head><title>Visit Counter</title></head>");
////        out.println("<body style='font-family:Arial;text-align:center;padding-top:50px'>");
////
////        out.println("<h1>Welcome!</h1>");
////        out.println("<h2>You visited this page: " + count + " times</h2>");
////
////        out.println("<a href='index.html'>Refresh Page</a>");
////
////        out.println("</body>");
////        out.println("</html>");
//
//
//
//	}
//
//}

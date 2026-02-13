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
// * Servlet implementation class SettingRequestToTransfer
// */
//@WebServlet("/SettingRequestToTransfer")
//public class SettingRequestToTransfer extends HttpServlet {
//	public void service(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException {
//		request.setAttribute("username", "manoj");
//		RequestDispatcher rd = request.getRequestDispatcher("/connect");
//		rd.forward(request, reponse);
//	}
//
//}

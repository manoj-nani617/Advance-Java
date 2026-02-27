package com.techouts;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.techouts.entity.User;


@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession httpSession = request.getSession();
		User user = (User)httpSession.getAttribute("user");
		if(user == null) {
			response.sendRedirect("Login.jsp");
			return;
		}
		else {
			response.sendRedirect("Profile.jsp");
		}
	}



}

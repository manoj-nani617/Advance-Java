//package com.techouts;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
///**
// * Servlet implementation class ConnectsAndDisplayRecords
// */
//@WebServlet("/ConnectsAndDisplayRecords")
//public class ConnectsAndDisplayRecords extends HttpServlet {
//	Connection con;
//	public void init() {
//		try {
//		Class.forName("org.postgresql.Driver");
//		 con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/student","postgres","manojkasu");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		try {
//			PreparedStatement ps = con.prepareStatement("select * from student");
//			ResultSet rs = ps.executeQuery();
//			while(rs.next()) {
//				response.getWriter().println(
//				        rs.getInt(1) + "  " +
//				        rs.getString(2) + "  " +
//				        rs.getString(3) + "  " +
//				        rs.getString(4) + "  " +
//				        rs.getInt(5) + "<br>"
//				    );
//			}
//			rs.close();
//			ps.close();
//			con.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//
//}

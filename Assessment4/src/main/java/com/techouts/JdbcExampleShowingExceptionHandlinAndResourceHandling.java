//package com.techouts;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class JdbcExampleShowingExceptionHandlinAndResourceHandling {
//	public static void main(String[] args) {
//
////		Resource Closing
//		try(
//				Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/student","postgres","manojkasu");
//				PreparedStatement ps = con.prepareStatement("select * from student");
//				ResultSet rs = ps.executeQuery();
//				) {
//			Class.forName("org.postgresql.Driver");
//
//
//				while(rs.next()) {
//					System.out.println(
//					        rs.getInt(1) + "  " +
//					        rs.getString(2) + "  " +
//					        rs.getString(3) + "  " +
//					        rs.getString(4) + "  " +
//					        rs.getInt(5) + "<br>"
//					    );
//				}
//				rs.close();
//				ps.close();
//				con.close();
//
////				Exception Handling
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	}
//
//
//}

//package com.techouts;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class InsertRecordIntoJdbc {
//	public static void main(String[] args) {
//		try {
//			Class.forName("org.postgresql.Driver");
//			 Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/student","postgres","manojkasu");
//			 PreparedStatement ps = con.prepareStatement("select * from student");
//				ResultSet rs = ps.executeQuery();
//
////				Reading
//				while(rs.next()) {
//					System.out.println(
//					        rs.getInt(1) + "  " +
//					        rs.getString(2) + "  " +
//					        rs.getString(3) + "  " +
//					        rs.getString(4) + "  " +
//					        rs.getInt(5) + "<br>"
//					    );
//				}
//
////				Inserting into the table
//
////				PreparedStatement ps2 = con.prepareStatement("insert into student(name,email,course,marks) values('manideep','manideepgurram@gmail.co','python',20)");
//
////				Update the Table
////				PreparedStatement ps2 = con.prepareStatement("update student set email = ? where id = ?");
////				ps2.setString(1, "manideep");
////				ps2.setInt(2,6);
//
////				Delete Record In Table
////				PreparedStatement ps2 = con.prepareStatement("delete from student  where id = ?");
////				ps2.setInt(1,6);
//
//
////				int rowAffected = ps2.executeUpdate();
////				System.out.println("row Affected "+rowAffected);
//				rs.close();
//				ps.close();
//				con.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	}
//}

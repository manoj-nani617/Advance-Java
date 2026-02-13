package com.techouts.jdbc;

import java.sql.*;


public class JdbcConnectivity {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/manoj","postgres","manojkasu");

//        Creating the Statement
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from student");


//        Getting Meta Data
        ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();
        for(int i = 1; i <= columnCount; i++)
        {
            System.out.print(metaData.getColumnName(i)+"\t");
        }
        System.out.println();

//        Printing Details of the Table
        while(rs.next()) {
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
        }

//        Inserting into the  table


//        PreparedStatement ps =  con.prepareStatement("insert into student(name)values(?)");
//        ps.setString(1,"Ganesh");
//
//        int rowsAffected = ps.executeUpdate();
//        System.out.println("Rows Affected "+rowsAffected);

//        Update the record in table
//        PreparedStatement ps = con.prepareStatement("update student set name = ? where rollno = ?");
//        ps.setString(1,"Ajaay");
//        ps.setInt(2,6);
//        int rowAffected = ps.executeUpdate();
//        System.out.println("Row Affected "+rowAffected);

//        Delete The Table

//        PreparedStatement ps = con.prepareStatement("delete from student where rollno = ?");
//        ps.setInt(1,6);
//        int rowAffected = ps.executeUpdate();
//        System.out.println("Row Affected "+rowAffected);



    }
}

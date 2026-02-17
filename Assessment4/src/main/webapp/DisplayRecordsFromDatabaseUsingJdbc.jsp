<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// Loading the Driver
	Class.forName("org.postgresql.Driver");

	//Connecting the database
	Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/student","postgres","manojkasu");
	
	//Creating Statement
	PreparedStatement ps = con.prepareStatement("select * from student");
	
	//Fetching the Details
	ResultSet rs = ps.executeQuery();
	while(rs.next()) {
	    out.println(
	        rs.getInt(1) + "  " +
	        rs.getString(2) + "  " +
	        rs.getString(3) + "  " +
	        rs.getString(4) + "  " +
	        rs.getInt(5) + "<br>"
	    );
	}

%>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// Reading the Data From Client
	String username = (String)request.getParameter("username");
	String password = (String)request.getParameter("password");
	
	// Printing on the server
	out.println("Username: "+username);
	out.println("password: "+password);
%>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import= "java.time.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
LocalTime time = LocalTime.now();
out.println("Time "+time+"\t");
LocalDate today = LocalDate.now();
out.println("Date "+today);
%>

</body>
</html>
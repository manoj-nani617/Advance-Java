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

	int id = (Integer) session.getAttribute("id");
	if(session != null) 
	{
		out.print("Session Found");
		out.println(id);
	}
	else out.println("Session Not Found");
	
%>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Successful</title>

<!-- Auto redirect after 3 seconds-->
 <meta http-equiv="refresh" content="2;url=HomePage.jsp">

<style>
    body {
        font-family: Arial, sans-serif;
        background: cyan;
        color: white;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        margin: 0;
    }

    .box {
    	width : 100px;
    	height : 100px;
       border : 10px dashed white;
       border-radius : 100px;
       animation : spin 5s linear infinite;
    }
    @keyframes spin {
    from {
    transform : rotate(0deg);
    } 
    to {
    transform : rotate(360deg);
    }
    
   
    }

</style>
</head>
<body>

<div class="box">
</div>

</body>
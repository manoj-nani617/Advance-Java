<%@ page import="com.techouts.entity.Products,com.techouts.entity.User" %>
<%@ page import="java.util.List" %>

<%
    Products product = (Products) request.getAttribute("product");
	User user = (User) session.getAttribute("user");
    if (product == null) {
        response.sendRedirect("home.jsp"); // redirect if product not found
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title><%= product.getProductName() %> - Details</title>
    <style>
        body { font-family: Arial, sans-serif; background: #f4f4f4; }
        .container { width: 60%; margin: 50px auto; background: #fff; padding: 20px; border-radius: 10px; }
        img { width: 100%; max-height: 400px; object-fit: contain; border-radius: 5px; }
        h2 { margin-top: 10px;text-align : center; }
        .price { color: green; font-weight: bold; margin: 15px 0; font-size: 1.3em; }
        p { line-height: 1.5em; text-align : center; }
        a { text-decoration: none; color: #333; } 
        .buttons{display:flex;flex-direction:column; justify-content : center; align-items :center; gap : 20px;  }
        .buttons button {width : 300px; height : 50px; 
        				border-radius: 10px; outline: none; border: none;
        				background-color: #2563eb; color : white ;box-shadow: 0 4px 10px rgba(37, 99, 235, 0.3);
    						transition: all 0.3s ease;
        				 }
        .buttons button:hover { background-color:  #1e40af; transform: translateY(-2px);}
    </style>
</head>
<body>
    <div class="container">
        <a href="HomePageServlet">Back to Products</a>
        <h2><%= product.getProductName() %></h2>
        <img src="<%= product.getImageUrl() %>" alt="<%= product.getProductName() %>">
        <p class="price"><%= product.getProductPrice() %></p>
       	<div class = "buttons">
       	<a href = "<%=request.getContextPath()%>/AddToCartServlet?id=<%=product.getProductId()%>"><button>Add To Cart</button></a> 
       	</div>
       	<h2>Description</h2>
        <p><%= product.getProductDescription() %></p>
    </div>
</body>
</html>
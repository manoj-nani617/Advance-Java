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
        .container { width: 60%; margin: 50px auto; background: #fff; padding: 20px; border-radius: 10px;}
        .header-container {
			background :  #007bff;
			width 100%;
			height : 50px;
			border-radius : 10px;
			display : flex;
			justify-content : space-between;
			}
		.logo {
			width : 300px;
			height : 50px;
			display : flex;
			justify-content: center;
			align-items : center;
			color : white;
			}
        .button-container {
			width : 600px;
			height : 50x;
			display : flex;
			justify-content : space-between;
			align-items: center;
	
			}
		.button-container button {
			width :100px;
			height : 30px;
			background : white;
			outline : none;
			border :none;
			color : black;
			border-radius : 10px;
			box-shadow: 0 2px 8px rgba(0,0,0,0.1);
    		transition: transform 0.2s, box-shadow 0.2s;
			}
		.button-container button:hover {
			transform: translateX(-1px);
    		box-shadow: 0 6px 12px rgba(0,0,0,0.2);
	
			}
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
	<div class="header-container">
		<div class = "logo">
		<h2>MVR Products</h2>
		</div>
		<div class = "button-container">
		<a href = "${pageContext.request.contextPath}/home"><button>Orders</button></a>
		<a href = "${pageContext.request.contextPath}/viewcart"><button>Cart</button></a>
		<a href = "${pageContext.request.contextPath}/orders"><button>Profile</button></a>
		</div>
	</div>
    <div class="container">   
        <h2><%= product.getProductName() %></h2>
        <img src="<%= product.getImageUrl() %>" alt="<%= product.getProductName() %>">
        <p class="price"><%= product.getProductPrice() %></p>
       	<div class = "buttons">
       	<a href = "${pageContext.request.contextPath}/addtocart?id=<%=product.getProductId()%>"><button>Add To Cart</button></a> 
       	</div>
       	<h2>Description</h2>
        <p><%= product.getProductDescription() %></p>
    </div>
</body>
</html>
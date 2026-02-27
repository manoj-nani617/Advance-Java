<%@ page import="java.util.List" %>
<%@ page import="com.techouts.entity.Orders,com.techouts.entity.Products" %>
<html>
<head>
<style>
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
	width : 400px;
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
</style>
<body>
<%
List<Orders> orders = (List<Orders>) request.getAttribute("orders");
%>
<div class="header-container">
		<div class = "logo">
		<h2>MVR Products</h2>
		</div>
		<div class = "button-container">
		<a href = "ViewCartServlet"><button>Cart</button></a>
		<a href = "Profile.jsp"><button>Profile</button></a>
		<a href = "LogoutServlet"><button>Logout</button></a>
		
		</div>
	</div>
<h2>My Orders</h2>

<% if(orders != null){ %>
<% for(Orders order : orders){ %>

<div style="border:1px solid black; padding:10px; margin:10px;">
	<img src="<%= order.getProduct().getImageUrl() %>" width="150">
    <h3>Order ID: <%= order.getOrderId() %></h3>
    <p>Product: <%= order.getProduct().getProductName() %></p>
    <p>Quantity: <%= order.getOrdercount() %></p>
    <p>Amount: <%= order.getAmount() %></p>
    <p>Address: <%= order.getAddress() %></p>
	<a href = "DeleteOrder?id=<%= order.getOrderId() %>"><button class = "cancelOrder">Cancel Order</button></a>
</div>

<% } %>

<% } %>

</body>
</head>
</html>

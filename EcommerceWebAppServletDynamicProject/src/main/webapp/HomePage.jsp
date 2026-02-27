<%@page import="com.techouts.entity.Products"%>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>

<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
    margin: 0;
    padding: 0;
}

.container {
    width: 90%;
    margin: 20px auto;
}
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
h2 {
    text-align: center;
    margin-bottom: 30px;
}

.products-grid {
    display: grid;
    grid-template-columns: repeat(auto-fill, minmax(250px, 1fr));
    gap: 20px;
}

.product-card {
    background: white;
    padding: 15px;
    border-radius: 8px;
    box-shadow: 0 2px 8px rgba(0,0,0,0.1);
    transition: transform 0.2s, box-shadow 0.2s;
    display: flex;
    flex-direction: column;
    align-items: center;
    text-align: center;
}

.product-card:hover {
    transform: translateY(-5px);
    box-shadow: 0 6px 12px rgba(0,0,0,0.2);
}

.product-card img {
    width: 100%;
    height: 200px;
    object-fit: cover;
    border-radius: 5px;
    margin-bottom: 10px;
}

.product-card h3 {
    margin: 10px 0 5px 0;
    font-size: 1.2em;
}

.product-card p {
    font-size: 0.9em;
    color: #555;
}

.price {
    color: green;
    font-weight: bold;
    margin-top: 10px;
}
a {
	text-decoration : none;
	color : black;
}

</style>

</head>
<body>
<header>
	<div class="header-container">
		<div class = "logo">
		<h2>MVR Products</h2>
		</div>
		<div class = "button-container">
		<a href = "OrderServlet"><button>Orders</button></a>
		<a href = "ViewCartServlet"><button>Cart</button></a>
		<a href = "Profile.jsp"><button>Profile</button></a>
		<a href = "Login.jsp"><button>Login</button></a>
		<a href = "LogoutServlet"><button>Logout</button></a>
		
		</div>
	</div>
</header>
<div class="container">
    <h2>All Products</h2>

    <div class="products-grid">
    <%
        List<Products> list = (List<Products>) request.getAttribute("products");

        if (list != null && !list.isEmpty()) {
            for (Products p : list) {
    %>

        <div class="product-card">
        
    <a href="ProductDescriptionServlet?id=<%= p.getProductId() %>">
        <img src="<%= p.getImageUrl() %>" alt="<%= p.getProductName() %>">
        <h3><%= p.getProductName() %></h3>
        <p class="price"><%= p.getProductPrice() %></p>
    </a>
</div>

    <%
            }
        } else {
    %>
        <p>No Products Available</p>
    <%
        }
    %>
    </div>
</div>

</body>
</html>
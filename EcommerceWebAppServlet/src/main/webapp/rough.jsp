<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.techouts.HibernateUtil,org.hibernate.Session,org.hibernate.*,com.techouts.AddToCart" %>
<%@ page import = "java.util.*" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>My Cart</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family: Arial, Helvetica, sans-serif;
}

/* ===== HEADER ===== */
.header{
    height:60px;
    background:#007bff;
    color:white;
    display:flex;
    align-items:center;
    justify-content:space-between;
    padding:0 30px;
}

.logo{
    font-size:22px;
    font-weight:bold;
}

.nav a{
    color:white;
    text-decoration:none;
    margin-left:20px;
    font-weight:bold;
}

/* ===== BODY ===== */
body{
    background:#f5f6fa;
}

/* ===== CART CONTAINER ===== */
.cart-container{
    width:80%;
    margin:40px auto;
    background:white;
    border-radius:10px;
    padding:30px;
    box-shadow:0 5px 15px rgba(0,0,0,0.1);
}

.cart-title{
    font-size:26px;
    margin-bottom:20px;
}

/* ===== CART ITEMS ===== */
.cart-item{
    display:flex;
    align-items:center;
    justify-content:space-between;
    border-bottom:1px solid #eee;
    padding:20px 0;
}

.cart-item img{
    width:100px;
    height:100px;
    border-radius:8px;
}

.item-info{
    flex:1;
    margin-left:20px;
}

.item-name{
    font-size:18px;
    font-weight:bold;
}

.item-price{
    color:#007bff;
    margin-top:5px;
}

/* ===== BUTTONS ===== */
.qty-box{
    display:flex;
    align-items:center;
    gap:10px;
}

.qty-box button{
    width:35px;
    height:35px;
    border:none;
    background:#007bff;
    color:white;
    font-size:18px;
    border-radius:6px;
    cursor:pointer;
}

.remove{
    background:#dc3545;
}

/* ===== TOTAL SECTION ===== */
.total-section{
    margin-top:30px;
    display:flex;
    justify-content:space-between;
    align-items:center;
}

.checkout-btn{
    padding:10px 25px;
    background:#28a745;
    color:white;
    border:none;
    border-radius:6px;
    font-size:16px;
    cursor:pointer;
}

.back-btn{
    padding:10px 20px;
    background:#6c757d;
    color:white;
    border:none;
    border-radius:6px;
    cursor:pointer;
}
</style>
</head>

<body>

<!-- HEADER -->
<div class="header">
    <div class="logo">E-Shop</div>
    <div class="nav">
        <a href="home.jsp">Home</a>
        <a href="cart.jsp">Cart</a>
        <a href="profile.jsp">Profile</a>
    </div>
</div>


<!-- CART -->
<div class="cart-container">

    <div class="cart-title">My Cart</div>
	    <%
		try(Session s = HibernateUtil.getFactory().openSession();){
		List<AddToCart> ac = s.createQuery("from AddToCart",AddToCart.class).list();
		ArrayList<Integer> productIds = method(ac);
		HashMap<Integer,Integer> map = new HashMap<>();
		for(Integer i : productIds) {
	           map.put(i,map.getOrDefault(i,0)+1);
	        }
	        for(Integer i : map.keySet()){
	        	System.out.println(i+"\t"+map.get(i));
	        	
	        }
	
		%>
		<%!
			public ArrayList<Integer> method(List<AddToCart> list) {
			ArrayList<Integer> productId = new ArrayList<>();
			return productId;
			
			
		}
		
		%>


		<%for(Integer i : map.keySet()){%>
		
    	<div class="cart-item">
        <img src = "">

        <div class="item-info">
            <div class="item-name">Running Shoes</div>
            <div class="item-price">₹1999</div>
        </div>

        <div class="qty-box">
		<form action = "RemoveCartServlet" method = "post">
			<input type ="hidden" name = "id" value = "<%=ac.get(i).getId() %>">
			<button type = "submit">-</button>
		</form>
            <span>1</span>
        <form action = "AddToCartServlet" method = "post">
			<input type ="hidden" name = "productId" value = "<%=ac.get(i).getProductId() %>">
			<input type = "hidden" name = "productName" value = "<%=ac.get(i).getProductName()%>">
			<input type = "hidden" name = "productPrice" value = "<%=ac.get(i).getProductPrice() %>">
			<input type = "hidden" name = "imageurl" value = "<%=ac.get(i).getImageurl()%>">
			<button type = "submit">+</button>
		</form>
            <button class="remove">X</button>
        </div>
    </div>
    	<% }%>
		<%} %>


    <!-- TOTAL -->
    <div class="total-section">
        <button class="back-btn" onclick="location.href='home.jsp'">
            ← Continue Shopping
        </button>

        <h2>Total: ₹9000</h2>

        <button class="checkout-btn">
            Checkout
        </button>
    </div>

</div>

</body>
</html>

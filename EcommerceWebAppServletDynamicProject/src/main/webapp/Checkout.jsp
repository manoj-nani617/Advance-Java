<%@ page import="java.util.List" %>
<%@ page import="com.techouts.entity.Cart" %>
<%@ page import="com.techouts.entity.User" %>

<%
    User user = (User) session.getAttribute("user");

    if(user == null){
        response.sendRedirect("Login.jsp");
        return;
    }

    List<Cart> cartItems = (List<Cart>) session.getAttribute("cartItems");
    Integer totalAmount = (Integer) session.getAttribute("price");
	System.out.println(cartItems);
    if(cartItems == null || cartItems.isEmpty()){
%>
        <h2 style="text-align:center;">Your Cart is Empty</h2>
<%
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Checkout</title>

<style>
body {
    margin: 0;
    font-family: Arial, sans-serif;
    background-color: #f5f5f5;
}

.container {
    width: 90%;
    max-width: 1000px;
    margin: 40px auto;
    display: flex;
    gap: 30px;
    flex-wrap: wrap;
}

.box {
    background: white;
    padding: 20px;
    border-radius: 8px;
    flex: 1;
    min-width: 300px;
    box-shadow: 0 5px 15px rgba(0,0,0,0.1);
}

h2 {
    margin-top: 0;
}

input, textarea {
    width: 100%;
    padding: 10px;
    margin: 8px 0 15px;
    border-radius: 5px;
    border: 1px solid #ccc;
}

button {
    width: 100%;
    padding: 12px;
    background: black;
    color: white;
    border: none;
    cursor: pointer;
    font-size: 16px;
    transition: background 0.3s ease, transform 0.2s ease;
}

button:hover {
    background: #00bcd4;
    transform: scale(1.02);
}

.cart-item {
    display: flex;
    justify-content: space-between;
    margin-bottom: 10px;
}

.total {
    font-weight: bold;
    margin-top: 15px;
    font-size: 18px;
}

@media (max-width: 768px) {
    .container {
        flex-direction: column;
    }
}
</style>
</head>

<body>

<div class="container">

    <!-- Shipping Details -->
    <div class="box">
        <h2>Shipping Details</h2>

        <form action="PlaceOrderServlet" method="post">

            <label>Full Name</label>
            <input type="text" name="username" value="<%= user.getUserName() %>" required>

            <label>Phone Number</label>
            <input type="text" name="phonenumber" required>

            <label>Address</label>
            <textarea name="address" rows="4" required></textarea>

            <label>Payment Method</label>
            <select name="payment">
                <option value="COD">Cash on Delivery</option>
                <option value="CARD">Credit/Debit Card</option>
                <option value="UPI">UPI</option>
            </select>

            <a href= "OrderServlet"><button type="submit">Place Order</button></a>
        </form>
    </div>

    <!-- Order Summary -->
    <div class="box">
        <h2>Order Summary</h2>

        <% for(Cart c : cartItems){ %>
            <div class="cart-item">
                <span><%= c.getProduct().getProductName() %> x <%= c.getProductCount() %></span>
                <% %>
                
            </div>
        <% } %>

        <div class="total">
            Total:  <%= totalAmount %>
        </div>
    </div>

</div>

</body>
</html>
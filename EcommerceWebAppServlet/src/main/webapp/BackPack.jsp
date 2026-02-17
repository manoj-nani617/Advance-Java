<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "stylesheet" href = "SmartPhone.css">
<style >
button {
cursor: pointer;
}
</style>
</head>
<body>
<h1>Backpack </h1>
<div class = "container">
    <img 
  src="https://images.unsplash.com/photo-1548036328-c9fa89d128fa?w=500&q=60"
  alt="Product Image"  style = "max-width : 100%;height : auto"
>
<div class = "buttons">
<a href = "Order.jsp"><button>OrderNow</button></a>
<form action = "AddToCartServlet" method = "post">
        <input type="hidden" name="productId" value="4">
        <input type="hidden" name="productName" value="Backpack">
        <input type="hidden" name="productPrice" value="25000">
        <input type= "hidden" name = "imageurl" value = "https://images.unsplash.com/photo-1548036328-c9fa89d128fa?w=500&q=60">
        <button type="submit">Add To Cart</button>
        
</form>
</div>
<div class = "details">
<h2> Backpack Specifications</h2>

<ul style="list-style:none; font-family:monospace; padding:0;">

<li><pre>Model:          TravelPro Smart Backpack</pre></li>
<li><pre>Type:           Laptop & Travel Backpack</pre></li>
<li><pre>Capacity:       35 Liters</pre></li>
<li><pre>Material:       Water-Resistant Polyester Fabric</pre></li>
<li><pre>Laptop Slot:    Fits up to 15.6-inch Laptop</pre></li>
<li><pre>Compartments:   3 Main + 6 Organizer Pockets</pre></li>
<li><pre>USB Port:       External USB Charging Port</pre></li>
<li><pre>Security:       Anti-Theft Hidden Pocket</pre></li>
<li><pre>Padding:        Breathable Back & Shoulder Padding</pre></li>
<li><pre>Zippers:        Heavy-Duty Metal Zippers</pre></li>
<li><pre>Straps:         Adjustable Ergonomic Straps</pre></li>
<li><pre>Waterproof:     Yes (Light Rain Protection)</pre></li>
<li><pre>Weight:         750 grams</pre></li>
<li><pre>Dimensions:     48 × 32 × 18 cm</pre></li>
<li><pre>Color:          Black / Grey / Navy Blue</pre></li>
<li><pre>Warranty:       6 Months Manufacturer Warranty</pre></li>
<li><pre>Price:          ₹1,299 (starting)</pre></li>

</ul>

</div>
</div>
</body>
</html>
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
<h1>Shoes </h1>
<div class = "container">
    <img 
  src="https://images.unsplash.com/photo-1542291026-7eec264c27ff?w=600&q=60"
  alt="Product Image"  style = "max-width : 100%;height : auto";
>
<div class = "buttons">
<a href = "Order.jsp"><button>OrderNow</button></a>
<form action = "AddToCartServlet" method = "post">
        <input type="hidden" name="productId" value="12">
        <input type="hidden" name="productName" value="Shoes">
        <input type="hidden" name="productPrice" value="2999">
        <input type= "hidden" name = "imageurl" value = "https://images.unsplash.com/photo-1542291026-7eec264c27ff?w=600&q=60">
        <button type="submit">Add To Cart</button>
        
</form>
</div>
<div class = "details">
<h2>👟 Shoes Specifications</h2>

<ul style="list-style:none; font-family:monospace; padding:0;">

<li><pre>Model:           UltraRun X Sports Shoes</pre></li>
<li><pre>Type:            Running / Sports Shoes</pre></li>
<li><pre>Upper Material:  Breathable Mesh + Synthetic</pre></li>
<li><pre>Midsole:         Cushioned EVA Foam</pre></li>
<li><pre>Outsole:         Rubber Non-Slip Sole</pre></li>
<li><pre>Closure:         Lace-Up</pre></li>
<li><pre>Fit:             Regular Fit</pre></li>
<li><pre>Insole:          Soft Padded Comfort</pre></li>
<li><pre>Weight:          Approx. 300 grams</pre></li>
<li><pre>Color Options:   Black / Blue / Grey / Red</pre></li>
<li><pre>Sizes Available: UK 6 – 12 (EU 39 – 46)</pre></li>
<li><pre>Ideal For:       Running / Gym / Walking</pre></li>
<li><pre>Durability:      High-Grip & Wear-Resistant</pre></li>
<li><pre>Care Instructions: Wipe with Damp Cloth</pre></li>
<li><pre>Warranty:        6 Months Manufacturer Warranty</pre></li>
<li><pre>Price:           ₹1,499 (starting)</pre></li>

</ul>

</div>
</div>
</body>
</html>
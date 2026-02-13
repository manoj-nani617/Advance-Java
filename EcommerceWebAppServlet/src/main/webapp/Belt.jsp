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
<h1>Belt </h1>
<div class = "container">
    <img 
  src="https://images.unsplash.com/photo-1624222247344-550fb60583dc?w=600&q=60"
  alt="Product Image"  style = "max-width : 100%;height : auto";
>
<div class = "buttons">
<a href = "Order.jsp"><button>OrderNow</button></a>
<form action = "AddToCartServlet" method = "post">
        <input type="hidden" name="productId" value="13">
        <input type="hidden" name="productName" value="Belt">
        <input type="hidden" name="productPrice" value="2999">
        <input type= "hidden" name = "imageurl" value = "https://images.unsplash.com/photo-1624222247344-550fb60583dc?w=600&q=60">
        <button type="submit">Add To Cart</button>
        
</form>
</div>
<div class = "details">
<h2>👔 Belt Specifications</h2>

<ul style="list-style:none; font-family:monospace; padding:0;">

<li><pre>Model:           Classic Leather Belt</pre></li>
<li><pre>Type:            Casual / Formal Belt</pre></li>
<li><pre>Material:        Genuine Leather / Faux Leather</pre></li>
<li><pre>Buckle:          Metal Pin Buckle</pre></li>
<li><pre>Width:           1.25 inches (Standard)</pre></li>
<li><pre>Length Options:  S / M / L / XL / XXL</pre></li>
<li><pre>Color Options:   Black / Brown / Tan</pre></li>
<li><pre>Stitching:        Reinforced Double Stitch</pre></li>
<li><pre>Design:           Smooth / Pattern Embossed</pre></li>
<li><pre>Durability:       Wear-Resistant & Long-Lasting</pre></li>
<li><pre>Care Instructions: Wipe with Dry Cloth</pre></li>
<li><pre>Ideal For:        Office / Casual Wear</pre></li>
<li><pre>Warranty:         6 Months Manufacturer Warranty</pre></li>
<li><pre>Price:            ₹799 (starting)</pre></li>

</ul>


</div>
</div>
</body>
</html>
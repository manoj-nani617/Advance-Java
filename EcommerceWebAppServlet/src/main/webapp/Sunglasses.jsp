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
<h1>Sunglasses</h1>
<div class = "container">
    <img 
  src="https://images.unsplash.com/photo-1511499767150-a48a237f0083?w=500&q=60"
  alt="Product Image"  style = "max-width : 100%;height : auto";
>
<div class = "buttons">
<a href = "Order.jsp"><button>OrderNow</button></a>
<form action = "AddToCartServlet" method = "post">
        <input type="hidden" name="productId" value="5">
        <input type="hidden" name="productName" value="SunGlasses">
        <input type="hidden" name="productPrice" value="2999">
        <input type= "hidden" name = "imageurl" value = "https://images.unsplash.com/photo-1511499767150-a48a237f0083?w=500&q=60">
        <button type="submit">Add To Cart</button>
        
</form>
</div>
<div class = "details">
<h2>😎 Sunglasses Specifications</h2>

<ul style="list-style:none; font-family:monospace; padding:0;">

<li><pre>Model:          SunShade Pro X</pre></li>
<li><pre>Type:           UV Protection Sunglasses</pre></li>
<li><pre>Frame Material: Lightweight Polycarbonate</pre></li>
<li><pre>Lens Type:      Polarized Anti-Glare Lenses</pre></li>
<li><pre>UV Protection:  100% UV400 Protection</pre></li>
<li><pre>Lens Color:     Black / Brown / Blue</pre></li>
<li><pre>Frame Style:    Full Rim</pre></li>
<li><pre>Frame Shape:    Aviator / Wayfarer</pre></li>
<li><pre>Weight:         28 grams</pre></li>
<li><pre>Fit Type:       Medium (Unisex)</pre></li>
<li><pre>Nose Pads:      Soft Silicone Nose Pads</pre></li>
<li><pre>Scratch Resist: Yes (Coated Lenses)</pre></li>
<li><pre>Water Resist:   Splash Resistant</pre></li>
<li><pre>Ideal For:      Driving / Travel / Outdoor Sports</pre></li>
<li><pre>Included:       Hard Case + Cleaning Cloth</pre></li>
<li><pre>Warranty:       6 Months Manufacturer Warranty</pre></li>
<li><pre>Price:          ₹899 (starting)</pre></li>

</ul>

</div>
</div>
</body>
</html>
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
<h1>Mouse</h1>
<div class = "container">
    <img 
  src="https://images.unsplash.com/photo-1615663245857-ac93bb7c39e7?w=500&q=60"
  alt="Product Image"  style = "max-width : 100%;height : auto";
>
<div class = "buttons">
<a href = "Order.jsp"><button>OrderNow</button></a>
<form action = "AddToCartServlet" method = "post">
        <input type="hidden" name="productId" value="9">
        <input type="hidden" name="productName" value="Mouse">
        <input type="hidden" name="productPrice" value="2999">
        <input type= "hidden" name = "imageurl" value = "https://images.unsplash.com/photo-1615663245857-ac93bb7c39e7?w=500&q=60">
        <button type="submit">Add To Cart</button>
        
</form>
</div>
<div class = "details">
<h2>🖱 Mouse Specifications</h2>

<ul style="list-style:none; font-family:monospace; padding:0;">

<li><pre>Model:          ClickPro X Wireless Mouse</pre></li>
<li><pre>Type:           Wireless Optical Mouse</pre></li>
<li><pre>Connectivity:   2.4GHz USB Receiver / Bluetooth 5.0</pre></li>
<li><pre>Sensor:         High Precision Optical Sensor</pre></li>
<li><pre>DPI:            800 / 1200 / 1600 / 2400 (Adjustable)</pre></li>
<li><pre>Buttons:        6 Buttons + Scroll Wheel</pre></li>
<li><pre>Click Life:     5 Million Clicks</pre></li>
<li><pre>Battery:        500mAh Rechargeable Battery</pre></li>
<li><pre>Battery Life:   Up to 30 Days (Normal Use)</pre></li>
<li><pre>Charging:       USB-C Fast Charging</pre></li>
<li><pre>Tracking:       Smooth & Accurate Tracking</pre></li>
<li><pre>Compatibility:  Windows / Mac / Linux / Android</pre></li>
<li><pre>Grip:           Ergonomic Comfortable Design</pre></li>
<li><pre>Material:       ABS Plastic Matte Finish</pre></li>
<li><pre>Weight:         85 grams (Lightweight)</pre></li>
<li><pre>Color:          Black / Grey / White / Blue</pre></li>
<li><pre>Included:       Mouse + USB Receiver + Charging Cable</pre></li>
<li><pre>Warranty:       1 Year Manufacturer Warranty</pre></li>
<li><pre>Price:          ₹599 (starting)</pre></li>

</ul>


</div>
</div>
</body>
</html>
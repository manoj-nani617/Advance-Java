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
<h1>Gaming contoller</h1>
<div class = "container">
    <img 
  src="https://images.unsplash.com/photo-1592840496694-26d035b52b48?w=500&q=60"
  alt="Product Image"  style = "max-width : 100%;height : auto";
>
<div class = "buttons">
<a href = "Order.jsp"><button>OrderNow</button></a>
<form action = "AddToCartServlet" method = "post">
        <input type="hidden" name="productId" value="7">
        <input type="hidden" name="productName" value="GamingController">
        <input type="hidden" name="productPrice" value="4999">
        <input type= "hidden" name = "imageurl" value = "https://images.unsplash.com/photo-1592840496694-26d035b52b48?w=500&q=60">
        <button type="submit">Add To Cart</button>
        
</form>
</div>
<div class = "details">
<h2>🎮 Gaming Controller Specifications</h2>

<ul style="list-style:none; font-family:monospace; padding:0;">

<li><pre>Model:          GamePro X Wireless Controller</pre></li>
<li><pre>Type:           Wireless + Wired Gamepad</pre></li>
<li><pre>Compatibility:  PC / Android / iOS / PS4</pre></li>
<li><pre>Connectivity:   Bluetooth 5.0 / USB Cable</pre></li>
<li><pre>Range:          Up to 10 meters</pre></li>
<li><pre>Battery:        600mAh Rechargeable Battery</pre></li>
<li><pre>Play Time:      Up to 12–15 Hours</pre></li>
<li><pre>Charging Time:  2 Hours Fast Charging</pre></li>
<li><pre>Buttons:        12 Action Buttons + 2 Analog Sticks</pre></li>
<li><pre>Triggers:       Dual Pressure Sensitive Triggers</pre></li>
<li><pre>Vibration:      Dual Motor Vibration Feedback</pre></li>
<li><pre>Lighting:       RGB LED Indicator Lights</pre></li>
<li><pre>Grip:           Anti-Slip Textured Grip</pre></li>
<li><pre>Weight:         210 grams</pre></li>
<li><pre>Color:          Black / Red / Blue / White</pre></li>
<li><pre>Material:       ABS Plastic Body</pre></li>
<li><pre>Included:       Controller + USB Cable + Manual</pre></li>
<li><pre>Warranty:       1 Year Manufacturer Warranty</pre></li>
<li><pre>Price:          ₹1,999 (starting)</pre></li>

</ul>


</div>
</div>
</body>
</html>
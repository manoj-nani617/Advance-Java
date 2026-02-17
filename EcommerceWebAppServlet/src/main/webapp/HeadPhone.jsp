<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "stylesheet" href = "SmartPhone.css">
</head>
<body>
<h1>HeadPhones </h1>
<div class = "container">
    <img 
  src="https://images.unsplash.com/photo-1505740420928-5e560c06d30e?w=500&q=60"
  alt="Product Image"  style = "max-width : 100%;height : auto";
>
<div class = "buttons">
<a href = "Order.jsp"><button>OrderNow</button></a>
<form action = "AddToCartServlet" method = "post">
        <input type="hidden" name="productId" value="3">
        <input type="hidden" name="productName" value="HeadPhone">
        <input type="hidden" name="productPrice" value="4999">
        <input type= "hidden" name = "imageurl" value = "https://images.unsplash.com/photo-1505740420928-5e560c06d30e?w=500&q=60">
        <button type="submit">Add To Cart</button>
        
</form>
</div>
<div class = "details">
<h2> Headphone Specifications</h2>

<ul style="list-style:none; font-family:monospace; padding:0;">

<li><pre>Model:          SoundMax Pro X</pre></li>
<li><pre>Type:           Over-Ear Wireless Headphones</pre></li>
<li><pre>Driver Size:    40mm Dynamic Drivers</pre></li>
<li><pre>Sound:          Deep Bass + HD Stereo Audio</pre></li>
<li><pre>Noise Cancel:   Active Noise Cancellation (ANC)</pre></li>
<li><pre>Microphone:     Built-in HD Mic</pre></li>
<li><pre>Connectivity:   Bluetooth 5.3 / AUX Cable</pre></li>
<li><pre>Range:          Up to 10 meters</pre></li>
<li><pre>Battery:        500mAh Rechargeable Battery</pre></li>
<li><pre>Playback Time:  Up to 30 Hours</pre></li>
<li><pre>Charging Time:  2 Hours Fast Charging</pre></li>
<li><pre>Controls:       Volume / Call / Music Buttons</pre></li>
<li><pre>Weight:         220 grams</pre></li>
<li><pre>Color:          Black / White / Blue</pre></li>
<li><pre>Warranty:       1 Year Manufacturer Warranty</pre></li>
<li><pre>Price:          ₹2,499 (starting)</pre></li>

</ul>


</div>
</div>
</body>
</html>
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
<h1>Laptop </h1>
<div class = "container">
    <img 
  src="https://images.unsplash.com/photo-1517336714731-489689fd1ca8?w=500&q=60"
  alt="Product Image"  style = "max-width : 100%;height : auto";
>
<div class = "buttons">
<a href = "Order.jsp"><button>OrderNow</button></a>
<form action = "AddToCartServlet" method = "post">
        <input type="hidden" name="productId" value="2">
        <input type="hidden" name="productName" value="Laptop">
        <input type="hidden" name="productPrice" value="65000">
        <input type= "hidden" name = "imageurl" value = "https://images.unsplash.com/photo-1517336714731-489689fd1ca8?w=500&q=60">
        <button type="submit">Add To Cart</button>
        
</form>
</div>
<div class = "details">
<h2>💻 Laptop Specifications</h2>

<ul style="list-style:none; font-family:monospace; padding:0;">

<li><pre>Model:          ProBook X15</pre></li>
<li><pre>Display:        15.6-inch Full HD IPS (1920 × 1080)</pre></li>
<li><pre>Processor:      Intel Core i7 13th Generation</pre></li>
<li><pre>RAM:            16GB DDR4</pre></li>
<li><pre>Storage:        512GB NVMe SSD</pre></li>
<li><pre>Graphics:       NVIDIA RTX 3050 4GB</pre></li>
<li><pre>Operating OS:   Windows 11 Home</pre></li>
<li><pre>Battery:        Up to 8 Hours Backup</pre></li>
<li><pre>Charging:       65W Fast Charging Adapter</pre></li>
<li><pre>Keyboard:       Backlit Keyboard</pre></li>
<li><pre>Webcam:         HD 720p Camera</pre></li>
<li><pre>Audio:          Dual Stereo Speakers</pre></li>
<li><pre>Ports:          USB-C, 2×USB 3.0, HDMI, Audio Jack</pre></li>
<li><pre>Connectivity:   Wi-Fi 6 / Bluetooth 5.2</pre></li>
<li><pre>Weight:         1.8 kg</pre></li>
<li><pre>Color:          Silver / Black</pre></li>
<li><pre>Warranty:       1 Year Manufacturer Warranty</pre></li>
<li><pre>Price:          ₹65,999 (starting)</pre></li>

</ul>

</div>
</div>
</body>
</html>
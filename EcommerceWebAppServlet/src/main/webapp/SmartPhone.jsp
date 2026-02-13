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
<h1>Apple Iphone 15 </h1>
<div class = "container">
    <img 
  src="https://images.unsplash.com/photo-1591337676887-a217a6970a8a?w=500&q=60"
  alt="Product Image"  style = "max-width : 100%;height : auto";
>
<div class = "buttons">
<a href = "Order.jsp"><button>OrderNow</button></a>
<form action = "AddToCartServlet" method = "post">
        <input type="hidden" name="productId" value="1">
        <input type="hidden" name="productName" value="I Phone 15">
        <input type="hidden" name="productPrice" value="25000">
        <input type= "hidden" name = "imageurl" value = "https://images.unsplash.com/photo-1591337676887-a217a6970a8a?w=500&q=60">
        <button type="submit">Add To Cart</button>
        
</form>
</div>
<div class = "details">
<h2>📱 Apple iPhone 15  Specifications</h2>

<ul style="list-style:none; padding:0;">

<li><pre>Display:        6.1-inch Super Retina XDR OLED, 120Hz</pre></li>
<li><pre>Processor:      A17 Pro Bionic Chip</pre></li>
<li><pre>Storage:        128GB / 256GB / 512GB / 1TB</pre></li>
<li><pre>RAM:            8GB</pre></li>
<li><pre>Rear Camera:    48MP + 12MP + 12MP (Triple Camera)</pre></li>
<li><pre>Front Camera:   12MP TrueDepth</pre></li>
<li><pre>Battery:        Up to 22 hours video playback</pre></li>
<li><pre>Charging:       Fast Charging + MagSafe Wireless</pre></li>
<li><pre>OS:             iOS 17</pre></li>
<li><pre>Security:       Face ID</pre></li>
<li><pre>Connectivity:   5G / Wi-Fi 6E / Bluetooth 5.3 / NFC</pre></li>
<li><pre>Water Proof:    IP68 Dust & Water Resistant</pre></li>
<li><pre>Colors:         Black / Silver / Blue / White</pre></li>
<li><pre>Weight:         187 grams</pre></li>
<li><pre>Price:          ₹1,39,900 (starting)</pre></li>

</ul>

</div>
</div>
</body>
</html>
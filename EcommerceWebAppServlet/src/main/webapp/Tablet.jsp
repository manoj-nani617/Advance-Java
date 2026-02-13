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
<h1>Tablet </h1>
<div class = "container">
    <img 
  src="https://images.unsplash.com/photo-1542751110-97427bbecf20?w=500&q=60"
  alt="Product Image"  style = "max-width : 100%;height : auto";
>
<div class = "buttons">
<a href = "Order.jsp"><button>OrderNow</button></a>
<form action = "AddToCartServlet" method = "post">
        <input type="hidden" name="productId" value="8">
        <input type="hidden" name="productName" value="Tablet">
        <input type="hidden" name="productPrice" value="25000">
        <input type= "hidden" name = "imageurl" value = "https://images.unsplash.com/photo-1542751110-97427bbecf20?w=500&q=60">
        <button type="submit">Add To Cart</button>
</form>
<!-- <a href = "CartPage.jsp"><button>Add Cart</button></a> -->
</div>
<div class = "details">
<h2>📱 Tablet Specifications</h2>

<ul style="list-style:none; font-family:monospace; padding:0;">

<li><pre>Model:          TabPro Max 11</pre></li>
<li><pre>Display:        11-inch 2K IPS LCD (2560 × 1600)</pre></li>
<li><pre>Refresh Rate:   120Hz Smooth Display</pre></li>
<li><pre>Processor:      Snapdragon 8 Gen Series Octa-Core</pre></li>
<li><pre>RAM:            8GB / 12GB LPDDR5</pre></li>
<li><pre>Storage:        128GB / 256GB (Expandable up to 1TB)</pre></li>
<li><pre>Operating OS:   Android 14</pre></li>
<li><pre>Rear Camera:    13MP Primary Camera</pre></li>
<li><pre>Front Camera:   8MP Selfie Camera</pre></li>
<li><pre>Battery:        8000mAh Long-Lasting Battery</pre></li>
<li><pre>Charging:       33W Fast Charging</pre></li>
<li><pre>Speakers:       Quad Stereo Speakers with Dolby Audio</pre></li>
<li><pre>Connectivity:   Wi-Fi 6 / Bluetooth 5.2 / USB-C</pre></li>
<li><pre>Network:        Wi-Fi Only / 5G Variant Available</pre></li>
<li><pre>Security:       Face Unlock / Fingerprint Sensor</pre></li>
<li><pre>Accessories:    Stylus Pen & Keyboard Support</pre></li>
<li><pre>Weight:         480 grams</pre></li>
<li><pre>Color:          Space Grey / Silver / Blue</pre></li>
<li><pre>Warranty:       1 Year Manufacturer Warranty</pre></li>
<li><pre>Price:          ₹24,999 (starting)</pre></li>

</ul>

</div>
</div>
</body>
</html>
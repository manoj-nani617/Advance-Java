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
<h1>Keyboard </h1>
<div class = "container">
    <img 
  src="https://images.unsplash.com/photo-1587829741301-dc798b83add3?w=500&q=60"
  alt="Product Image"  style = "max-width : 100%;height : auto";
>
<div class = "buttons">
<a href = "Order.jsp"><button>OrderNow</button></a>
<form action = "AddToCartServlet" method = "post">
        <input type="hidden" name="productId" value="10">
        <input type="hidden" name="productName" value="Keyboard">
        <input type="hidden" name="productPrice" value="65000">
        <input type= "hidden" name = "imageurl" value = "https://images.unsplash.com/photo-1587829741301-dc798b83add3?w=500&q=60">
        <button type="submit">Add To Cart</button>
        
</form>
</div>
<div class = "details">
<h2>⌨️ Keyboard Specifications</h2>

<ul style="list-style:none; font-family:monospace; padding:0;">

<li><pre>Model:          KeyPro X Mechanical Keyboard</pre></li>
<li><pre>Type:           Mechanical Gaming Keyboard</pre></li>
<li><pre>Connectivity:   Wired USB / Bluetooth 5.0 (Dual Mode)</pre></li>
<li><pre>Keys:           104 Full Size Keys</pre></li>
<li><pre>Switch Type:    Blue / Red / Brown Mechanical Switches</pre></li>
<li><pre>Backlight:      RGB LED Backlit (16.8M Colors)</pre></li>
<li><pre>Lighting Modes: 20+ Custom Lighting Effects</pre></li>
<li><pre>Key Life:       50 Million Keystrokes</pre></li>
<li><pre>Anti-Ghosting:  Full N-Key Rollover Support</pre></li>
<li><pre>Response Time:  1ms Fast Response</pre></li>
<li><pre>Material:       Aluminum Top + ABS Plastic Body</pre></li>
<li><pre>Layout:         Standard QWERTY Layout</pre></li>
<li><pre>Compatibility:  Windows / Mac / Linux</pre></li>
<li><pre>Cable Length:   1.5 meters Braided Cable</pre></li>
<li><pre>Weight:         850 grams</pre></li>
<li><pre>Color:          Black / White</pre></li>
<li><pre>Included:       Keyboard + Keycap Puller + Manual</pre></li>
<li><pre>Warranty:       1 Year Manufacturer Warranty</pre></li>
<li><pre>Price:          ₹1,299 (starting)</pre></li>

</ul>

</div>
</div>
</body>
</html>
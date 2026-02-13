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
<h1>Monitor </h1>
<div class = "container">
    <img 
  src="https://images.unsplash.com/photo-1527443224154-c4a3942d3acf?w=600&q=60"
  alt="Product Image"  style = "max-width : 100%;height : auto";
>
<div class = "buttons">
<a href = "Order.jsp"><button>OrderNow</button></a>
<form action = "AddToCartServlet" method = "post">
        <input type="hidden" name="productId" value="14">
        <input type="hidden" name="productName" value="Monitor">
        <input type="hidden" name="productPrice" value="65000">
        <input type= "hidden" name = "imageurl" value = "https://images.unsplash.com/photo-1527443224154-c4a3942d3acf?w=600&q=60">
        <button type="submit">Add To Cart</button>
        
</form>
</div>
<div class = "details">
<h2>🖥 Monitor Specifications</h2>

<ul style="list-style:none; font-family:monospace; padding:0;">

<li><pre>Model:           VisionPro 27 Ultra</pre></li>
<li><pre>Screen Size:     27 inches</pre></li>
<li><pre>Resolution:      2560 × 1440 (QHD)</pre></li>
<li><pre>Panel Type:      IPS LED</pre></li>
<li><pre>Refresh Rate:    165Hz</pre></li>
<li><pre>Response Time:   1 ms</pre></li>
<li><pre>Aspect Ratio:    16:9</pre></li>
<li><pre>Brightness:      350 cd/m²</pre></li>
<li><pre>Contrast Ratio:  1000:1</pre></li>
<li><pre>Color Gamut:     sRGB 99% / DCI-P3 90%</pre></li>
<li><pre>Connectivity:    HDMI ×2 / DisplayPort / USB-C</pre></li>
<li><pre>Speakers:        Built-in Stereo Speakers</pre></li>
<li><pre>Stand:           Adjustable Tilt & Height</pre></li>
<li><pre>VESA Mount:      100 × 100 mm</pre></li>
<li><pre>Sync Tech:       FreeSync / Adaptive Sync</pre></li>
<li><pre>Power:           100–240V AC</pre></li>
<li><pre>Warranty:        1 Year Manufacturer Warranty</pre></li>
<li><pre>Price:           ₹19,999 (starting)</pre></li>

</ul>


</div>
</div>
</body>
</html>
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
  src="https://images.unsplash.com/photo-1605100804763-247f67b3557e?w=600&q=60"
  alt="Product Image"  style = "max-width : 100%;height : auto";
>
<div class = "buttons">
<a href = "Order.jsp"><button>OrderNow</button></a>
<form action = "AddToCartServlet" method = "post">
        <input type="hidden" name="productId" value="11">
        <input type="hidden" name="productName" value="Ring">
        <input type="hidden" name="productPrice" value="4999">
        <input type= "hidden" name = "imageurl" value = "https://images.unsplash.com/photo-1605100804763-247f67b3557e?w=600&q=60">
        <button type="submit">Add To Cart</button>
        
</form>
</div>
<div class = "details">
<h2>💍 Ring Specifications</h2>

<ul style="list-style:none; font-family:monospace; padding:0;">

<li><pre>Model:           Elegant Shine Ring</pre></li>
<li><pre>Type:            Fashion / Statement Ring</pre></li>
<li><pre>Material:        Sterling Silver / Stainless Steel</pre></li>
<li><pre>Plating:         Gold Plated / Rhodium Plated</pre></li>
<li><pre>Stone:           Cubic Zirconia / Gemstone (Optional)</pre></li>
<li><pre>Finish:          Polished Glossy Finish</pre></li>
<li><pre>Finger Size:     Adjustable / Standard Sizes 6–12</pre></li>
<li><pre>Weight:          3–7 grams (approx.)</pre></li>
<li><pre>Color Options:   Silver / Gold / Rose Gold</pre></li>
<li><pre>Occasion:        Party / Wedding / Daily Wear</pre></li>
<li><pre>Packaging:       Jewelry Box + Cleaning Cloth</pre></li>
<li><pre>Warranty:        3 Months Manufacturer Warranty</pre></li>
<li><pre>Care Instructions: Avoid Water / Chemicals</pre></li>
<li><pre>Price:           ₹799 (starting)</pre></li>

</ul>

</div>
</div>
</body>
</html>
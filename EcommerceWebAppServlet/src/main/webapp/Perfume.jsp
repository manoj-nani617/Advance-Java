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
<h1>Perfume </h1>
<div class = "container">
    <img 
  src="https://images.unsplash.com/photo-1585386959984-a4155224a1ad?w=500&q=60"
  alt="Product Image"  style = "max-width : 100%;height : auto";
>
<div class = "buttons">
<a href = "Order.jsp"><button>OrderNow</button></a>
<form action = "AddToCartServlet" method = "post">
        <input type="hidden" name="productId" value="6">
        <input type="hidden" name="productName" value="Perfume">
        <input type="hidden" name="productPrice" value="65000">
        <input type= "hidden" name = "imageurl" value = "https://images.unsplash.com/photo-1585386959984-a4155224a1ad?w=500&q=60">
        <button type="submit">Add To Cart</button>
        
</form>
</div>
<div class = "details">
<h2>🌸 Perfume Specifications</h2>

<ul style="list-style:none; font-family:monospace; padding:0;">

<li><pre>Model:          Aroma Luxe Premium</pre></li>
<li><pre>Type:           Eau De Parfum (EDP)</pre></li>
<li><pre>Fragrance:      Floral Woody Musk</pre></li>
<li><pre>Volume:         100 ml</pre></li>
<li><pre>Gender:         Unisex</pre></li>
<li><pre>Top Notes:      Citrus, Bergamot, Lemon</pre></li>
<li><pre>Middle Notes:   Rose, Jasmine, Lavender</pre></li>
<li><pre>Base Notes:     Musk, Vanilla, Sandalwood</pre></li>
<li><pre>Longevity:      Up to 8–10 Hours</pre></li>
<li><pre>Strength:       Long Lasting Strong Scent</pre></li>
<li><pre>Alcohol Free:   No</pre></li>
<li><pre>Skin Type:      Suitable for All Skin Types</pre></li>
<li><pre>Occasion:       Daily Wear / Party / Office</pre></li>
<li><pre>Bottle Type:    Glass Spray Bottle</pre></li>
<li><pre>Weight:         250 grams (with bottle)</pre></li>
<li><pre>Packaging:      Premium Gift Box</pre></li>
<li><pre>Warranty:       No Warranty (Hygiene Product)</pre></li>
<li><pre>Price:          ₹1,499 (starting)</pre></li>

</ul>

</div>
</div>
</body>
</html>
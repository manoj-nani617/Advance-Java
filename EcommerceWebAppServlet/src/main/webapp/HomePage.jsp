<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>E-Shop | Home</title>
  <link rel="stylesheet" href="Homepage.css">
</head>
<body>

<!-- HEADER -->
<header class="header">
  <h1 class="logo">E-Shop</h1>

  <input type="text" class="search" placeholder="Search products...">

  <div class="cart">
    <a href = "AddToCart.jsp">🛒 Cart</a>
  </div>
  <a href="HomePage.jsp">Home</a>
  <a href="##">Profile</a>
  <a id = "logout">Logout</a>
</header>



<!-- PRODUCTS -->
<section class="products">
<a href = "SmartPhone.jsp">
  <div class="product">
   <img 
  src="https://images.unsplash.com/photo-1591337676887-a217a6970a8a?w=500&q=60"
  alt="Product Image" style = "max-width : 100%;height : auto"
>

    <h3>Iphone 15</h3>
    <p>₹25,000</p>
   
  </div>
</a>
<a href = "Laptop.jsp">
  <div class="product">
    <img src="https://images.unsplash.com/photo-1517336714731-489689fd1ca8?w=500&q=60">
    <h3>Laptop</h3>
    <p>₹65,000</p>
  </div>
</a>
<a href = "HeadPhone.jsp">
  <div class="product">
    <img src="https://images.unsplash.com/photo-1505740420928-5e560c06d30e?w=500&q=60" alt="Product">
    <h3>Head Phones</h3>
    <p>₹4,999</p>
  </div>
  </a>
  <a href = "BackPack.jsp">
   <div class="product">
    <img src="https://images.unsplash.com/photo-1548036328-c9fa89d128fa?w=500&q=60" alt="Product">
    <h3>BackPack</h3>
    <p>₹25,000</p>
  </div>
  </a>
<a href = "Sunglasses.jsp">
  <div class="product">
    <img src="https://images.unsplash.com/photo-1511499767150-a48a237f0083?w=500&q=60" alt="Product">
    <h3>SunGlasses</h3>
    <p>₹2,999</p>
  </div>
</a>
<a href = "Perfume.jsp">
  <div class="product">
    <img src="https://images.unsplash.com/photo-1585386959984-a4155224a1ad?w=500&q=60" alt="Product">
    <h3>Perfume</h3>
    <p>₹65,000</p>
  </div>
  </a>
<a href = "GamingController.jsp">
  <div class="product">
    <img src="https://images.unsplash.com/photo-1592840496694-26d035b52b48?w=500&q=60" alt="Product">
    <h3>Gaming Controller</h3>
    <p>₹4,999</p>
  </div>
  </a>
  <a href = "Tablet.jsp">
    <div class="product">
    <img src="https://images.unsplash.com/photo-1542751110-97427bbecf20" alt="Product">
    <h3>Tablet</h3>
    <p>₹25,000</p>
  </div>
  </a>
<a href = "Mouse.jsp">
  <div class="product">
    <img src="https://images.unsplash.com/photo-1615663245857-ac93bb7c39e7?w=500&q=60" alt="Product">
    <h3>Mouse</h3>
    <p>₹2,999</p>
  </div>
  </a>
<a href = "Keyboard.jsp">
  <div class="product">
    <img src="https://images.unsplash.com/photo-1587829741301-dc798b83add3?w=500&q=60" alt="Product">
    <h3>KeyBoard</h3>
    <p>₹65,000</p>
  </div>
  </a>
  <a href = "Ring.jsp">
    <div class="product">
    <img src="https://images.unsplash.com/photo-1605100804763-247f67b3557e?w=600&q=60" alt="Product">
    <h3>Ring</h3>
    <p>₹4,999</p>
  </div>
  </a>
  <a href = "Shoes.jsp">
    <div class="product">
    <img src="https://images.unsplash.com/photo-1542291026-7eec264c27ff?w=600&q=60" alt="Product">
    <h3>Shoes</h3>
  </div>
  </a>
<a href = "Belt.jsp">
  <div class="product">
    <img src="https://images.unsplash.com/photo-1624222247344-550fb60583dc?w=600&q=60" alt="Product">
    <h3>Belt</h3>
    <p>₹2,999</p>
  </div>
</a>
<a href = "Monitor.jsp">
  <div class="product">
    <img src="https://images.unsplash.com/photo-1527443224154-c4a3942d3acf?w=600&q=60" alt="Product">
    <h3>Monitor</h3>
    <p>₹65,000</p>
  </div>
  </a>

</section>

<!-- FOOTER -->
<footer class="footer">
  © 2026 E-Shop. All rights reserved.
</footer>
<script src = "HomePage.js"></script>
</body>
</html>

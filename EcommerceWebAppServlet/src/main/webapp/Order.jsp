<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Order Placed</title>

    <style>
        *{
            box-sizing:border-box;
            margin:0;
            padding:0;
            font-family: Arial, Helvetica, sans-serif;
        }

        body{
            height:100vh;
            display:flex;
            justify-content:center;
            align-items:center;
            background:linear-gradient(135deg,#e8f5e9,#c8e6c9);
        }

        .order-box{
            background:white;
            width:380px;
            text-align:center;
            padding:40px 30px;
            border-radius:12px;
            box-shadow:0 8px 18px rgba(0,0,0,0.15);
        }

        .icon{
            font-size:70px;
            margin-bottom:15px;
        }

        h2{
            color:#2e7d32;
            margin-bottom:10px;
        }

        .amount{
            font-size:18px;
            margin:15px 0;
            font-weight:bold;
        }

        .btn{
            display:inline-block;
            margin-top:20px;
            background:#2e7d32;
            color:white;
            padding:10px 18px;
            text-decoration:none;
            border-radius:6px;
        }

        .btn:hover{
            background:#1b5e20;
        }
    </style>
</head>
<body>

<div class="order-box">

    <div class="icon">✅</div>

    <h2>Order Placed Successfully!</h2>

    <p>Thank you for shopping with us</p>

    <div class="amount">
        Total Paid: ₹ <span id="total"></span>
    </div>

    <a href="HomePage.jsp" class="btn">Continue Shopping</a>

</div>


<script>
    let cart = JSON.parse(localStorage.getItem("cart")) || [];

    let total = 0;

    cart.forEach(item => total += item.price);

    document.getElementById("total").innerText = total;

    // clear cart after order
    localStorage.removeItem("cart");
</script>

</body>
</html>

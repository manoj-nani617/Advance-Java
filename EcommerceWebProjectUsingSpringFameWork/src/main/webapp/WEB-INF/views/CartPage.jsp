<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Added to Cart</title>

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

        .box{
            background:white;
            width:360px;
            padding:40px 30px;
            text-align:center;
            border-radius:12px;
            box-shadow:0 6px 18px rgba(0,0,0,0.15);
        }

        .icon{
            font-size:70px;
            margin-bottom:15px;
        }

        h2{
            color:#2e7d32;
            margin-bottom:10px;
        }

        p{
            color:#555;
            margin-bottom:25px;
        }

        .buttons{
            display:flex;
            justify-content:space-between;
            gap:10px;
        }

        .btn{
            flex:1;
            text-decoration:none;
            padding:10px 0;
            border-radius:6px;
            color:white;
            font-size:14px;
        }

        .shop{
            background:#607d8b;
        }

        .cart{
            background:#2e7d32;
        }

        .btn:hover{
            opacity:0.9;
        }
    </style>
</head>
<body>

<div class="box">

    <div class="icon"></div>

    <h2>Added to Cart!</h2>

    <p>Your item has been successfully added to the cart.</p>

    <div class="buttons">
        <a href="HomePage.jsp" class="btn shop">Continue Shopping</a>
        <a href="AddToCart.jsp" class="btn cart">Go to Cart</a>
    </div>

</div>


<!-- Optional auto redirect after 3 seconds -->
<script>
    // Uncomment below if you want auto redirect
    // setTimeout(() => {
    //     window.location.href = "cart.html";
    // }, 3000);
</script>

</body>
</html>

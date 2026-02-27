
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Form</title>
	<link rel ="stylesheet" href = "login.css">
</head>
<body>

<div class="login-container">
    <h2>Login</h2>
    <form method="post" action="LoginServlet">
        <label for="username">Email:</label>
        <input type="text" id="username" name="email" id = "email" required >

        <label for="password">Password:</label>
        <input type="password" id="pass" name="password" id = "pass" required>

        <input type="submit" value="Login">
        <span class = "register">Have you not registered?  <a href = "Register.jsp">Register</a></span> 
    </form>
</div>

</body>
</html>

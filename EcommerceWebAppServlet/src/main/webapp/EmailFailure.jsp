
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Form</title>
	<style>
	@charset "UTF-8";

body {
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #74ebd5, #9face6);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            font-weight : bold;
        }
        .login-container {
            background-color: white;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
            width: 300px;
        }
        .login-container .error {
        width : 100%;
        height :20px;
        color : red;
        text-align : center;
        
        }
        .login-container h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        .login-container input[type="text"],
        .login-container input[type="password"] {
            width: 100%;
            padding: 8px 10px;
            margin: 8px 0 15px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        .login-container input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 4px;
            font-weight : bold;
            cursor: pointer;
            margin-bottom : 10px;
        }
        .login-container input[type="submit"]:hover {
            background-color: #0056b3;
        }
	
	</style>
</head>
<body>

<div class="login-container">
	<div class = "error">Email doesn't Exist</div>
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

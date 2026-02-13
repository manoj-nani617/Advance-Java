<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<style>

body {
	
	margin: 0;
	height: 100vh;
	font-family: Arial, sans-serif;
	background: linear-gradient(135deg, #74ebd5, #9face6);
	display: flex;
	justify-content: center;
	align-items: center;

}

.register-box {
	
	background: white;
	padding: 35px 45px;
	border-radius: 12px;
	box-shadow: 0 10px 25px rgba(0, 0, 0, 0.25);
	width: 350px;
	
}
.register-box .error {
	width : 100%;
	height : 20px;
	text-align : center;
	color : red;
	font-weight : bold;
}

.register-box h2 {
	text-align: center;
	margin-bottom: 25px;
	color: #333;
}

label {
	font-weight: bold;
}
#errorMsg{
	height : 15px;
	width : 100%;
	margin-bottom :10px;
	border : 1px solid black;
	color : red;
	
}
input {
	width: 100%;
	padding: 10px;
	margin: 8px 0 15px;
	border: 1px solid #ccc;
	border-radius: 5px;
}

button {
	width: 100%;
	padding: 10px;
	border: none;
	background: #3498db;
	color: white;
	font-size: 16px;
	border-radius: 5px;
	cursor: pointer;
}

button:hover {
	background: #2d83c5;
}

.login-link {
	text-align: center;
	margin-top: 15px;
}

.login-link a {
	color: #3498db;
	text-decoration: none;
	font-weight: bold;
}


</style>
</head>
<body>

<div class="register-box">

	<div class ="error">Email Already Exist</div>
    <h2>Register</h2>

    <form method="post" action="RegisterServlet" onsubmit = "return  submitForm()">
        <label>Username</label>
        <input type="text" name="username" id = "user"  required>

        <label>Email</label>
        <input type="email" name="email" id = "email" required>

        <label>Password</label>
        <input type="password" name="password" id = "pass" required>

        <label>Confirm Password</label>
        <input type="password" name="confirmPassword" id = "confirmPassword" required>


        <button type="submit" id = "submit">Register</button>
    </form>

    <div class="login-link">
        Already registered?
        <a href="Login.jsp">Login</a>
    </div>
</div> 

<script src = "Register.js"></script>
</body>
</html>

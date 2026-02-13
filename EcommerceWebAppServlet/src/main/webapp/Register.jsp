<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<link rel = "stylesheet" href = "Register.css">
</head>
<body>

<div class="register-box">
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

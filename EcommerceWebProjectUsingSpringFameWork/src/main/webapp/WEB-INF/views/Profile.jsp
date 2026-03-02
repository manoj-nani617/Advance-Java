<%@ page import="com.techouts.entity.User" %>
<%@ page session="true" %>

<% User user = (User)session.getAttribute("user"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Profile</title>

<style>
body{
    font-family: Arial;
    background-color: #f5f5f5;
    display : flex;
    flex-direction : column;
    justify-content : center;
}
.home {
	width : 100px;
	height : 30px;
	background : #007bff;
	border-radius : 10px;
	color : white;
	border : none;
	outline : none;

}
.header-container {
	background :  #007bff;
	width 100%;
	height : 50px;
	border-radius : 10px;
	display : flex;
	justify-content : space-between;
}
.logo {

	width : 300px;
	height : 50px;
	display : flex;
	justify-content: center;
	align-items : center;
	color : white;

	
}
.button-container {
	width : 400px;
	height : 50x;
	display : flex;
	justify-content : space-between;
	align-items: center;
	
}
.button-container button {
	width :100px;
	height : 30px;
	background : white;
	outline : none;
	border :none;
	color : black;
	border-radius : 10px;
	box-shadow: 0 2px 8px rgba(0,0,0,0.1);
    transition: transform 0.2s, box-shadow 0.2s;
}
.button-container button:hover {
	transform: translateX(-1px);
    box-shadow: 0 6px 12px rgba(0,0,0,0.2);
	
}
.container{
    width: 400px;
    margin: 80px auto;
    background: white;
    padding: 30px;
    border-radius: 8px;
    box-shadow: 0 0 10px #ccc;
   
}

h2{
    text-align: center;
}

.profile-item{
    margin: 15px 0;
    font-size: 16px;
}

.label{
    font-weight: bold;
}

.logout-btn{
   width : 100%;
   height : 50px;
   display : flex;
   justify-content : center;
   align-items : center;
   margin-top : 30px;
}
.logout-btn button {
	width : 200px;
	height : 30px;
	background : #007bff;
	border-radius : 10px;
	color : white;
	border : none;
	outline : none;
}
</style>

</head>
<body>
	<div class="header-container">
		<div class = "logo">
		<h2>MVR Products</h2>
		</div>
		<div class = "button-container">
		<a href = "ViewCartServlet"><button>Cart</button></a>
		<a href = "Profile.jsp"><button>Profile</button></a>
		<a href = "LogoutServlet"><button>Logout</button></a>
		
		</div>
	</div>
<div class="container">
    <h2>My Profile</h2>
	
    <div class="profile-item">
        <span class="label">User ID:</span>
        <%= user.getUserId() %>
    </div>

    <div class="profile-item">
        <span class="label">Name:</span>
        <%= user.getUserName() %>
    </div>

    <div class="profile-item">
        <span class="label">Email:</span>
        <%= user.getEmail() %>
    </div>

    <div class="profile-item">
        <span class="label">Phone:</span>
       <%= user.getPhoneNumber() %>
    </div>

    <div class="logout-btn">
        <a href="${pageContext.request.contextPath}"><button>Logout</button></a>
    </div>
</div>

</body>
</html>
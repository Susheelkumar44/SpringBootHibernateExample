<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="\images\paris3.jpg">
<div class="login-form-controller" id="login-form">
	<div class="login-form-content">
		<div class="logo">
			<center> <img src="\images\mmt.png"> </center>
		</div>
		<h3> <b> <center> LOGIN TO YOUR ACCOUNT </center> <b></h3>
	</div>
	<form>
	<div class="input-container">
	<i class="class1"> </i>
	<center> Email-Id <input type="email" class="input" name="emailId" placeholder="Enter Your Mail-Id"> </center>
	</div> 
	<br>
	<div class="input-container1">
	<i class="class2"> </i>
	<center> Password <input type="password" class="login-password" name="password" placeholder="Enter Your Password"> </center>
	</div> 
	<br>
			<center> <input type="submit" name="login" value="Login" class="button"/>
			<a href="getAllCustomers" class="register"> SignUp </a> </center>
	</form>
</div>

</body>
</html>
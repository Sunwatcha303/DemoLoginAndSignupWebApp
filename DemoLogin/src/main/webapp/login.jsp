<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="login-style.css">

<title>Login</title>
</head>
<body>
	<div class="login-body">
		<div class="login-box">
			<div class="login-form">
				<h1>Log in</h1>
				<div class="login-form-box">
					<form action="http://localhost:8080/DemoLogin/Login" method="post" class="login-form-box">
						<div class="box-login">
							<input type="text" name="username" id="uid-input" placeholder="Enter Username/Email" class="input" required>
						</div>
						<div class="box-login">
							<div class="password-label" id="password-box">
								<input type="password" name="password" placeholder="Enter Password" value="" class="input" id="password-input">
								<button type="button" id="toggle-password" class="visibility-box">SHOW</button>
							</div>
							
						</div>
						<div class="box-login">
							<button type="submit" name="submit" class="input button-box" id="form-submit">Log in</button>
						</div>
						
					</form>
					<a href="signup.jsp">Sign up</a>
					<%
						if(request.getQueryString() != null){
							out.print("<p style=\"color: red;\">Invalid username or password</p>");
						}						
					%>
					
				</div>
			</div>
		</div>
	</div>
	<script src="login-script.js"></script>
</body>
</html>
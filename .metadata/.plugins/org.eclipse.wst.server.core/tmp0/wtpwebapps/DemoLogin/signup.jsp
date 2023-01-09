<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="signup-style.css">
<title>SignUp</title>
</head>
<body>
	<div class="signup-body">
		<div class="signup-box">
			<div class="signup-form">
				<h1>Sign up</h1>
				<div class="signup-form-box">
					<form action="http://localhost:8080/DemoLogin/Signup" method="post" class="signup-form-box">
						<div class="box-signup">
							<input type="text" name="fname" placeholder="Enter First Name" class="input" required>			
						</div>
						<div class="box-signup">
							<input type="text" name="lname" placeholder="Enter Last Name" class="input" required>
						</div>
						<div class="box-signup">
							<input type="text" name="email" placeholder="Enter email" class="input" required>
						</div>
						<div class="box-signup">
							<input type="text" name="username" placeholder="Enter Username" class="input" required>
						</div>
						<div class="box-signup">
							<input type="password" name="password" placeholder="Enter Password" class="input" required>
						</div>
						<div class="box-signup">
							<input type="password" name="repassword" placeholder="Enter RepeatPassword" class="input" required>				
						</div>
						<div class="box-signup">
							<button type="submit" name="submit" class="input button-box">Sign Up</button>
						</div>
					</form>
					<a href="login.jsp" class="box-login">cancel</a>
					<%
						if(request.getQueryString() != null){
							out.print("<p style=\"color: red;\">"+request.getQueryString()+"</p>");
						}						
					%>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="index-style.css">
<title>Main page</title>
</head>
<body>
	
	<div class="container">
		<div class="container-a">
			<h1>WELCOME</h1>
			<div>
				<% if(session.getAttribute("user") != null){
						out.print(session.getAttribute("user"));
					}
				else{
					response.sendRedirect("login.jsp");
				}
				%>		
			</div>
			<div>
				<a href="Logout">Log out</a>
			</div>
		</div>
	</div>
</body>
</html>
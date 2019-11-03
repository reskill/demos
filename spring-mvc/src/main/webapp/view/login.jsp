<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	Login Page
	
	<form action="/myapp/checklogin" method="post">
	<font color="red">${name}</font>
		Enter Login Id: <input type="text" name="loginId"><br>
		Enter Password: <input type="password" name="password" ><br>
		<input type="submit" value="Login">		
		
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	Welcome to the login page!
	
	
	<pre>${errorMessage}</pre>
	<form method="post">
		Name: <input type="text" name="name"><br/>
		Password: <input type="password" name="password">
		<input type="submit">
	</form>
</body>
</html>
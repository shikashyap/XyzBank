<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="bg.css">
</head>
<body>
  <form action="customer/pass" method="post">
	<h3>Adding Operation</h3>
	Enter Previous Password
	<input type="text" name="previouspassword">
	Enter New Password
	<input type="text" name="password">
	<input type="submit" value="change">
	</form>
</body>
</html>
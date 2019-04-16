<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="bg1.css">
</head>
<body>
<form action="../customer/saveee" method="Post">
		Customer Name<input type="text" name="name" required autofocus /> <br>
		Customer Password<input type="text" name="password"> 
		<input type="submit" value="add customer">
		
	</form>
</body>
</html>
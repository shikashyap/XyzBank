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
<form action="customer/transfer" method="post">
	<h3>WithDraw Operation</h3>
	Enter Account id of the Receiver 
	<input type="number" name="id">
	Enter Money to transfer
	<input type="number" name="money"> 
	<input type="submit" value="transfer">
	</form>
</body>
</html>
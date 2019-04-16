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
<h3>Updated Balance</h3>
	<table border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>BALANCE</th>
				
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${AA.id}</td>
				<td>${AA.name}</td>
				<td>${AA.balance}</td>
			</tr>
		</tbody>
	</table>
	<a href="../home.jsp" >Home</a>
</body>
</html>
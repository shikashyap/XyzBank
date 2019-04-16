<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="bg.css">
</head>
<body>
<h3>list of Transaction Details</h3>
	<table border="1">
		<thead>
			<tr>
				<th>Transaction Id</th>
				<th>Amount</th>
				<th>Type </th>
		
			</tr>
		</thead>
		<tbody>
			<c:forEach var="print" items="${PRINT}">
				<tr>
					<td>${print.id}</td>
					<td>${print.amount}</td>
					<td>${print.type}</td>
					
					
				</tr>
			</c:forEach>
			</table>
			<a href="../home.jsp" >Home</a>
</body>
</html>
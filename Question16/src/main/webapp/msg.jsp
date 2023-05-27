<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Student Details</h1>
	<table border="1">
		<tr>
			<td>Name</td>
			<td>${name }</td>
		</tr>
		<tr>
			<td>Age</td>
			<td>${age }</td>
		</tr>
		<tr>
			<td>Address</td>
			<td>${address }</td>
		</tr>
	</table>
<a href="./details">|CLICK ON THE LINK TO GET MORE DETAILS|</a>


</body>
</html>
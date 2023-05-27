<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>


</head>
<body bgcolor="#F0F8FF">
	<br>
	<h1 style="text-align: center;">Admin Data</h1>
	<br>
	<table border="1" align="center" >
		<tr>
			<th>ID</th>
			<th>name</th>
			<th>age</th>
			<th>address</th>
			<th>gender</th>
			<th>mail</th>
		</tr>
		<tr>
			<td>${adminData.id }</td>
			<td>${adminData.name }</td>
			<td>${adminData.age }</td>
			<td>${adminData.address }</td>
			<td>${adminData.gender }</td>
			<td>${adminData.mail }</td>
		</tr>

	</table>
	<br>


</body>
</html>
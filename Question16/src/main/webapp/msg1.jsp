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
			<td>NAME</td>
			<td>${name }</td>
		</tr>
		<tr>
			<td>AGE</td>
			<td>${age }</td>
		</tr>
		<tr>
			<td>ADDRESS</td>
			<td>${address }</td>
		</tr>
		<tr>
			<td>BRANCH</td>
			<td>${branch }</td>
		</tr>
		<tr>
			<td>FAVORITE SPORT</td>
			<td>${favoriteSport }</td>
		</tr>
	</table>


</body>
</html>
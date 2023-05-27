<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightyellow">

	<h1 style="text-align: center;">WELCOME TO INEURON BLOGS</h1>

	<c:if test="${! empty message }">
		<h1 style="text-align: center; color: red;">${message}</h1>
	</c:if>

	<form method="post" action="./view">
		<table align="center">
			<tr>
				<td>ENTER BLOG ID TO DISPLAY YOUR DETAILS</td>
				<td><input type="number" name="blogid" required="required"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit"></td>
			</tr>

		</table>
	</form>
</body>
</html>
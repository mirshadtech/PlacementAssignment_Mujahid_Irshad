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
	<br>
	<h2 style="text-align: center;">YOUR BLOG INFO</h2>

	<c:if test="${! empty blogData }">

		<table align="center" border="1">
		<tr>
				<td>BLOG ID</td>
				<td>${blogData.id }</td>
			</tr>
			<tr>
				<td>BLOG TITLE</td>
				<td>${blogData.blogTitle }</td>
			</tr>
			<tr>
				<td>BLOG BLOGDESCRIPTION</td>
				<td>${blogData.blogDescription }</td>
			</tr>
			<tr>
				<td>BLOG CONTENT</td>
				<td>${blogData.content }</td>
			</tr>

		</table>
	</c:if>
	<h1 style="text-align: center;"><a href="./index.jsp">|CLICK HERE TO GO HOME PAGE|</a></h1>
</body>
</html>
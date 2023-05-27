<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#669999">
	<h1 style="text-align: center;">Welcome to Admin Registration Page</h1>
	<form:form method="post" modelAttribute="admin" action="/admin/save">
		<table align="center">
		
			<tr>
				<th>NAME</th>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<th>AGE</th>
				<td><form:input path="age" /></td>
			</tr>
			<tr>
				<th>ADDRESS</th>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<th>MAIL</th>
				<td><form:input path="mail" /></td>
			</tr>
			<tr>
				<th>GENDER</th>
				<td><form:radiobutton path="gender" value="Male" label="Male" />
					<form:radiobutton path="gender" value="Female" label="Female" />
				</td>
			</tr>
			<tr>
				<th>PASSWORD</th>
				<td><form:password path="password" /></td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit" value="save" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
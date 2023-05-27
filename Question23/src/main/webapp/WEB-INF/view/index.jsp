<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
<%@ include file="login.css" %>
</style>

</head>
<body bgcolor="#669999">
	<br>
	<h1>Admin login</h1>
	<br>
	<form action="login" method="post">
		<table class="table">
			<tr>
				<th>User Mail</th>

				<td><input type="text" name="adminMail" id=""
					required="required" class="input" placeholder="Enter mail" /></td>
			</tr>

			<tr>
				<th>Password</th>

				<td><input type="password" name="adminPassword" id=""
					required="required" class="input" placeholder="Enter password" /></td>
			</tr>

			<tr>
				<th></th>
				<td><input type="submit" value="sign in" class="loginButton" />
					<a href="registerPage"> <input type="button" value="sign up" class="signUpButton" />
				</a></td>
			</tr>

		</table>
	</form>
	<br>
	<br>
	<h1 style="color: red">
		<c:if test="${message ne null }">
	     	 ${message }
         </c:if>
	</h1>
	<br>
	<h1 style="color: red">
		<c:if test="${status ne null }">
     		 ${status }
        </c:if>
	</h1>

</body>
</html>
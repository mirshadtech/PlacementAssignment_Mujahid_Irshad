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
	<h1 style="text-align: center;">
		<a href="./students">|GET STUDENT DATA|</a>
	</h1>
	<c:if test="${! empty studentList}">
	  <table align="center" border="1">
	    <tr>
	      <th>Student ID</th>
	      <th>Student Name</th>
	      <th>Student Age</th>
	      <th>Student Address</th>
	    </tr>
	    <c:forEach items="${studentList}" var="std"> 
	       <tr>
	        <td>${std.sid }</td>
	        <td>${std.sname }</td>
	        <td>${std.sage }</td>
	        <td>${std.saddress }</td>
	       </tr>
	    </c:forEach>
	  </table>
	</c:if>


</body>
</html>
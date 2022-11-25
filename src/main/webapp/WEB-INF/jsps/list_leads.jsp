<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list leads</title>
</head>
<body>
<a href="createViewLeadPage">createLeadPage</a>
<table border="1"> 
<tr><th>FirstName</th>
<th>LastName</th>
<th>Email</th>
<th>Mobile</th>
</tr>
<c:forEach var="lead" items="${leads}">
<tr>
<td><a href="findById?id=${lead.id}">${lead.firstName}</a></td>
<td>${lead.lastName}</td>
<td>${lead.email}</td>
<td>${lead.mobile}</td>
</tr>
</c:forEach>
</table>
</body>
</html>
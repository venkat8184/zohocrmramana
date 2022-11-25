<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create</title>
</head>
<body>
<h2> Create | Lead</h2>
<form action="/saveLead" method="post">
<table>
<tr><td>FirstName:</td><td><input type="text" name="firstName"/></td></tr>
<tr><td>LastName:</td><td><input type="text" name="lastName"/></td></tr>
<tr><td>Email:</td><td><input type="text" name="email"/></td></tr>
<tr><td>Mobile:</td><td><input type="text" name="mobile"/></td></tr>
</table>
Source:
<select name="source">
<option value="online">Online</option>
<option value="tvcommercial">Tv Commercial</option>
<option value="Seminar">Seminar</option>
<option value="newsPaper">NewsPaper</option>
</select>
<input type="submit" value="save"/>
</form>
</body>
</html>
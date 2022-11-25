<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LeadInfo</title>
</head>
<body>
<h2>ContactInfo...</h2>
FirstName:<input type="text" value="${contact.firstName}"><br><br>
LastName:<input type="text" value="${contact.lastName}"><br><br>
Email:<input type="text" value="${contact.email}"><br><br>
Mobile:<input type="text" value="${contact.mobile}"><br><br>
Source:<input type="text" value="${contact.source}"><br><br>
<br>
<form action="composeMail" method="post">
<input type="hidden" name="email" value="${contact.email}">
<input type="submit" value="sendMail">
</form>
</body>
</html>
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
<h2>LeadInfo...</h2>
FirstName:<input type="text" value="${lead.firstName}"><br><br>
LastName:<input type="text" value="${lead.lastName}"><br><br>
Email:<input type="text" value="${lead.email}"><br><br>
Mobile:<input type="text" value="${lead.mobile}"><br><br>
Source:<input type="text" value="${lead.source}"><br><br>
<br>
<form action="composeMail" method="post">
<input type="hidden" name="email" value="${lead.email}">
<input type="submit" value="sendMail">
</form>
<br>
<form action="convertLead" method="post">
<input type="hidden" name="id" value="${lead.id}">
<input type="submit" value="convert">
</form>
</body>
</html>
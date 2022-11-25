<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compose Email</title>
</head>
<body>
<form action="sendMail" method="post">
To:<input type="text" name="to" value="${to}"></input><br><br>
Sub:<input type="text" name="sub"><br><br>
EmailBody:
<textarea name="emailBody" rows="50" cols="50">
</textarea>
<input type="submit" value="send">
</form>
</body>
</html>
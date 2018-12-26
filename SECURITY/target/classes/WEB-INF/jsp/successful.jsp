<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>login successful</h1>
<form action="logout" method="post">
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
<button type="submit">Logout</button>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="vinod" method="get">
		<label>Enter name:- </label>
		<input type="text" name="username">
		<input type="submit">
	</form>
	<form action="vinod" method="post">
		<label>Enter name:- </label>
		<input type="text" name="username">
		<input type="submit">
	</form>

	<h1>${data}</h1>
</body>
</html>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to the online book application</h1>
	<form:form action="/login" modelAttribute="user" method="POST">
		<center>
			<table>
				<tr>
					<td>Enter User Name:</td>
					<td><input type="text" name="uName" /></td>
				</tr>
				<tr>
					<td>Enter Password:</td>
					<td><input type="text" name="password" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Login" /></td>
				</tr>
			</table>
		</center>
	</form:form>
</body>
</html>
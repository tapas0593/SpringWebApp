<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<div align="center">
		<form:form id="loginForm" modelAttribute="login" action="loginProcess"
			method="post">
			<table>
				<tr>
					<td style="font-style: italic; color: red;">${message}</td>
				</tr>
				<tr>
					<td>Username</td>
					<td><form:input path="userName" name="userName" id="userName" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:password path="password" name="password"
							id="password" /></td>
				</tr>
				<tr>
					<td></td>
					<td align="left"><form:button id="login" name="login">Login</form:button></td>
				</tr>

				<tr></tr>
				<tr>
					<td></td>
					<td><a href="index.jsp">Home</a></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>
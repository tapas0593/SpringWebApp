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
		<p style="font-style: italic; color: red;">${message}</p>
		<form action="loginProcess"	method="post">
			<table>
				<tr>
					<td>Username</td>
					<td><input type="text" name="userName"/></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" id="password" /></td>
				</tr>
				<tr>
					<td></td>
					<td align="left"><input type="submit" value="Login"></td>
				</tr>

				<tr></tr>
				<tr>
					<td></td>
					<td><a href="index.jsp">Home</a></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
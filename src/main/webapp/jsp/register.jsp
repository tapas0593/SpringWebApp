
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form:form id="regForm" modelAttribute="user" action="registerProcess"
		method="post">
		<div align="center">
			<table>
				<tr>
					<td>UserName</td>
					<td><form:input path="userName" name="userName" id="userName"
							required="required" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:password path="password" name="password"
							id="password" required="required" /></td>
				</tr>
				<tr>
					<td>First Name</td>
					<td><form:input path="firstName" name="firstName"
							id="firstName" required="required" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><form:input path="lastName" name="lastName" id="lastName"
							required="required" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><form:input path="email" name="email" id="email"
							required="required" /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><form:input path="address" name="address" id="address"
							required="required" /></td>
				</tr>
				<tr>
					<td>Phone</td>
					<td><form:input path="phone" name="phone" id="phone"
							required="required" /></td>
				</tr>

				<tr>
					<td></td>
					<td><form:button id="register" name="register">Register</form:button></td>
				</tr>
				<tr></tr>
				<tr>
					<td></td>
					<td><a href="index.jsp">Home</a></td>
				</tr>
			</table>
		</div>
	</form:form>

</body>
</html>
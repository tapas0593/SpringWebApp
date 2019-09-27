
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form action="registerProcess" method="post">
		<div align="center">
			<table>
				<tr>
					<td>UserName</td>
					<td><input type="text" name="userName" required="required" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" required="required" /></td>
				</tr>
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstName" required="required" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastName" required="required" /></td>

				</tr>
				<tr>
					<td>Email</td>
					<td><input type="email" name="email" required="required"
						pattern="([a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,})"
						title="The email should be in the format eg: email@domain.com" /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" required="required" /></td>
				</tr>
				<tr>
					<td>Phone</td>
					<td><input type="text" name="phone" required="required"
						pattern="[7-9]{1}[0-9]{9}" maxlength="10"
						title="Phone number should be of 10 digits starting with 7, 8, or 9 " /></td>
				</tr>

				<tr>
					<td></td>
					<td><input type="submit" value="Register"></td>
				</tr>
				<tr></tr>
				<tr>
					<td></td>
					<td><a href="index.jsp">Home</a></td>
				</tr>
			</table>
		</div>
	</form>

</body>
</html>
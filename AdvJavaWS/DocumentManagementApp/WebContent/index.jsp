<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DMS</title>
<link rel="stylesheet" type="text/css" href="./css/site.css">
</head>
<body>

<div id="container">
	<table>
		<tr>
			<td><jsp:include page="logo.jsp"/></td>
		</tr>
		<tr>
			<td>
				<table align="center">
					<tr>
						<td>User ID</td>
						<td><input type="text" name="userid" placeholder="Enter User ID"/></td>
					</tr>
					<tr>
						<td>Password</td>
						<td><input type="password" name="password" placeholder="Enter Password"/></td>
					</tr>
					<tr>
						<td colspan="2" style="text-align: right;"><a href="#">Register</a>
						<button>Login</button></td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td><br><br> <jsp:include page="footer.jsp"/> </td>
		</tr>
	</table>

</div>

</body>
</html>
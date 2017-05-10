<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<h1>${headerMessage}</h1>
	<h2>Success :  User Registered with below details!</h2>
	<table>
		<tr>
			<th>Name : </th>
			<th>Contact</th>
			<th>Email Address</th>
			<th>Joining Date</th>
			<th>Skills</th>
		</tr>
		<tr>
			<td>${user.name} </td>
			<td>${user.contact}</td>
			<td>${user.email}</td>
			<td>${user.joiningDate}</td>
			<td>${user.skills}</td>
		</tr>
	
	</table>
	<h2>Address Details</h2>
	<table>
		<tr>
			<th>House No : </th>
			<th>City</th>
			<th>State</th>
			<th>Zip</th>
		</tr>
		<tr>
			<td>${user.userAddress.houseNo} </td>
			<td>${user.userAddress.city}</td>
			<td>${user.userAddress.state}</td>
			<td>${user.userAddress.zip}</td>
		</tr>
	
	</table>
</center>

</body>
</html>
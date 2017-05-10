<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
</head>
<body>
<center>
<h1>${headerMessage}</h1>

<h2>${userRegistrationHeader}</h2>

<span style="color: red;">
	<form:errors path="user.*"></form:errors>
</span>

<form action="./users/processUserRegistration" method="post">

	<table>
		<tr>
			<td>Name: </td>
			<td><input type="text" name="name"/></td>
		</tr>
		<tr>
			<td>Contact: </td>
			<td><input type="text" name="contact"/></td>
		</tr>
		<tr>
			<td>Email: </td>
			<td><input type="text" name="email"/></td>
		</tr>
		<tr>
			<td>Joining Date: </td>
			<td><input type="text" name="joiningDate"/></td>
		</tr>
		<tr>
			<td>Skills: </td>
			<td>
			
			<select name="skills" multiple="multiple">
				<option value="java">java</option>
				<option value="spring">spring</option>
				<option value="hibernate">hibernate</option>
				<option value="javascript">javascript</option>
				<option value="reactjs">reactjs</option>
			</select>
			
			</td>
		</tr>
		
		<tr>
			<td colspan="2" style="text-align: center;"><span><h2>Add Address Detail</h2></span></td>
		
		</tr>
		
		
		<tr>
			<td>House No</td>
			<td><input type="text" name="userAddress.houseNo"/></td>
		</tr>
		<tr>
			<td>City</td>
			<td><input type="text" name="userAddress.city"/></td>
		</tr>
		<tr>
			<td>State</td>
			<td><input type="text" name="userAddress.state"/></td>
		</tr>
		<tr>
			<td>Zip</td>
			<td><input type="text" name="userAddress.zip"/></td>
		</tr>
		<tr>
			
			<td colspan="2" style="text-align: right;"><input type="submit" value="Register"/></td>
		</tr>
	</table>
	
</form>
</center>

</body>
</html>

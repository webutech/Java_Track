<%@include file="imports.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>contact creation</title>
</head>
<body background="image/bg.jpg">

<table border="1" style="margin: auto;" width="80%">
<tr>
	<td>
		<jsp:include page="header.jsp"/>
		<span style="text-align: right;">
				<%
					User user =(User) session.getAttribute("loggedInUser");
				%>
				welcome: 
				<%=user.getName()%>
			</span>
	</td>
</tr>
<tr>
	<td height="20">
		<jsp:include page="navigation.jsp"/>
	</td>
</tr>
<tr>
	<td height="400" align="center">
		<form action="createContactProcess.jsp" method="post">
			<table border="1">
			<caption>Create New Contact</caption>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" required/></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email" required/></td>
				</tr>
				<tr>
					<td>Phone</td>
					<td><input type="text" name="phone" required/></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" required/></td>
				</tr>
				
				<tr>
					<td>Category</td>
					<td>
						<select name="category">
							<option value="Friend">Friend</option>
							<option value="Family">Family</option>
							<option value="Business">Business</option>
							<option value="Other">Other</option>
						</select>
					</td>
				</tr>
				<tr>
					
					<td colspan="2" style="text-align: right;"><input type="submit" value="Register"/></td>
				</tr>
				
			</table>
		
		</form>
	</td>
</tr>
<tr>
	<td height="10">
		<jsp:include page="footer.jsp"/>
	</td>
</tr>
</table>

</body>
</html>
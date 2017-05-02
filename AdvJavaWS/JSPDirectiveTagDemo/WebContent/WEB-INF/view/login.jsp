<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="80%" height="500px" style="margin:auto;"> 
<tr  height="20">
	<td><%@include file="/WEB-INF/view/header.jsp"%></td>
</tr>
<tr height="100" align="center">
	<td>
		<form action="loginAction.jsp">
			<table border="1">
				<tr>
					<td>User Id</td>
					<td><input type="text" name="userid"/></td>
				</tr>
				<tr>
					<td>password</td>
					<td><input type="password" name="pwd"/></td>
				</tr>
				<tr>
					
					<td colspan="2" align="right"> <a href="#">Registration</a><input type="submit" value="Login"/></td>
				</tr>
			
			</table>
		</form>
	
	</td>
</tr>
<tr  height="10">
	<td><%@include file="/WEB-INF/view/footer.jsp" %></td>
</tr>
</table>
</body>
</html>
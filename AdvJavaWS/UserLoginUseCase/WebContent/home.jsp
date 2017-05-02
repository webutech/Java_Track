<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="80%" height="50%" style="margin: auto;">
		<tr>
			<td><%@include file="header.jsp" %></td>
		</tr>
		<tr>
			<td height="300">
			<center><p style="color: red;"><%=request.getAttribute("errMsg") %></p></center><br>
			<%@include file="login.html" %>
			</td>
		</tr>
		<tr>
			<td><%@include file="footer.jsp" %></td>
		</tr>
	</table>
</body>
</html>
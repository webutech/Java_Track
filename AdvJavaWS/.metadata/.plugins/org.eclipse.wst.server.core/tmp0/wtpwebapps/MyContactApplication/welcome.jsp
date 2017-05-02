<%@page import="com.yash.cms.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
    response.addHeader("Expires", "-1");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="image/bg.jpg">

	<table border="1" style="margin: auto;" width="80%">
		<tr>
			<td>
			<jsp:include page="header.jsp" />
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
			<td height="20"><jsp:include page="navigation.jsp" /></td>
		</tr>
		<tr>
			<td height="400" align="center"><h1>Welocme page</h1>
			</td>
		</tr>
		<tr>
			<td height="10"><jsp:include page="footer.jsp" /></td>
		</tr>
	</table>

</body>

</html>
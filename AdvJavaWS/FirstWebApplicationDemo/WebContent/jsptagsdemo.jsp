<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP tags Demo</title>
</head>
<body>
<h1>JSP Tags Demo</h1>
<hr>
<%-- Example of Declaration tag --%>
<%!
	int count,a,b;
	int sampleFunction(int a){
		return 10+a;
	}
%>

<%-- Example of Scripting Tag --%>
<%
	a=1;
	count++;
	for(int i=1;i<=10;i++){
		out.println("value of i is : "+i+"<br>");
	}
	b=sampleFunction(a);
	out.println("Value retured by sampleFunction is  ---- "+b+"<br>");
%>

This page is access for <%=count %> times.

</body>
</html>
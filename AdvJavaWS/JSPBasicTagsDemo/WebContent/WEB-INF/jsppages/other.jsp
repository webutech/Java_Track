<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>other page</title>
</head>
<body>

<%! int count;
	public void jspInit(){
		ServletConfig servletConfig=getServletConfig();
		count=Integer.parseInt(servletConfig.getInitParameter("count"));
		System.out.println("-----Inside JSPInit()------");
	}
%>
<h2>Use of page,session,out,config and application implicit objects</h2>

count value without using config implicit object :  <b> <%=count %></b> <br>
<%
this.log("log message");
((HttpServlet)page).log("another message");
ServletContext servletContext=config.getServletContext();
out.println("value of sessionvar is = "+"&nbsp;&nbsp;<b>"+session.getAttribute("sessionvar")+"</b><br>");
out.println("Server name and version using config implicit object :&nbsp;&nbsp;<b>"+servletContext.getServerInfo()+"</b><br>");
out.println("value of context parameter param1 get using application implicit object :&nbsp;&nbsp;<b>"+application.getInitParameter("param1")+"</b><br>");
out.println("Count value retrieved using config implicit object :&nbsp;&nbsp;<b>"+config.getInitParameter("count")+"</b><br>");
%>



</body>
</html>
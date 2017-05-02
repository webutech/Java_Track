<%
	int no1=Integer.parseInt(request.getParameter("no1"));
	int no2=Integer.parseInt(request.getParameter("no2"));
	int result=no1+no2;
%>
<jsp:forward page="/result.jsp">
	<jsp:param value="<%=result%>" name="result"/>
</jsp:forward>
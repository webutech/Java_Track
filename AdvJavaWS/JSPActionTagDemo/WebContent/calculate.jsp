<%@page errorPage="/home.html" %>
<%
	String submit=request.getParameter("submit");	
	if(submit.equals("Add")){
	%>
	<jsp:forward page="/addjsp.jsp"/>
	<%}
	else if(submit.equals("Sub")){
	%>
	<jsp:forward page="/subjsp.jsp"/>
	<%}
	else{
	%>
	<jsp:forward page="/home.html"/>
	<%}%>
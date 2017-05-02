<%
	session.invalidate();
	pageContext.forward("index.jsp?msg=User Logged out successfully!");
%>
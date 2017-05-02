<%@include file="imports.jsp" %>
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
			<td height="400" align="center">
				 <form action="contactAction.jsp">

                        <input type="submit" name="btnDeleteSelected" value="Delete Selected Records"/>
                         <table border="1" cellspacing="3" cellpadding="3">
                            <tr>
                                <th>SR</th>
                                <th>SELECT</th>
                                <th>NAME</th>
                                <th>PHONE</th>
                                <th>EMAIL</th>
                                <th>ADDRESS</th>
                                <th>CATEGORY</th>
                                <th>ACTION</th>
                            </tr>
                            <%
                           int i=0;
                    %>
                    <c:forEach items="${requestScope.contactList}" var="contact">
                    	<tr>
                                    <td><%=++i%></td>
                                    <td><input type="checkbox" name="contactIds" value="${contact.contactid}"></td>
                                    <td>${contact.name}</td>
                                    <td>${contact.phone}</td>
                                    <td>${contact.email}</td>
                                    <td>${contact.address}</td>
                                    <td>${contact.category}</td>
                                    <td> <a href="editView.jsp?contactid=${contact.contactid}"> Edit </a> | <a href="deleteContact.jsp?contactid=${contact.contactid}"> Delete </a> </td>
                                </tr>
                    </c:forEach>
                        
                 </form>
			</td>
			</tr>
			</table>
			</tr>
			
			<tr>
			<td height="10"><jsp:include page="footer.jsp" /></td>
			</tr>
		
		
	</table>

</body>
</html>